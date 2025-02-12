package p0206;

import java.util.Random;
import java.util.Scanner;

public class Baseball2 {
	
		public static void main(String[] args) {
			int[] nums = new int[3];
			Random r = new Random();
			for(int i=0;i<nums.length;i++) {
				nums[i] = r.nextInt(10);
			}
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums[i]);
			}
			Scanner s = new Scanner(System.in);
			
			while(true) {
				System.out.println("숫자3개 : ");
			String num = s.nextLine();
			String[]strs = num.split(",");
			int[] myNums = new int[strs.length];
				for(int i=0;i<strs.length;i++) {
					myNums[i] = Integer.parseInt(strs[i]);
				}
			
			int strike = 0;
			int ball = 0;
			for(int i=0;i<nums.length;i++) {
				for(int j=0;j<myNums.length;j++) {
					if(nums[i] == myNums[j]) {
						if(i==j) {
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			if(strike ==0 &&ball==0) {
				System.out.println("아웃");
			}else {
				System.out.println(strike + "스트라이크, " +ball+"볼");
			}
			if(strike==3) {
				break;
			}
		}
			System.out.println("게임이 끝났습니다");
	}
}
