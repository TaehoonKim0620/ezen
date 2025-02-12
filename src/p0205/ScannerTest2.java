package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 1-10의 난수를 생성하구요
		// s의 nextLine()으로 값을 받아와서
		// 업앤다운을 완성하면 됩니다.
		// 예) 입력한 값이 4, 난수가 9 : 업
		// 입력한 값이 3 , 난수가 1 : 다운
		// 맞췄으면 맞췄다.
		Random r = new Random();
		int num = r.nextInt(10)+1;
			System.out.println("난수 : " + num);
			int num2 = 0;
				while(num != num2) {
					System.out.print("값 : ");
					String st = s.nextLine();
					num2 = Integer.parseInt(st);
					if(num < num2) {
						System.out.println("down");
					}else if(num > num2) {
						System.out.println("Up");
					}else {
						System.out.println("맞췃다");
					}
			}
	
	}
}
