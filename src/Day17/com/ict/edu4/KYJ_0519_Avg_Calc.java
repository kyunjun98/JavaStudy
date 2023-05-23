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

public class KYJ_0519_Avg_Calc extends JFrame {
	public KYJ_0519_Avg_Calc() {
		super("성적계산");
		
		JPanel jp1 = new JPanel(new GridLayout(2,0));		
		JPanel jp2 = new JPanel();		
		JPanel jp3 = new JPanel();
		
		JLabel jl1 = new JLabel("이름: ");
		JTextField jtf1 = new JTextField(10);

		JLabel jl2 = new JLabel("국어: ");
		JTextField jtf2 = new JTextField(10);

		JLabel jl3 = new JLabel("영어: ");
		JTextField jtf3 = new JTextField(10);
		
		JLabel jl4 = new JLabel("수학: ");
		JTextField jtf4 = new JTextField(10);
		
		jp1.add(jp2);
		jp1.add(jp3);
		
		jp2.add(jl1);
		jp2.add(jtf1);
		
		jp3.add(jl2);
		jp3.add(jtf2);
		jp3.add(jl3);
		jp3.add(jtf3);
		jp3.add(jl4);
		jp3.add(jtf4);
		
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
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KYJ_0519_Avg_Calc();
	}
}
