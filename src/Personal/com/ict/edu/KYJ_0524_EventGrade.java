package Personal.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class KYJ_0524_EventGrade extends JFrame implements ActionListener {
	JTextField name, kor, eng, math;
	JButton jb1, jb2, jb3;
	JTextArea jta;

	public KYJ_0524_EventGrade() {
		super("성적계산");

		JPanel jp1 = new JPanel();
		name = new JTextField(10);
		jp1.add(new JLabel(" 이  름 : "));
		jp1.add(name);

		JPanel jp2 = new JPanel();
		kor = new JTextField(10);
		eng = new JTextField(10);
		math = new JTextField(10);
		jp2.add(new JLabel(" 국  어 : "));
		jp2.add(kor);
		jp2.add(new JLabel(" 영  어 : "));
		jp2.add(eng);
		jp2.add(new JLabel(" 수  학 : "));
		jp2.add(math);

		jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JPanel jp3 = new JPanel();
		jb1 = new JButton("계 산");
		jb2 = new JButton("종 료");
		jb3 = new JButton("초 기 화");
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);

		JPanel jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);

		add(jp1, BorderLayout.NORTH);
		add(jp4, BorderLayout.CENTER);

		// 컴포넌트 크기에 맞춰서
		pack();
		// 화면 중간
		setLocationRelativeTo(null);

		// Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		// setBounds(ds.width/2-250, ds.height/2-250, 600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int sum = Integer.parseInt(kor.getText()) + Integer.parseInt(eng.getText()) + Integer.parseInt(math.getText());
		double avg = (int) (sum / 3.0 * 10) / 10.0;
		String hak = "";
		if(avg>=90) {
			hak = "A";
		} else if(avg>=80) {
			hak = "B";
		} else if(avg>=70) {
			hak = "C";
		} else {
			hak = "F";
		}
		
		JButton obj = (JButton) e.getSource();
		if (obj == jb1) {
			jta.append(("이름: " + name.getText()) + "\n");
			jta.append("총점: " + String.valueOf(sum) + "\n");
			jta.append("평균: " + String.valueOf(avg) + "\n");
			jta.append("학점: " + hak + "\n");
		} else if (obj == jb2) {
			System.exit(0);
		} else if (obj == jb3) {
			name.setText("");
			kor.setText("");
			eng.setText("");
			math.setText("");
			jta.setText("");
		}

	}

	public static void main(String[] args) {
		new KYJ_0524_EventGrade();
	}
}
