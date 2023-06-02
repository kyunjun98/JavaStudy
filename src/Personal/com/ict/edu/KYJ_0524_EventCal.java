package Personal.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class KYJ_0524_EventCal extends JFrame implements ActionListener, ItemListener {
	JTextField jtf1, jtf2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	ButtonGroup bg;
	JButton jbt1, jbt2, jbt3;
	JTextArea jta;
	String cal = "";
	int result = 0;

	public KYJ_0524_EventCal() {
		super("계산기");

		JPanel np = new JPanel();
		jtf1 = new JTextField(5);

		jtf2 = new JTextField(5);

		jrb1 = new JRadioButton("+");
		jrb2 = new JRadioButton("-");
		jrb3 = new JRadioButton("/");
		jrb4 = new JRadioButton("*");

		bg = new ButtonGroup();
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

		jta = new JTextArea(5, 20);
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, // 세로
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER // 가로
		);
		// 결과출력에는 편집이 불가능 해야함.
		jta.setEditable(false);
		add(jsp, BorderLayout.CENTER);

		JPanel sp = new JPanel();
		jbt1 = new JButton("계 산");
		jbt2 = new JButton("종 료");
		jbt3 = new JButton("초 기 화");
		sp.add(jbt1);
		sp.add(jbt2);
		sp.add(jbt3);
		add(sp, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);

		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
	}

	@Override // 라디오
	public void itemStateChanged(ItemEvent e) {
		JRadioButton obj = (JRadioButton) e.getSource();
		if (e.getStateChange() == e.SELECTED) {
			cal = obj.getText();
		}
	}

	@Override // 버튼
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if (obj == jbt1) {
			if (cal.equals("+")) {
				result = Integer.parseInt(jtf1.getText()) + Integer.parseInt(jtf2.getText());
				jta.append(String.valueOf(result + " \n"));
			} else if (cal.equals("-")) {
				result = Integer.parseInt(jtf1.getText()) - Integer.parseInt(jtf2.getText());
				jta.append(String.valueOf(result + " \n"));
			} else if (cal.equals("/")) {
				result = Integer.parseInt(jtf1.getText()) / Integer.parseInt(jtf2.getText());
				jta.append(String.valueOf(result + " \n"));
			} else if (cal.equals("*")) {
				result = Integer.parseInt(jtf1.getText()) * Integer.parseInt(jtf2.getText());
				jta.append(String.valueOf(result + " \n"));
			}
		} else if(obj == jbt2) {
			System.exit(0);
		} else if(obj == jbt3) {
			bg.clearSelection();
			jtf1.setText("");
			jtf2.setText("");
			jta.setText("");
		}

	}

	public static void main(String[] args) {
		new KYJ_0524_EventCal();
	}
}
