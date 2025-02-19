package p0219;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodInfoCRUD {
	public int inseltFoodInfo(String fiName, int fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME,FI_PRICE)"
				+ " VALUES('%s',%d)";
		sql = String.format(sql, fiName, fiPrice);
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateFoodInfo(int fiNum, String fiName, int fiPrice) {
		String sql = "UPDATE FOOD_INFO SET FI_NAME='%s',FI_PRICE=%d WHERE FI_NUM=%d";
		sql = String.format(sql, fiName, fiPrice, fiNum);
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteFoodInfo(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=%d";
		sql = String.format(sql, fiNum);
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement()){
			return stmt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public List<Map<String,String>> selectFoodInfo(){
		List<Map<String,String>> people = new ArrayList<>();
		String sql = "SELECT * FROM FOOD_INFO";
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while(rs.next()) {
				Map<String,String> person = new HashMap<>();
				String fiNum = rs.getString("FI_NUM");
				String fiName = rs.getString("FI_NAME");
				String fiPrice = rs.getString("FI_PRICE");
				person.put("fiNum", fiNum);
				person.put("fiName", fiName);
				person.put("fiPrice", fiPrice);
				
				people.add(person);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return people;
	}
	public static void main(String[] args) {
		int result =0;
		FoodInfoCRUD crud = new FoodInfoCRUD();
		result = crud.inseltFoodInfo("김밥",3600);
		System.out.println("insert된 개수: " +result);
		result = crud.updateFoodInfo(2,"김밥",3650);
		System.out.println("update된 개수: "+result);
		result = crud.deleteFoodInfo(3);
		System.out.println("delete된 개수: "+result);
		List<Map<String,String>> user = crud.selectFoodInfo();
		for(Map<String,String> u : user) {
			System.out.println(u);
		}
	}
}
