package Day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_ComboBox extends JFrame {
	public Ex06_ComboBox() {
		super("콤보박스");
		
		JPanel jp = new JPanel();
		String[] items = {"좋아하는 운동", "야구", "축구", "배구", "농구"};
		JComboBox<String> jcb1 = new JComboBox<>(items);
		
		// 특정항목을 먼저 나오게 하는 방법
		jcb1.setSelectedIndex(3);
		jp.add(jcb1);
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Ex06_ComboBox();
	}
}
