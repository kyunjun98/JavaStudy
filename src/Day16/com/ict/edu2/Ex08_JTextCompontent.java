package Day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex08_JTextCompontent extends JFrame{
	
	
	public Ex08_JTextCompontent() {
		super("JTextCompontent");
		
		JPanel jp = new JPanel();
		
		// JLabel: 글자를 표시한다. 수정불가
		JLabel jLabel1 = new JLabel("I D: ");
		JLabel jLabel2 = new JLabel("P W: ");
		JLabel jLabel3 = new JLabel("자기소개서: ");
		
		// 한줄 글자 입력: JTextField
		JTextField jtf1 = new JTextField("아이디 입력");
		jtf1.setColumns(20); //보이는 글자 길이
		
		// 입력된 글자 **** 처리
		JPasswordField jtf2 = new JPasswordField("비번입력", 20);
		
		// 메모장과 같이 여러 줄 글자 입력: JTextArea(행, 열);
		JTextArea jta = new JTextArea(5, 20);
		
		//JTextArea는 두가지 옵션을 생각해야 된다.
		// 자동 줄바꿈
		jta.setLineWrap(true);
		
		//스크롤 기능
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, //세로 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER //가로
				);
		
		jp.add(jLabel1);
		jp.add(jtf1);
		jp.add(jLabel2);
		jp.add(jtf2);
		jp.add(jLabel3);
		jp.add(jsp);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex08_JTextCompontent();
	}
}
