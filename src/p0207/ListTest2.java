package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			nums.add(r.nextInt(100)+1);
		}
		System.out.println(nums); // ArrayList 쓰는 이유 처음부터 끝까지 순서대로 입력을 하거나
		// 순서대로 값을 출력할때 엄청빠름.
		// 단점 : 하나 제거 했을때 뒤에 인덱스값을 전부 다 하나씩 앞으로 옮김.
		nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		int idx = nums.indexOf(1);//0
		System.out.println(idx);
		idx = nums.indexOf(3); // 2
		System.out.println(idx);
		idx = nums.indexOf(4); //-1
		System.out.println(idx);
		
		
		
	}
}
