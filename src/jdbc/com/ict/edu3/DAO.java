package jdbc.com.ict.edu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO(Data Access Object): 데이터베이스의 data에 접근하기 위한 객체
//							비즈니스로직을 분리하기 위해서 사용

// DB에 접속해서 각종 SQL을 처리하는 클래스
// 싱클턴 패턴: 소프트웨어 디자인 패턴에서 사용되는 패턴 중 하나이다.
//			 생성자가 여러차례 호출 되더라도 실제 생성되는 객체는 하나이고,
//			 최초 생성 이후에는 호출된 생성자는 최초 생성자가 생성한 객체를 리턴한다.
//			 가장 대표적인 것이 spring이 기존적으로 싱글턴 패턴을 사용한다.

public class DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;

	private static DAO dao = new DAO();

	public static DAO getInstance() {
		return dao;
	}

	// DB 접속
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kjun";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			return conn;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	// DB에 접근후 원하는 메서드를 만들어서 사용

	// 전체보기 메서드
	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from 고객";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("고객아이디\t고객이름\t나이\t등급\t직업\t적립금");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.print(rs.getString(6) + "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public void getDetailSelect(String c_id) {
		try {
			conn = getConnection();
			String sql = "select * from 고객 where 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_id);
			rs = pstm.executeQuery();
			System.out.println("고객아이디\t고객이름\t나이\t등급\t직업\t적립금");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.print(rs.getString(6) + "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public void getInsert(String in_id, String in_name, int in_age, String in_rank, String in_job, int in_point) {
		try {
			conn = getConnection();
			String sql = "insert into 고객 values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, in_id);
			pstm.setString(2, in_name);
			pstm.setInt(3, in_age);
			pstm.setString(4, in_rank);
			pstm.setString(5, in_job);
			pstm.setInt(6, in_point);
			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public void getDelete(String c_id) {
		try {
			conn = getConnection();
			String sql = "delete from 고객 where 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_id);
			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public void getUpdate(String in_id, String in_name, int in_age, String in_rank, String in_job, int in_point) {
		try {
			conn = getConnection();
			String sql = "update 고객 set 고객이름=?, 나이=?, 등급=?, 직업=?, 적립금=? where 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, in_name);
			pstm.setInt(2, in_age);
			pstm.setString(3, in_rank);
			pstm.setString(4, in_job);
			pstm.setInt(5, in_point);
			pstm.setString(6, in_id);
			result = pstm.executeUpdate();
			if(result>0) {
				getSelectAll();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
