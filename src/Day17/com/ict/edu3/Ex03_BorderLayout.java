package Day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

// 화면 배치 종류
// 1.FlowLayout: 화면 상단 가운데 정렬(JPanel)
// 2. BorderLayout: 동,서,남,북, 가운데 배치
//				    방향표시를 하지 않으면 마지막 컴포넌트가 파일을 채운다.(JFrame)
// 3. GridLayout: 격자형태(행과 열)
// 4. BoxLayout: 하나의 행, 하나의 열로 만든다
// 5. CardLayout: 여러장의 카드를 쌓아두고 하나씩 보여주는 형태
// 6. 절대좌표: 컴포넌트마다 좌표를 직접 지정해서 배치한다
public class Ex03_BorderLayout extends JFrame{
	public Ex03_BorderLayout() {
		super("BorderLayout");
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		
		// 아무것도 하지 않으면 자동으로 BorderLayout이다.
		// 아무것도 하지 않으면 마지막 컴퍼넌트가 화면을 차지한다.
//		add(jb1);
//		add(jb2);
//		add(jb3);
//		add(jb4);
//		add(jb5);
		
		// 방향표시
		add(jb1, BorderLayout.CENTER);
		add(jb2, BorderLayout.NORTH);
		add(jb3, BorderLayout.SOUTH);
		add("West", jb4);
		add("East", jb5);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03_BorderLayout();
	}
}
