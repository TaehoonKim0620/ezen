package p0211;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("로또번호를 ,를 기준으로 입력 : ");
		String lotto = scan.nextLine();
		System.out.println("니가 입력한 로또번호 : " + lotto);
		
		
		String[]strs = lotto.split(",");
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		while(nums.size() < 6) {
			int rNum = r.nextInt(45) + 1;
			if(nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			}
		}
		System.out.println(nums);
		int count=0;
		for(int i=0;i<strs.length;i++) {
			int num1 = Integer.parseInt(strs[i]);
		
		for(int j = 0;j <nums.size();j++) {
				if(nums.indexOf(num1) != -1) {
					count ++;break;
				}
			}
		
		}
		System.out.println("count : " + count);
		if(count==6) {
			System.out.println("다맞췄다");
		}else if(count == 5) {
			System.out.println("5개 맞췄다");
		}else if(count == 4) {
			System.out.println("4개 맞췄다");
		}else {
			System.out.println("꽝");
		}
		
	}
}
