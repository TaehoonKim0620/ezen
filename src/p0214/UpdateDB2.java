package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String sql = " UPDATE FOOD_INFO SET FI_PRICE = FI_PRICE + 770;";
			int result = stmt.executeUpdate(sql);
			if(result>=1) {
				System.out.println("업데이트 성공!");
			}else {
				System.out.println("오류는 안났지만 입력은 안됐어요");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
