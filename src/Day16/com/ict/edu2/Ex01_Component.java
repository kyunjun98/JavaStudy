package Day16.com.ict.edu2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01_Component extends JFrame implements ActionListener{
	public Ex01_Component() {
		super("버튼이벤트");
		JPanel jp = new JPanel();
		
		JButton jb1 = new JButton("첫번째");
		JButton jb2 = new JButton();
		jb2.setText("두번째");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new Ex01_Component();
	}

}
