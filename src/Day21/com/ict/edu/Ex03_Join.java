package Day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Join extends JFrame {
	JPanel jp;
	JButton jb;
	Ex03_Main main;
	
	public Ex03_Join(Ex03_Main main) {
		jp = new JPanel();
		jb = new JButton("뒤로가기");
		
		jp.add(jb);
		add(jp);
		
		pack();
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				main.setVisible(true);
				setVisible(false);
			}
		});
	}
}
