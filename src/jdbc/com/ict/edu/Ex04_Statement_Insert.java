package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex04_Statement_Insert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "C##KJun";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// INSERT(6번, 이강인, 대한민국 서울, 000-9000-0001) 추가
			String sql = "insert into customer(custid,name,address,phone) "
					+ "values (7, '이강인', '대한민국 서울', '000-9000-0001')";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if(result>0) {
				String sql2 = "select custid,name,address,phone from customer order by custid asc";
				rs = stmt.executeQuery(sql2);
				
				while(rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else System.out.println("삽입 실패");
		
		} catch (Exception e) {
			System.out.println("삽입 실패");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
