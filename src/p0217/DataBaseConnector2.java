package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBaseConnector2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		Connection con = null;
		try {
				con = DriverManager.getConnection(url,username,password);
				Statement stmt = con.createStatement();
				String sql = " SELECT FI_NUM,FI_NAME,FI_PRICE FROM FOOD_INFO";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()) {
					int num = rs.getInt("FI_NUM");
					String name = rs.getString("FI_NAME");
					int price = rs.getInt("FI_PRICE");
					System.out.println(num + "," + name + "," + price);
			}
		}catch(SQLException e) {
			e.printStackPrice();
	}finally {
		if(con!=null) {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackPrce();
			}
		}
	}
}
}
