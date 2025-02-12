package p0211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {
		ArrayList<Map<String,Integer>> ary = new ArrayList<>();
		HashMap<String,Integer> map = new HashMap<>();
		for(int i = 1;i<=2;i++) {
			map.put("번호", i);
			ary.add(map);
		}
		System.out.println(ary);
	}
}
