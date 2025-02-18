package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap5 {
	public static void main(String[] args) {
		String[] colunms = { "name","age","id" };
		String[] datas = {
				"홍길동,22,hong",
				"임꺽정,33,lim",
				"유관순,16,yu"
		};
		List<Map<String,String>> users = new ArrayList<>();
		for(String data : datas) {
			String[] userData = data.split(",");
			Map<String,String> user = new HashMap<>();	
			for(int i=0;i<colunms.length;i++) {
				user.put(colunms[i], userData[i]);
			}
			users.add(user);
		}
		for(Map<String,String> user : users) {
			System.out.println(user);
		}
		
	}
}
