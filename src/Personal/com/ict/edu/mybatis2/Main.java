package Personal.com.ict.edu.mybatis2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame implements ActionListener {
	JPanel jp_write, jp_center, jp_funtion, jp_title, jp_select, jp_center_left;
	JButton jb_insert, jb_delete, jb_update, jb_select, jb_eraser, jb_all;
	JTextField jtf_id, jtf_name, jtf_phone, jtf_addr, jtf_com, jtf_select;
	JComboBox<String> jcomb;
	JTable table;
	Object ob[][] = new Object[0][5];
	DefaultTableModel model;
	JScrollPane js;
	String[] select = { "ID", "이름", "전화", "주소" };
	String[] title = { "ID", "이름", "전화", "주소", "회사" };

	public Main() {
		super("Admin");
		// 위
		jp_title = new JPanel();
		jp_title.add(new JLabel("AddressBook"));
		add(jp_title, BorderLayout.NORTH);

		// 가운데
		jp_center = new JPanel();
		jp_write = new JPanel();
		jtf_id = new JTextField(10);
		jtf_name = new JTextField(10);
		jtf_phone = new JTextField(10);
		jtf_addr = new JTextField(10);
		jtf_com = new JTextField(10);
		jp_center_left = new JPanel();
		jp_center_left.add(new JLabel("I D: "));
		jp_center_left.add(jtf_id);
		jp_center_left.add(new JLabel("이 름: "));
		jp_center_left.add(jtf_name);
		jp_center_left.add(new JLabel("전 화: "));
		jp_center_left.add(jtf_phone);
		jp_center_left.add(new JLabel("주 소: "));
		jp_center_left.add(jtf_addr);
		jp_center_left.add(new JLabel("회 사: "));
		jp_center_left.add(jtf_com);
		jp_center_left.setLayout(new GridLayout(0, 2));
		jp_write.add(jp_center_left, BorderLayout.SOUTH);
		add(jp_write, BorderLayout.WEST);

		jp_select = new JPanel();
		model = new DefaultTableModel(ob, title);
		table = new JTable(model);
		js = new JScrollPane(table);
		table.setEnabled(false);
		jp_select.add(js);

		add(jp_select, BorderLayout.CENTER);

		// 아래
		jp_funtion = new JPanel();
		jb_insert = new JButton("추 가");
		jb_delete = new JButton("삭 제");
		jb_update = new JButton("수 정");
		jcomb = new JComboBox<>(select);
		jtf_select = new JTextField(10);
		jb_select = new JButton("검 색");
		jb_eraser = new JButton("지우기");
		jb_all = new JButton("전체보기");
		jp_funtion.add(jb_insert);
		jp_funtion.add(jb_delete);
		jp_funtion.add(jb_update);
		jp_funtion.add(jcomb);
		jp_funtion.add(jtf_select);
		jp_funtion.add(jb_select);
		jp_funtion.add(jb_eraser);
		jp_funtion.add(jb_all);
		add(jp_funtion, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		jb_insert.addActionListener(this);
		jb_delete.addActionListener(this);
		jb_update.addActionListener(this);
		jb_select.addActionListener(this);
		jb_eraser.addActionListener(this);
		jb_all.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 테이블 초기화
		model.setNumRows(0);

		JButton obj = (JButton) e.getSource();
		List<VO> list = null;
		VO vo = new VO();
		int result = 0;
		if (obj == jb_all) {
			list = DAO.getList();
			prn(list);
			eraser();
		} else if (obj == jb_insert) {
			vo.setId(jtf_id.getText());
			vo.setName(jtf_name.getText());
			vo.setPhone(jtf_addr.getText());
			vo.setAddr(jtf_phone.getText());
			vo.setCom(jtf_addr.getText());
			result = DAO.getInsert(vo);
			if (result > 0) {
				list = DAO.getList();
				prn(list);
				eraser();
			}
		} else if (obj == jb_delete) {
			vo.setId(jtf_id.getText());
			result = DAO.getDelete(vo);
			if (result > 0) {
				list = DAO.getList();
				prn(list);
				eraser();
			}
		} else if (obj == jb_update) {
			vo = DAO.getOneId(jtf_id.getText());
			vo.setName(jtf_name.getText());
			vo.setPhone(jtf_phone.getText());
			vo.setAddr(jtf_addr.getText());
			vo.setCom(jtf_com.getText());
			result = DAO.getUpdate(vo);
			if (result > 0) {
				list = DAO.getList();
				prn(list);
				eraser();
			}
		} else if (obj == jb_select) {
			if (jcomb.getSelectedItem().toString() == "ID") {
				vo = DAO.getOneId(jtf_select.getText());
			} else if (jcomb.getSelectedItem().toString() == "이름") {
				vo = DAO.getOneName(jtf_select.getText());
			} else if (jcomb.getSelectedItem().toString() == "전화") {
				vo = DAO.getOnePhone(jtf_select.getText());
			} else if (jcomb.getSelectedItem().toString() == "주소") {
				vo = DAO.getOneAddr(jtf_select.getText());
			}
			prn2(vo);
		} else if (obj == jb_eraser) {
			eraser();
		}
	}

	public void eraser() {
		jtf_id.setText("");
		jtf_name.setText("");
		jtf_phone.setText("");
		jtf_addr.setText("");
		jtf_com.setText("");
		jtf_select.setText("");
	}

	public void prn(List<VO> list) {
		for (VO k : list) {
			Object data[] = { k.getId(), k.getName(), k.getPhone(), k.getAddr(), k.getCom() };
			model.addRow(data);
		}
	}

	public void prn2(VO vo) {
		Object data[] = { vo.getId(), vo.getName(), vo.getPhone(), vo.getAddr(), vo.getCom() };
		model.addRow(data);
	}

	public static void main(String[] args) {
		new Main();
	}
}