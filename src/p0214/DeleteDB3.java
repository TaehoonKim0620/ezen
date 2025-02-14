package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB3 {
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
			//import 단축키 마우스 갖다 대고 2번째 클릭
 			Statement stmt = con.createStatement();
			String sql = " DELETE FROM FOOD_INFO;"; 
			int result = stmt.executeUpdate(sql);
			if(result>=1) {
				System.out.println("삭제 성공!");
			}else {
				System.out.println("오류는 안났지만 입력은 안됐어요");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
