package Day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame {
	public Ex10_Main() {
		Ex10_Green gre = new Ex10_Green();
		Ex10_Blue blue = new Ex10_Blue();
		Ex10_Cyan cyan = new Ex10_Cyan();
		JTabbedPane jtap = new JTabbedPane();
		
		jtap.addTab("블루탭", blue);
		jtap.addTab("시얀탭", cyan);
		jtap.addTab("그린탭", gre);
		add(jtap);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-200, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex10_Main();
	}
}
