package p0219;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD {
	public int inseltUserInfo(String giName, int giPrice, String giGenre, String giDesc) {
		String sql = "INSERT INTO GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)"
				+ "VALUES('%s',%d,'%s','%s')";
		sql = String.format(sql, giName, giPrice, giGenre, giDesc);
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateUserInfo(int giNum, String giName, int giPrice, String giGenre,String giDesc) {
		String sql = "UPDATE GAME_INFO SET GI_NAME='%s',GI_PRICE=%d,GI_GENRE='%s',GI_DESC='%s'"
				+" WHERE GI_NUM=%d";
		sql=String.format(sql, giName, giPrice, giGenre, giDesc, giNum);
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteUserInfo(int uiNum) {
		String sql = " DELETE FROM GAME_INFO WHERE GI_NUM=%d";
		sql = String.format(sql, uiNum);
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public List<Map<String,String>> selectUserInfo(){
		List<Map<String,String>> users = new ArrayList<>();
		String sql = " SELECT * FROM GAME_INFO";
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while(rs.next()) {
			Map<String,String> gameuser = new HashMap<>();
				String giNum = rs.getString("GI_NUM");
				String giName = rs.getString("GI_NAME");
				String giPrice = rs.getString("GI_PRICE");
				String giGenre = rs.getString("GI_GENRE");
				String giDesc = rs.getString("GI_DESC");
				
				gameuser.put("giNum", giNum);
				gameuser.put("giName", giName);
				gameuser.put("giPrice", giPrice);
				gameuser.put("giGenre", giGenre);
				gameuser.put("giDesc", giDesc);
				users.add(gameuser);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	public static void main(String[] args) {
		int result = 0;
		GameInfoCRUD gameInfo = new GameInfoCRUD();
		result = gameInfo.inseltUserInfo("배틀그라운드", 0, "슈팅", "뭐..재밌지");
		System.out.println("insert된 개수 : " + result);
		
		result = gameInfo.updateUserInfo(2,"배틀그라운드2", 0, "슈팅", "역시 1만한 게임은 없군");
		System.out.println("update한 개수 : " +result);
		
		result = gameInfo.deleteUserInfo(1);
		System.out.println("삭제한 개수 : "+result);
		List<Map<String,String>> user = gameInfo.selectUserInfo();
		for(Map<String,String> u : user) {
			System.out.println(u);
		}
	}
}
