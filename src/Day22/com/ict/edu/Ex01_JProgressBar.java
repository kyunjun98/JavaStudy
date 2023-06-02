package Day22.com.ict.edu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex01_JProgressBar extends JFrame {
	JPanel jp;
	JButton jb;
	JProgressBar jp1, jp2;
	
	public Ex01_JProgressBar() {
		super("프로그레스바 스레드");
		jp = new JPanel();
		jb = new JButton("start");
		jp1 = new JProgressBar();
		jp2 = new JProgressBar();
	}
	public static void main(String[] args) {
		new Ex01_JProgressBar();
	}
}
