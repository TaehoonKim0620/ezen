package p0207;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		int[] nums = new int[3];
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list.size());// 자바의 모든 데이더타입은 Object라고 부를 수 있음
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(22);
		list.add(31);
		System.out.println(list.size());
		list.remove(1); // 1번째 인덱스값을 지우고 다 한칸씩 앞으로 옮긴 후 맨 마지막 인덱스 지움
		System.out.println(list.size());
		
	}
}
