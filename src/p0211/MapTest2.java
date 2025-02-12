package p0211;

import java.util.HashMap;

public class MapTest2 {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("age", "33");
		map.put("address", "한양");
		map.put("job", "도적");
		System.out.println(map);
		// 중요
		// ArrayList의 장점 : 순서대로 저장하고 순서대로 출력할 때 제일 빠름
		// 순서가 중요할 때 사용함
		// ArrayList는 그래서 element가 중요함
		// hashmap 은 key, value가 중요함
		// map은 순서가 없다(입력한대로 출력되지 않는다)
	}
}
		
