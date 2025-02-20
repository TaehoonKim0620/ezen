package p0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserInfoRepository {
	public UserInfoVO selectUserInfo(int fiNum) {
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FORM USER_INFO"
				+ " WHERE UI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, fiNum);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				UserInfoVO user = new UserInfoVO();
				user.setUiNum(rs.getInt("UI_NUM"));
				user.setUiName(rs.getString("UI_NAME"));
				user.setUiId(rs.getString("UI_ID"));
				user.setUiPwd(rs.getInt("UI_PWD"));
				return user;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<UserInfoVO> selectUserInfoList(UserInfoVO userInfo){
		List<UserInfoVO> userInfoList = new ArrayList<>();
		String sql = " SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO WHERE 1=1";
		if(userInfo!=null) {
			if(userInfo.getUiName()!=null && userInfo.getUiName().length() != 0) {
				sql += " AND UI_NAME LIKE CONCAT('%',?,'%')";
			}
			if(userInfo.getUiId()!=null) {
				sql += " AND UI_ID=?";
			}
			if(userInfo.getUiPwd()!=0) {
				sql += " AND UI_PWD=?";
			}
		}
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			
			if(userInfo != null) {
				if(userInfo.getUiName()!=null && userInfo.getUiName().length()!=0) {
					ps.setString(1,userInfo.getUiName());
					if(userInfo.getUiId()!=null && userInfo.getUiId().length()!=0) {
						ps.setString(2,userInfo.getUiId());
						if(userInfo.getUiPwd() != 0) {
							ps.setInt(3, userInfo.getUiPwd());
						}
					}
					else if(userInfo.getUiPwd() != 0){
						ps.setInt(2, userInfo.getUiPwd());
					}
					
				}
				else if(userInfo.getUiId()!=null && userInfo.getUiId().length()!=0) {
					ps.setString(1,userInfo.getUiId());
					if(userInfo.getUiPwd() != 0) {
						ps.setInt(1, userInfo.getUiPwd());
					}
				}
				else if(userInfo.getUiPwd() != 0) {
					ps.setInt(1, userInfo.getUiPwd());
				}
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				UserInfoVO user = new UserInfoVO();
				user.setUiNum(rs.getInt("UI_NUM"));
				user.setUiName(rs.getString("UI_ID"));
				user.setUiId(rs.getString("UI_ID"));
				userInfoList.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userInfoList;
	}
}
