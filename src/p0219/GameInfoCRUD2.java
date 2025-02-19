package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD2 {
	public int insertGameInfo2(String giName,int giPrice, String giGenre, String giDesc) {
		String sql = "INSERT INTO GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)"
				+ " VALUES(?,?,?,?)";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, giName);
			ps.setInt(2, giPrice);
			ps.setString(3, giGenre);
			ps.setString(4, giDesc);
			return ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public List<Map<String,String>> selectGameInfo2(String type, String str) {
		List<Map<String,String>> gameusers = new ArrayList<>();
		String sql = "SELECT GI_NUM,GI_NAME,GI_PRICE,GI_DESC FROM GAME_INFO";
		if("1".equals(type)) {
			sql += " WHERE GI_NAME LIKE CONCAT('%',?,'%')";
		}else if("2".equals(type)) {
			sql += " WHERE GI_PRICE LIKE CONCAT('%',?,'%')";
		}else if("3".equals(type)) {
			sql += " WHERE GI_DESC LIKE CONCAT('%',?,'%')";
		}
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> user = new HashMap<>();
				String giNum = rs.getString("GI_NUM");
				String giName = rs.getString("GI_NAME");
				String giPrice = rs.getString("GI_PRICE");
				String giDesc = rs.getString("GI_DESC");
				user.put("giNum", giNum);
				user.put("giName", giName);
				user.put("giPrice", giPrice);
				user.put("giDesc", giDesc);
				
				gameusers.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return gameusers;
	}
	public int updateGameInfo2(int giNum, String giName, String giPrice, String giGenre, String giDesc) {
		String sql = " UPDATE GAME_INFO "
				+" GI_NAME ='"+ giNum+"'"
				+ ",GI_PRICE'"+ giPrice + "'"
				+ ", GI_GENRE='"+ giGenre+"'"
				+ ", GI_DESC='"+ giDesc+"'";
	}
	public static void main(String[] args) {
		int result = 0;
		GameInfoCRUD2 games = new GameInfoCRUD2();
		games.insertGameInfo2("배틀그라운드", 0, "슈팅", "재밌어요");
		List<Map<String,String>> user = games.selectGameInfo2("1","배");
		for(Map<String,String> u : user) {
			System.out.println(u);
		}
	}
}
				
		
