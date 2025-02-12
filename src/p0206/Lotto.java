package p0206;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	static boolean exists(int[] nums, int num) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] nums = new int[6];
		// 1-45의 난수를 생성하여
		// 반복문을 사용해 nums각 배열에 대입하고
		// 반복문을 사용해서 출력해주세요.
		
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(45) + 1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		// 스캐너 클래스를 사용해서
		// 사용자에게 1-45까지 숫자를 ","를 기준으로 6개 입력받아
		// int[] lotto에 저장하여
		// 위에서 생성된 nums와 비교하여 몇개의 숫자가 맞았는지 
		// 출력하는 코드를 완성하세요.
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String str = s.nextLine();
		String[] strs = str.split(",");
		int[] lotto = new int[strs.length];
		for(int i=0;i<strs.length;i++) {
			lotto[i] = Integer.parseInt(strs[i]);
		}
		int total = 0;
		for(int i=0;i<strs.length;i++) {
			
				if(exists(nums,lotto[i])) {
					total++;
				}
			
		}
		System.out.println("맞춘 숫자의 개수 : " + total);
	}
}
