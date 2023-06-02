package Personal.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class KYJ_0607_DB extends JFrame implements ActionListener {
	// 컴포넌트 선언부
	JPanel jp, jp2, jp3, jp4, jp5, jp6, pg1, pg2;
	JLabel jl1, jl2, jl3, jl4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;
	JScrollPane jsp;
	String select = "select * from customer order by custid asc"; // 조회
	String sql = ""; // 나머지

	public KYJ_0607_DB() {
		super("DB 연동 정보");

		pg1 = new JPanel();
		pg1.setLayout(new GridLayout(4, 2, 0, 0));
		jp3 = new JPanel();
		jl1 = new JLabel("CUSTID : ");
		jl1.setHorizontalAlignment(JLabel.CENTER); // JLabel 가운데 정렬
		jtf1 = new JTextField(20);
		pg1.add(jl1);
		pg1.add(jtf1);
		jp4 = new JPanel();  
		jl2 = new JLabel("NAME : ");
		jl2.setHorizontalAlignment(JLabel.CENTER);

		jtf2 = new JTextField(20);
		pg1.add(jl2);
		pg1.add(jtf2);
		jp5 = new JPanel();
		jl3 = new JLabel("ADDRESS : ");
		jl3.setHorizontalAlignment(JLabel.CENTER);
		jtf3 = new JTextField(20);
		pg1.add(jl3);
		pg1.add(jtf3);
		jp6 = new JPanel();
		jl4 = new JLabel("PHONE : ");
		jl4.setHorizontalAlignment(JLabel.CENTER);
		jtf4 = new JTextField(20);
		pg1.add(jl4);
		pg1.add(jtf4);

		jp2 = new JPanel();
		jta = new JTextArea();
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");
		jb6.setEnabled(false);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);

		jta = new JTextArea(15, 60);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		add(pg1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();

		// 1. java를 오라클에 접속할 수 있도록 도와 주는 클래스
		Connection conn = null;
		// 2. SQL 구문 작성을 도와주는 클래스
		Statement stmt = null;

		// 3-1. select문의 결과를 받는 클래스
		ResultSet rs = null;
		// 3-2. select문을 제외한(delete, update, insert) 결과를 받는 변수
		int result = 0;

		try {
			// 4. jdbc 드라이버 로딩: 오라클, MySQL 등 각 각 내용이 다르다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 5. 접속하기 위한 정보 저장(오라클, MySQL 각 각 내용이 다르다)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "C##KJun";
			String password = "1111";

			// 6. 접속하기
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();

			if (obj == jb1) {
				jta.setText("");
				rs = stmt.executeQuery(select);
				while (rs.next()) {
					jta.append(rs.getString(1) + "\t");
					jta.append(rs.getString(2) + "\t");
					jta.append(rs.getString(3) + "\t");
					jta.append(rs.getString(4) + "\t");
					jta.append("\n");
				}
			} else if (obj == jb2) {
				jta.setText("");
				sql = "insert into customer values(" + jtf1.getText() + ", '" + jtf2.getText() + "', '" + jtf3.getText()
						+ "', '" + jtf4.getText() + "')";
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				if (result > 0) {
					jta.append("삽입 성공 \n");
					rs = stmt.executeQuery(select);
					while (rs.next()) {
						jta.append(rs.getString(1) + "\t");
						jta.append(rs.getString(2) + "\t");
						jta.append(rs.getString(3) + "\t");
						jta.append(rs.getString(4) + "\t");
						jta.append("\n");
					}
				}
			} else if (obj == jb3) {
				jta.setText("");
				sql = "delete from customer where custid = " + jtf1.getText();
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				if (result > 0) {
					jta.append("삭제 성공 \n");
					rs = stmt.executeQuery(select);
					while (rs.next()) {
						jta.append(rs.getString(1) + "\t");
						jta.append(rs.getString(2) + "\t");
						jta.append(rs.getString(3) + "\t");
						jta.append(rs.getString(4) + "\t");
						jta.append("\n");
					}
				}
			} else if (obj == jb4) {
				jta.setText("");
				sql = "select * from customer where custid = " + jtf1.getText();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					jta.append(rs.getString(1) + "\t");
					jta.append(rs.getString(2) + "\t");
					jta.append(rs.getString(3) + "\t");
					jta.append(rs.getString(4) + "\t");
					jta.append("\n");
				}
			} else if (obj == jb5) {
				jta.setText("");
				sql = "select * from customer where custid = " + jtf1.getText();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					jtf1.setText(rs.getString(1));
					jtf2.setText(rs.getString(2));
					jtf3.setText(rs.getString(3));
					jtf4.setText(rs.getString(4));
				}
			}
		} catch (Exception e1) {
			jta.append("오류 발생: " + e1);
		} finally {
			try {
				rs.close();
				stmt.cancel();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		new KYJ_0607_DB();
	}

}
