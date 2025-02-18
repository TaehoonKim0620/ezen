package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap3 {
	static List<Map<String,String>> getList(){
		
		Map<String,String> m1 = new HashMap<>();
		Map<String,String> m2 = new HashMap<>();
		Map<String,String> m3 = new HashMap<>();
		
		m1.put("UI_NUM", "56");
		m1.put("UI_Name", "홍길동");
		m1.put("UI_ID", "HONG");
		m1.put("UI_PWD", "1234");
		
		m2.put("UI_NUM", "57");
		m2.put("UI_Name", "김길동");
		m2.put("UI_ID", "KIM");
		m2.put("UI_PWD", "1234");
		
		m3.put("UI_NUM", "58");
		m3.put("UI_Name", "이길동");
		m3.put("UI_ID", "LEE");
		m3.put("UI_PWD", "1234");
		
		ArrayList<Map<String,String>> ary = new ArrayList<>();
		ary.add(m1);
		ary.add(m2);
		ary.add(m1);
		
		return ary;
	}
	public static void main(String[] args) {
		List<Map<String,String>> users = getList();
		for(Map<String,String> user : users) {
			System.out.println(user);
		}
	}
}
