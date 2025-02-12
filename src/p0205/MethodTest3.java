package p0205;

import java.util.Random;

public class MethodTest3 {
	static void setArray(int[] num) {
		Random r = new Random();
		for(int i=0;i<num.length;i++) {
			num[i] = r.nextInt(10);
		}
	}
	static void printArray(int [] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void main(String[] args) {
		// 1부터 10까지의 난수를 생성해서
		// nums의 각 방에 입력해주세요.
		
		int[] num = new int[5];
		setArray(num);
		printArray(num);
		
	}

}
