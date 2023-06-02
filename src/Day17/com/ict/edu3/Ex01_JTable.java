package Day17.com.ict.edu3;

import javax.swing.table.AbstractTableModel;

public class Ex01_JTable extends AbstractTableModel {
	// 1.컬러명(열의 대표적인이름)을 배열로 만든다
	String[] name = { "번호", "아이디", "패스워드", "나이", "성별" };
	String[][] data = { { "1,", "aaaa", "a111", "12", "false" }, { "2,", "bbbb", "b111", "15", "true" },
			{ "3,", "cccc", "c111", "18", "false" }, { "4,", "dddd", "d111", "10", "true" } };

	// 행의 수 = rows = 줄
	@Override
	public int getRowCount() {
		return data.length;
	}

	// 열의 수 = Column = 칸
	@Override
	public int getColumnCount() {
		return name.length;
	}

	// 내용 삽입
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	// 컬럼명 넣기
	@Override
	public String getColumnName(int column) {
		return name[column];
	}

	// 내용수정
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex != 0) {
			return true;
		} else {
			return false;
		}
	}

	// 고친내용 적용하기
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if (columnIndex != 0) {
			data[rowIndex][columnIndex] = (String) aValue;
		}
	}
}
