package p0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodInfoCRUD {
	public int insertFoodInfo(String fiName, int fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME,FI_PRICE)" + " VALUES(?,?)";
		sql = String.format(sql, fiName, fiPrice);
		try (Connection con = DBCon.getCon(); PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, fiName);
			ps.setInt(2, fiPrice);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteFoodInfo(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=?";
		sql = String.format(sql, fiNum);
		try (Connection con = DBCon.getCon(); PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(1, fiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateFoodInfo(int fiNum, String fiName, int fiPrice) {
		String sql = "UPDATE FOOD_INFO SET FI_NAME = ?, FI_PRICE = ? WHERE FI_NUM = ?";
		sql = String.format(sql, fiName, fiPrice, fiNum);
		try (Connection con = DBCon.getCon(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, fiName);
			ps.setInt(2, fiPrice);
			ps.setInt(3, fiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Map<String, String>> selectFoodInfos(String type, String str) {
		List<Map<String, String>> foodInfos = new ArrayList<>();
		String sql = " SELECT FI_NUM,FI_NAME,FI_PRICE FROM FOOD_INFO";
		if ("1".equals(type)) {
			sql += " WHERE FI_NAME LIKE CONCAT('%',?,'%')";
		} else if ("2".equals(type)) {
			sql += " WHERE FI_PRICE LIKE CONCAT('%',?,'%')";
		}
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, String> foodInfo = new HashMap<>();
				foodInfo.put("fiName", rs.getString("FI_NAME"));
				foodInfo.put("fiPrice", rs.getString("FI_PRICE"));
				foodInfos.add(foodInfo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foodInfos;
	}

	public static void main(String[] args) {
		FoodInfoCRUD crud = new FoodInfoCRUD();

		int result = crud.insertFoodInfo("라면", 4000);
		System.out.println("insert : " + result);
		result = crud.deleteFoodInfo(2);
		System.out.println("delete : " + result);
		result = crud.updateFoodInfo(3, "호박", 9000);
		System.out.println("update : " + result);
		List<Map<String, String>> foodInfos = crud.selectFoodInfos("1", "라");
		for (Map<String, String> foodInfo : foodInfos) {
			System.out.println(foodInfo);
		}
	}
}
