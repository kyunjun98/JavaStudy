package Day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Ex07_List extends JFrame{
	public Ex07_List() {
		super("List");
		
		JPanel jp = new JPanel();
		

		String[] items = {"좋아하는 운동", "야구", "축구", "배구", "농구"};
		JList<String> jl = new JList<>(items);
		
		jp.add(jl);
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Ex07_List();
	}
}
