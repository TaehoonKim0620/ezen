package p0211;

import java.util.ArrayList;

public class ListTest2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(7);
		nums.add(1);
		nums.add(5);
		
		// nums에서 제일 작은 값을 찾은 뒤에
		// 0번째 방과 값을 바꾼뒤에 출력하면 됩니다.
		int min = nums.get(0);
		int sun = 0;
		for(int i=1;i<nums.size();i++) {

			if(min > nums.get(i)) {
				min = nums.get(i);
				sun = i;
			}
		}
		int tmp = nums.get(0);
		nums.set(0, nums.get(sun));
		nums.set(sun, tmp);
		System.out.println(nums);
	}
}
