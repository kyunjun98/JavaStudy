package Day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
import javax.swing.ScrollPaneConstants;

public class Ex01_Calc2 extends JFrame {
	public Ex01_Calc2() {
		super("계산기");

		JPanel np = new JPanel();
		JTextField jtf1 = new JTextField(5);

		JTextField jtf2 = new JTextField(5);

		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("/");
		JRadioButton jrb4 = new JRadioButton("*");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		np.add(new JLabel("수1: "));
		np.add(jtf1);
		np.add(new JLabel("수2: "));
		np.add(jtf2);
		np.add(new JLabel("연산자: "));
		np.add(jrb1);
		np.add(jrb2);
		np.add(jrb3);
		np.add(jrb4);
		add(np, BorderLayout.NORTH);

		JTextArea jta = new JTextArea(5, 20);
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, // 세로
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER // 가로
		);
		// 결과출력에는 편집이 불가능 해야함.
		jta.setEditable(false);
		add(jsp, BorderLayout.CENTER);
		
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
		new Ex01_Calc2();
	}
}
