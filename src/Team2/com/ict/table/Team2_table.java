package Team2.com.ict.table;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Team2_table extends JFrame{
	JPanel jp_write, jp_center, jp_funtion, jp_title, jp_select;
	JTable table;
	JScrollPane sc;
	JButton jb_insert, jb_delete, jb_update, jb_select, jb_eraser, jb_all;
	JTextField jtf_id, jtf_name, jtf_phone, jtf_addr, jtf_com, jtf_select;
	String[] select = {"이름", "전화", "주소", "회사"};
	JComboBox<String> jcomb;
	
	public Team2_table() {
		super("Admin");
		// 위
		jp_title = new JPanel();
		jp_title.add(new JLabel("dasdasdasd"));
		add(jp_title, BorderLayout.NORTH);
		
		// 가운데
		jp_center = new JPanel();
		jp_write = new JPanel();
		jtf_id = new JTextField(10);
		jtf_name = new JTextField(10);
		jtf_phone = new JTextField(10);
		jtf_addr = new JTextField(10);
		jtf_com = new JTextField(10);
		
		jp_write.add(new JLabel("I D: "));
		jp_write.add(jtf_id);
		jp_write.add(new JLabel("이 름: "));
		jp_write.add(jtf_name);
		jp_write.add(new JLabel("전 화: "));
		jp_write.add(jtf_phone);
		jp_write.add(new JLabel("주 소: "));
		jp_write.add(jtf_addr);
		jp_write.add(new JLabel("회 사: "));
		jp_write.add(jtf_com);
		jp_write.setLayout(new GridLayout(0,2));
		add(jp_write, BorderLayout.WEST);
		
		
		String[] title = { "아이디", "이름", "전화", "주소", "회사"};
		String[][] text = { { "1,", "aaaa", "a111", "12", "false" }, { "2,", "bbbb", "b111", "15", "true" },
				{ "3,", "cccc", "c111", "18", "false" }, { "4,", "dddd", "d111", "10", "true" },{ "1,", "aaaa", "a111", "12", "false" }, { "2,", "bbbb", "b111", "15", "true" },
				{ "3,", "cccc", "c111", "18", "false" }, { "4,", "dddd", "d111", "10", "true" } ,{ "1,", "aaaa", "a111", "12", "false" }, { "2,", "bbbb", "b111", "15", "true" },
				{ "3,", "cccc", "c111", "18", "false" }, { "4,", "dddd", "d111", "10", "true" }  };

		jp_select = new JPanel();
		table = new JTable(text, title);
		sc = new JScrollPane(table);
		table.setEnabled(false);
		jp_select.add(table);
		
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
	}
	public static void main(String[] args) {
		new Team2_table();
	}
}