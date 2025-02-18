package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap2 {
	static List<Map<String,String>> getList(){
		Map<String,String> m1 = new HashMap<>();
		Map<String,String> m2 = new HashMap<>();
		Map<String,String> m3 = new HashMap<>();
		Map<String,String> m4 = new HashMap<>();
		
		m1.put("year","2018");
		m1.put("week","1");
		m1.put("TV", "2031");
		m1.put("Online", "378");
		m1.put("Newspaper", "692");
		
		m2.put("year","2018");
		m2.put("week","2");
		m2.put("TV", "445");
		m2.put("Online", "393");
		m2.put("Newspaper", "451");
		
		m3.put("year","2018");
		m3.put("week","3");
		m3.put("TV", "172");
		m3.put("Online", "459");
		m3.put("Newspaper", "693");
		
		m4.put("year","2018");
		m4.put("week","4");
		m4.put("TV", "1808");
		m4.put("Online", "108");
		m4.put("Newspaper", "584");
				
		
		
		ArrayList<Map<String,String>> ary = new ArrayList<>();
		ary.add(m1);
		ary.add(m2);
		ary.add(m3);
		ary.add(m4);
		
		return ary;
	}
	public static void main(String[] args) {
		List<Map<String,String>> users = getList();
		for(Map<String,String> user : users) {
			System.out.println(user);
		}
	}
}
