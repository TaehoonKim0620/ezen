package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectFoodInfo {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) { // 이 오류를 강요하고 있음
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String password = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql = " SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int num = rs.getInt("FI_NUM");
				String name = rs.getString("FI_NAME");
				int price = rs.getInt("FI_PRICE");
				System.out.println(num + "," + name + "," + price);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
