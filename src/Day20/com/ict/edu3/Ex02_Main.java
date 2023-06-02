package Day20.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex02_Main extends JFrame {
	JPanel jp;
	JTextField jtf;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;

	public Ex02_Main() {
		super("수도 알아내기");

		jp = new JPanel();
		jtf = new JTextField(10);
		jb1 = new JButton("확인");
		jb2 = new JButton("취소");
		jta = new JTextArea(10, 0);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp.add(new JLabel("나라입력: "));
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}
		});

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();				
			}
		});

		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("");
				jta.setText("");
				// 커서 위치 지정
				jtf.requestFocus();
			}
		});
	}
	public void dataPrn() {
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "어타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		Set<String> keys = map.keySet();

		if (jtf.getText().length() == 0) {
			jta.append("데이터 입력하세요 \n");
			jtf.requestFocus();
		} else {
			String str = jtf.getText().trim(); // 공백제거
			if (keys.contains(str)) {
				jta.append(str + "의 수도는 " + map.get(str) + "입니다. \n");
			} else {
				jta.append("데이터에 없는 나라입니다. \n");
			}
			jtf.setText("");
			jtf.requestFocus();
		}
	}
		
	public static void main(String[] args) {
		new Ex02_Main();
	}

}
