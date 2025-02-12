package p0210;

import java.util.ArrayList;
import java.util.Random;

public class FindMinNum {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		// 0
		Random r = new Random();

		while(nums.size()<10){
			int rNum = r.nextInt(50) + 1; //rNum은 1부터 100까지 나올 수 있음
			if(nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			}
		}
		System.out.println(nums); // 1
		
		int min = 0;
		for(int i=0;i<nums.size();i++) {
			if(min == 0) {
				min = nums.get(i);
			}
			else if(nums.get(i) < min) {
				min = nums.get(i);
			}
		}
		for(int i=1;i<=50;i++) {
			if(nums.indexOf(i)!=-1) {
				System.out.println(i);
			}
		}
		System.out.println(min);
		
	}
}
