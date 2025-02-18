package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap1 {

	static List<Map<String,String>> getUserInfo(){
		Map<String,String> m = new HashMap<>();
		Map<String,String> m2 = new HashMap<>();
		Map<String,String> m3 = new HashMap<>();
		
		m.put("name", "홍길동");
		m.put("age", "22");
		m.put("id", "hong");
		
		m2.put("name", "임꺽정");
		m2.put("age", "33");
		m2.put("id", "lim");
		
		m3.put("name", "홍길동");
		m3.put("age", "16");
		m3.put("id", "yu");	
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m3);
		
		List<Map<String,String>> maps = new ArrayList<>();
		maps.add(m);
		maps.add(m2);
		maps.add(m3);
		return maps;
	}
	static int getNum() {
		return 1;
	}
	public static void main(String[] args) {
		List<Map<String,String>> users = getUserInfo();
		for(int i=0;i<users.size();i++) {
			Map<String,String> user = users.get(i);
			System.out.println("이름 : " + user.get("name"));
			System.out.println(",아이디 : " + user.get("id"));
			System.out.println(",나이 :" + user.get("age"));
		}
		for(Map<String,String> user : users) {
			System.out.println("이름 : " + user.get("name"));
			System.out.println(",아이디 : " + user.get("id"));
			System.out.println(",나이 :" + user.get("age"));
		}
	}
}
