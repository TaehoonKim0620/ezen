package p0203;

import java.util.Scanner;

public class Scanner5 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 숫자를 써주세요 : ");
		String numStr = s.nextLine();
		
		System.out.println("입력한 숫자 : " + numStr);
		int num = Integer.parseInt(numStr);
		
		// 쓴 숫자부터 시작해서 0까지 출력하는 반복문을 만들어주세요
		for(int i = num; i>=0; i--) {
			System.out.println(i);
		}
	}
}
