package Day15.com.ict.edu5;

import javax.swing.JFrame;

public class Ex01_Swing {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Swing으로 만든 창");
		
		JFrame jframe1 = new JFrame();
		jframe1.setTitle("Swing으로 만든 창");
		
		jframe.setSize(600,600);
		jframe.setLocation(0,0);
		
		jframe.setVisible(true);
	}
}
