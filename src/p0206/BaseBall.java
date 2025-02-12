package p0206;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// int[] nums라는 배열변수에
		// 0-9까지의 난수 3개를 입력하시고
		// 아래에서 비교하여 볼 스트라이크를 출력하고
		// 3개의 숫자와 자리수까지 다 맞으면 아웃이라고 출력후 반복분이 끝나면 됩니다.
		int[] nums = new int[3];
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(10);
		
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		while(true) {
			System.out.println("숫자 3개 : ");
			String num = s.nextLine();
			String[] st = num.split(",");
			int [] nump = new int[st.length];
			for(int i=0;i<st.length;i++) {
				 nump[i] = Integer.parseInt(st[i]);
				
			}
			int point = 0;
			for(int i=0;i<st.length;i++) {
				
				if(nums[i] == nump[i]) {
					System.out.println("스트라이크");
					point++;
				}
					else {
						for(int j=0;j<st.length;j++) {
							if(nums[j] == nump[i]) {
								System.out.println("볼");
							}
						}
					}
				if(point == 3) {
					System.out.println("아웃"); break;
				}
				
			}
			if(point == 3) break;
			System.out.println("니가 쓴 숫자 : " + num);
		}
		
	}
}
