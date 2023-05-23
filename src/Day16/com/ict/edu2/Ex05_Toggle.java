package Day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Ex05_Toggle extends JFrame {
	public Ex05_Toggle() {
		super("토글버튼");
		
		JPanel jp = new JPanel();
		
		JToggleButton jtb1 = new JToggleButton("1");
		JToggleButton jtb2 = new JToggleButton("2");
		JToggleButton jtb3 = new JToggleButton("3");
		JToggleButton jtb4 = new JToggleButton("4");
		
		jp.add(jtb1);
		jp.add(jtb2);
		jp.add(jtb3);
		jp.add(jtb4);
	
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex05_Toggle();
	}
}
