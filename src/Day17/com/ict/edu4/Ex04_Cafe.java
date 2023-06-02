package Day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex04_Cafe extends JFrame {
	public Ex04_Cafe() {
		super("카페 주문");
		
		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("원하는 음료를 선택하세요"));
		
		JPanel jp2 = new JPanel();
		JRadioButton jrb1 = new JRadioButton("아메리카노 30000");
		JRadioButton jrb2 = new JRadioButton("아메리카노 30000");
		JRadioButton jrb3 = new JRadioButton("아메리카노 30000");
		JRadioButton jrb4 = new JRadioButton("아메리카노 30000");
	
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		JPanel jp3 = new JPanel();
		JTextField su = new JTextField(10);
		JTextField input = new JTextField(10);
		jp3.add(new JLabel("수 량: "));
		jp3.add(su);
		jp3.add(new JLabel("입 금 액: "));
		jp3.add(input);
		
		JTextArea jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, // 세로
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER // 가로
		);

		JPanel sp = new JPanel();
		JButton jbt1 = new JButton("계 산");
		JButton jbt2 = new JButton("종 료");
		JButton jbt3 = new JButton("취 소");
		sp.add(jbt1);
		sp.add(jbt2);
		sp.add(jbt3);
		
		JPanel pg1 = new JPanel();
		JPanel pg2 = new JPanel();
		pg1.setLayout(new BorderLayout());
		pg2.setLayout(new BorderLayout());
		
		pg1.add(jp1, BorderLayout.NORTH);
		pg1.add(jp2, BorderLayout.CENTER);
		pg2.add(jp3, BorderLayout.NORTH);
		pg2.add(jsp, BorderLayout.CENTER);
		pg2.add(sp, BorderLayout.SOUTH);
		
		add(pg1, BorderLayout.NORTH);
		add(pg2, BorderLayout.CENTER);
		
		
		pack();
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04_Cafe();
		}
}
