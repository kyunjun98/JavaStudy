package Day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07_FIle_Copy extends JFrame {
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JButton jb;
	String in_path, out_path;

	public Ex07_FIle_Copy() {
		super("복사하기");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		jb = new JButton("복사 하기");

		jp1.add(new JLabel("원본 위치: "));
		jp1.add(jtf1);

		jp2.add(new JLabel("사본 위치: "));
		jp2.add(jtf2);
		jp2.add(jb);

		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new GridLayout(2, 0));
		add(jp1);
		add(jp2);

		// 원본파일: LOAD
		jtf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf1.setText(msg);
				}
			}
		});

		// 사본파일: SAVE
		jtf2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "복사하기", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf2.setText(msg);
				}
			}
		});

		jb.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String oldPathName = jtf1.getText().trim();
				String newPathName = jtf2.getText().trim();
				
				// 파일은 무조건 바이트 스트림 처리 하자.
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				try {
					fis = new FileInputStream(oldPathName);
					bis = new BufferedInputStream(fis);
					fos = new FileOutputStream(newPathName);
					bos = new BufferedOutputStream(fos);
					
					int b = 0;
					while(rootPaneCheckingEnabled) {
						bos.write(b);
					}
					bos.flush();
					jtf1.setText("");
					jtf2.setText("");
				} catch (Exception e2) {
				} finally {
					try {
						bos.close();
						fos.close();
						bis.close();
						fis.close();
					} catch (Exception e3) {
					}
				}
			}
		});
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07_FIle_Copy();
	}
}
