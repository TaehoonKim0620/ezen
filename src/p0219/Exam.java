package p0219;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam {
	public static void main(String[] args) {
		String fiName = "불고기";
		int fiPrice = 20000;
		try(Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();){
			String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE)"
					+ " VALUES('" + fiName + "'," + fiPrice + ")";
			int result = stmt.executeUpdate(sql);
			System.out.println("입력된 갯수 : " +result);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		String sql = "INSERT INTO FOOD_INFO(FI_NAME,FI_PRICE)"
				+ " VALUES(?,?)";
		try(Connection)
	}
}
