package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04_PreparedStatement_delete {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kjun";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			
			String sql = "delete from customer where custid = '?'";
			result = pstm.executeUpdate(sql);
			if(result>0) {
				sql = "select * from customer order by custid asc";
				rs = pstm.executeQuery(sql);
				while(rs.next() ) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			} else System.out.println("실패");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
