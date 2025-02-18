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

public class GameInfoURUD {
	static List<Map<String,String>> getGames(){
		List<Map<String,String>> games = new ArrayList<>();
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
			String sql = " SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO;";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> mp = new HashMap<>();
				String giNum = rs.getString("GI_NUM");
				String giName = rs.getString("GI_NAME");
				String giPrice = rs.getString("GI_PRICE");
				mp.put("giNum", giNum);
				mp.put("giName", giName);
				mp.put("giPrice", giPrice);
				games.add(mp);
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
		return games;
	}
static int updateGameInfo(String giName, int giPrice, String giGenre, String giDesc){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "update GAME_INFO"
					+ " set GI_NAME ='"+ giName+"'"
					+ " ,GI_PRICE=" + giPrice
					+ " ,GI_GENRE='"+ giGenre+"'"
					+ " ,GI_DESC='"+ giDesc+"'"
					+ " where GI_NUM=2";
			return stmt.executeUpdate(sql);
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
		return 0;
	}
static int insertGameInfo(String giName,int giPrice,String giGenre,String giDesc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = " INSERT INTO GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)";
			sql += " VALUES('"+ giName + "'," + giPrice + ",'"+giGenre+ "','"+giDesc+"')";
			return stmt.executeUpdate(sql);
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
		return 0;
	}
static int deleteGameInfo(int num) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = " DELETE FROM GAME_INFO WHERE GI_NUM=" + num;
			return stmt.executeUpdate(sql);
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
		return 0;
	}
	public static void main(String[] args) {
		int result = insertGameInfo("배틀그라운드",0,"슈팅","뭐..재밌지");
		System.out.println("입력된 갯수 : " + result);
		result = updateGameInfo("배틀그라운드",0,"슈팅","뭐..재밌지");
		System.out.println("업데이트된 갯수 : " + result);
		result = deleteGameInfo(2);
		System.out.println("삭제된 갯수 : " +result);
		List<Map<String,String>> games = getGames();
		for(Map<String,String> game : games) {
			System.out.println(game);
		}
	}
}
