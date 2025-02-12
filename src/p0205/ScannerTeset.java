package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTeset {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("생각하는 숫자를 작성해주세요 : ");
		String numStr = s.nextLine();
		System.out.println("니가 쓴 숫자는 : " + numStr);
		int num = Integer.parseInt(numStr);
		Random r = new Random();
		int rNum = r.nextInt(10) + 1;
		System.out.println("니가 쓴 숫자는 : "+ numStr);
		if(rNum == num) {
			System.out.println("맞췃다!");
		}else {
			System.out.println("틀렷다!");
			}
		System.out.println("난수 : " + rNum);
	}
}
