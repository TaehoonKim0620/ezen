package p0221;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0220.DBCon;

public class UserInfoRepository {
	public List<UserInfoVO> selectUserInfoList(UserInfoVO userInfo){
		List<UserInfoVO> userInfoList = new ArrayList<>();
		String sql = " SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO WHERE 1=1";
		List<Object> params = new ArrayList<>();
		if(userInfo != null) {
			if(userInfo.getUiName() != null) {
				sql+= " AND UI_NAME LIKE CONCAT('%',?,'%')";
				params.add(userInfo.getUiName());
			}
			if(userInfo.getUiId() != null) {
				sql+= " AND UI_ID LIKE CONCAT('%',?,'%')";
				params.add(userInfo.getUiId());
			}
			if(userInfo.getUiPwd() != null) {
				sql+= " AND UI_PWD LIKE CONCAT('%',?,'%')";
				params.add(userInfo.getUiPwd());
			}
		}
		System.out.println(sql);
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()){
			if(userInfo != null) {
				for(int i=0;i<params.size();i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			while(rs.next()) {
				UserInfoVO user = new UserInfoVO();
				user.setUiNum(rs.getInt("UI_NUM"));
				user.setUiName(rs.getString("UI_NAME"));
				user.setUiId(rs.getString("UI_ID"));
				user.setUiPwd(rs.getString("UI_PWD"));
				userInfoList.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userInfoList;
	}
	public UserInfoVO selectUserInfo(int uiNum) {
		String sql = "SELECT UI_NUM, UI_NAME, UI_PRICE FROM FOOD_INFO WHERE FI_NUM=?";
		System.out.println(sql);
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()){
			if(rs.next()) {
				UserInfoVO user = new UserInfoVO();
				user.setUiNum(rs.getInt("UI_NUM"));
				user.setUiName(rs.getString("UI_NAME"));
				user.setUiId(rs.getString("UI_ID"));
				user.setUiPwd(rs.getString("UI_PWD"));
				return user;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public int updateUserInfo(UserInfoVO userInfo) {
		String sql = "UPDATE USER_INFO SET UI_NAME=?, UI_ID=? , UI_PWD=? WHERE UI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, userInfo.getUiName());
			ps.setString(2, userInfo.getUiId());
			ps.setString(3, userInfo.getUiPwd());
			return ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteUserInfo(int uiNum) {
		String sql = "DELETE FROM USER_INFO WHERE UI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, uiNum);
			return ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int insertUserInfo(UserInfoVO userInfo) {
		String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD)"
				+" VALUES(?,?,?)";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, userInfo.getUiName());
			ps.setString(2, userInfo.getUiId());
			ps.setString(3, userInfo.getUiPwd());
			return ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateUserInfo1(UserInfoVO userInfo) {
		String sql = "UPDATE USER_INFO SET UI_NAME=?, UI_ID=?, UI_PWD=? WHERE UI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, userInfo.getUiName());
			ps.setString(2, userInfo.getUiId());
			ps.setString(3, userInfo.getUiPwd());
			ps.setInt(4, userInfo.getUiNum());
			return ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
