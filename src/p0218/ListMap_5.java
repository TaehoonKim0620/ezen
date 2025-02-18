package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListMap_5 {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String password = "r1r2r3";
		Connection con = null;
		ArrayList<Map<String,String>> m = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = " SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> mp = new HashMap<>();
				String uiNum = rs.getString("UI_NUM");
				String uiName = rs.getString("UI_NAME");
				String uiId = rs.getString("UI_ID");
				String uiPwd = rs.getString("UI_PWD");
				mp.put("uiNum", uiNum);
				mp.put("UI_NAME",uiName);
				mp.put("UI_ID", uiId);
				mp.put("UI_PWD", uiPwd);
				m.add(mp);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		for(Map<String,String>users : m) {
			System.out.println(users);
		}
	}
}
