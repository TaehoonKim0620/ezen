package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodInfoCRUD {
	static List<Map<String,String>> getFoods(){
		List<Map<String,String>> foods = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = " SELECT FI_NUM,FI_NAME,FI_PRICE FROM FOOD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> mp = new HashMap<>();
				String fiNum = rs.getString("FI_NUM");
				String fiName = rs.getString("FI_NAME");
				String fiPrice = rs.getString("FI_PRICE");
				mp.put("fiNum", fiNum);
				mp.put("fiName", fiName);
				mp.put("fiPrice", fiPrice);
				foods.add(mp);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return foods;
	}
	public static void main(String[] args) {
		List<Map<String,String>> poods = getFoods();
		for(Map<String,String> u : poods) {
			System.out.println(u);
		}
	}
}
