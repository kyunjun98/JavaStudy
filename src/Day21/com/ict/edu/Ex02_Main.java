package Day21.com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Main extends JFrame {
	JPanel pg1;
	CardLayout cardLayout;
	
	
	public Ex02_Main() {
		super("카드레이아웃2");
		
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);
		
		Ex02_Login login = new Ex02_Login(cardLayout, pg1);
		pg1.add("login",login);
		
		Ex02_Join join = new Ex02_Join(this);
		pg1.add("join", join);
		
		Ex02_Login_ok ok = new Ex02_Login_ok(this);
		pg1.add("ok", ok);
		
		add(pg1);
		cardLayout.show(pg1, "login");
		
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02_Main();
	}
}
