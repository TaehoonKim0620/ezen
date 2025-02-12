package p0203;

import java.util.Scanner;

public class Scanner4 {
	
	public static void main(String[] args) {
		// 스캐너 클래스를 사용하여
		// 사용자에게 숫자를 입력받아
		//해당 단을 출력하는 반복문을 완성하면 됩니다.
		// 1단을 출력해주세요
		for(int i = 1;i <=9 ;i++) {
			System.out.println("1" + " x " + i + " = " + 1*i);
		}
		System.out.print("몇 단을 출력할까요? : ");
		Scanner s= new Scanner(System.in);
		String str = s.nextLine();
		int num = Integer.parseInt(str);
		for(int i=1;i<=9;i++) {
			System.out.println(num + " x " + i + " = " + num*i);
			
		}
	}
}
// 자바에서 플랫폼은 '종류'를 의미한다!
// 우리가 쓰고 있는것은 SE
