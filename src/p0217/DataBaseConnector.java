package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnector {
	
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		private static final String URL = "jdbc:mysql://localhost:3306/ezen";
		private static final String USER = "root";
		private static final String PASSWORD = "r1r2r3";
		public static Connection getCon() throws SQLException {
			return DriverManager.getConnection(URL,USER,PASSWORD);
		}
		public static void main(String[] args) {
			try{
				Connection con = DataBaseConnector.getCon();
				Statement stmt = con.createStatement();
				String sql = " INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE)";
				sql += " VALUES('참치김밥',2000)";
				int result = stmt.executeUpdate(sql);
				if(result >=1) {
					System.out.println("입력성공!!");
				}else {
					System.out.println("오류는 안났지만 입력은 안됐어요");
				}
			}catch (SQLException e) {
				e.printStackTrace(); // DDL DML DCL -> DMC
			}
		}
		
}
