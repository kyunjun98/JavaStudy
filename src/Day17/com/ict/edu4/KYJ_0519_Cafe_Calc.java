package Day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
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
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;

public class KYJ_0519_Cafe_Calc extends JFrame {
	public KYJ_0519_Cafe_Calc() {
		super("카페주문");
		
		JPanel jp1 = new JPanel(new GridLayout(3,0));		
		JPanel jp2 = new JPanel();		
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		
		JLabel jl1 = new JLabel("원하는 음료를 선택하세요.");

		JRadioButton jrb1 = new JRadioButton("아메리카노(3000)");
		JRadioButton jrb2 = new JRadioButton("카페모카(4000)");
		JRadioButton jrb3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jrb4 = new JRadioButton("과일쥬스(3000)");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		JLabel jl2 = new JLabel("수량: ");
		JTextField jtf2 = new JTextField(10);

		JLabel jl3 = new JLabel("입금액: ");
		JTextField jtf3 = new JTextField(10);
		
		
		jp1.add(jp2);
		jp1.add(jp3);
		jp1.add(jp4);
		
		jp2.add(jl1);
		
		jp3.add(jrb1);
		jp3.add(jrb2);
		jp3.add(jrb3);
		jp3.add(jrb4);
		
		jp4.add(jl2);
		jp4.add(jtf2);
		jp4.add(jl3);
		jp4.add(jtf3);
		
		add(jp1, BorderLayout.NORTH);
		
		JTextArea jta = new JTextArea(5, 20);
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, // 세로
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER // 가로
		);
		
		// 결과출력에는 편집이 불가능 해야함.
		jta.setEditable(false);
		add(jsp,BorderLayout.CENTER);
		JPanel sp = new JPanel();
		JButton jbt1 = new JButton("계 산");
		JButton jbt2 = new JButton("종 료");
		JButton jbt3 = new JButton("취 소");
		sp.add(jbt1);
		sp.add(jbt2);
		sp.add(jbt3);
		add(sp, BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 350, ds.height / 2 - 350, 700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KYJ_0519_Cafe_Calc();
	}
}
