package p0210;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// 사용자한테 숫자를 입력받을 Scanner 를 만듬
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int randNum = rand.nextInt(100) + 1;
		int count = 1;
		System.out.println("답 : " + randNum);
		while(true) {
			System.out.print("1부터 100까지의 숫자를 입력해주세요");
			String str = scan.nextLine();
			System.out.println("당신이 입력한 숫자는 " + str);
			int findNum = Integer.parseInt(str);
			if(randNum > findNum) {
				System.out.println("UP!");
			}else if(randNum < findNum){
				System.out.println("Down!");
			}else {
				System.out.println(count + " 번만에 맞췄다!");break;
			}
			count++;
		}
		System.out.println("게임이 끝났습니다.");
	}
}
