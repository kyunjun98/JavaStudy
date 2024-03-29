package Day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.sound.sampled.LineListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex04_JCheckbox_ItemListener2 extends JFrame {
	JPanel jp1, jp2;
	JCheckBox jcb1, jcb2, jcb3, jcb4;
	JTextArea jta;
	JButton jb1, jb2;

	public Ex04_JCheckbox_ItemListener2() {
		super("체크박스 이벤트");

		jp1 = new JPanel();
		jcb1 = new JCheckBox("축 구");
		jcb2 = new JCheckBox("야 구");
		jcb3 = new JCheckBox("배 구");
		jcb4 = new JCheckBox("농 구");

		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		add(jp1, BorderLayout.NORTH);

		jta = new JTextArea(10, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		add(jsp, BorderLayout.CENTER);

		jp2 = new JPanel();
		jb1 = new JButton("clear");
		jb2 = new JButton("exit");

		jp2.add(jb1);
		jp2.add(jb2);

		add(jp2, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jcb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					jta.append(jcb1.getText() + " 선 택 \n");
				} else if (e.getStateChange() == e.DESELECTED) {
					jta.append(jcb1.getText() + " 해 제 \n");
				}
			}
		});
		jcb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					jta.append(jcb2.getText() + " 선 택 \n");
				} else if (e.getStateChange() == e.DESELECTED) {
					jta.append(jcb2.getText() + " 해 제 \n");
				}
			}
		});
		jcb3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					jta.append(jcb3.getText() + " 선 택 \n");
				} else if (e.getStateChange() == e.DESELECTED) {
					jta.append(jcb3.getText() + " 해 제 \n");
				}
			}
		});
		jcb4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					jta.append(jcb4.getText() + " 선 택 \n");
				} else if (e.getStateChange() == e.DESELECTED) {
					jta.append(jcb4.getText() + " 해 제 \n");
				}
			}
		});
		
		jb1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				jcb1.setSelected(false);
				jcb2.setSelected(false);
				jcb3.setSelected(false);
				jcb4.setSelected(false);
			}	
		});
		
		jb2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Ex04_JCheckbox_ItemListener2();
	}
}
