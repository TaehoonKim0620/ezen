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

public class FoodInfo2 {
	static int updateFoodInfo(int fiNum,String fiName, int fiPrice){
		
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
			String sql = "UPDATE FOOD_INFO";
			sql += " SET FI_NAME='" + fiName + "',";
			sql += " FI_PRICE=" + fiPrice;
			sql += " WHERE FI_NUM=" + fiNum;
			return stmt.executeUpdate(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	static int deleteFoodInfo(int a){
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
			String sql = " DELETE FROM FOOD_INFO WHERE FI_NUM ="+a;
			int result  = stmt.executeUpdate(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	static int insertFoodInfo(String a,int b){
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
			String sql = " INSERT INTO FOOD_INFO(UI_NAME,UI_PRICE)";
			sql += " VALUES('" + a + "'," + b + ")";
			return stmt.executeUpdate(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
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
		Connection con =null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> food = new HashMap<>();
				String fiNum = rs.getString("FI_NUM");
				String fiName = rs.getString("FI_NAME");
				String fiPrice= rs.getString("FI_PRICE");
				food.put("fiNum", fiNum);
				food.put("fiName", fiName);
				food.put("fiPrice", fiPrice);
				foods.add(food);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return foods;
	}
	public static void main(String[] args) {
		int result = insertFoodInfo("보쌈",45000);
		System.out.println("입력된 갯수 : " + result);
		result = updateFoodInfo(104,"마늘보쌈",50000);
		System.out.println("업데이트된 갯수 : " + result);
		result = deleteFoodInfo(104);
		System.out.println("삭제된 갯수 : " + result);
		List<Map<String,String>> poods = getFoods();
		for(Map<String,String> u : poods) {
			System.out.println(u);
		}
	}
}
