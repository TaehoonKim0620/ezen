package p0224;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {

	private static SqlSessionFactory ssf;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			ssf = ssfb.build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSSF() {
		return ssf;
	}

	public static void main(String[] args) {
			System.out.println(ssf);
			try(SqlSession session = ssf.openSession();){
			System.out.println(session);
			List<Map<String,String>> foodInfos = session.selectList("p0224.FoodInfoMapper.selectFoodInfos");
			for(Map<String,String>foodInfo:foodInfos) {
				System.out.println(foodInfo);
			}
			System.out.println(foodInfos);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
