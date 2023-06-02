package Day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex10_Blue extends JPanel {
	public Ex10_Blue() {
		setBackground(Color.blue);

		JButton jbt1 = new JButton("+");
		JButton jbt2 = new JButton("-");
		JButton jbt3 = new JButton("/");
		JButton jbt4 = new JButton("*");
		
		add(jbt1);
		add(jbt2);
		add(jbt3);
		add(jbt4);
	}
}
