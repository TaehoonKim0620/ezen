package p0221;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0220.DBCon;

public class GameInfoRepository2 {
	public List<GameInfoVO> selectGameInfoList(GameInfoVO gameInfo){
		List<GameInfoVO> gameInfoList = new ArrayList<>();
		String sql = "SELECT GI_NUM,GI_NAME,GI_PRICE,GI_GENRE,GI_DESC FROM GAME_INFO WHERE 1=1";
		List<Object> params = new ArrayList<>();
		if(gameInfo.getGiName()!=null) {
			sql+= " AND GI_NAME LIKE CONCAT('%',?,'%')";
			params.add(gameInfo.getGiName());
		}
		if(gameInfo.getGiPrice()!=0) {
			sql+= " AND GI_PRICE LIKE CONCAT('%',?,'%')";
			params.add(gameInfo.getGiPrice());
		}
		if(gameInfo.getGiGenre()!=null) {
			sql+= " AND GI_GENRE LIKE CONCAT('%',?,'%')";
			params.add(gameInfo.getGiGenre());
		}
		if(gameInfo.getGiDesc()!=null) {
			sql+= " AND GI_DESC LIKE CONCAT('%',?,'%')";
			params.add(gameInfo.getGiDesc());
		}
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql)){
			if(gameInfo!=null) {
				if(gameInfo.getGiName()!=null){
					
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
