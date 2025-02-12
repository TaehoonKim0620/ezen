package p0210;

import java.util.Scanner;

public class Calc2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("계산할값을 숫자, 연산자 ,숫자 : ");
			String calcStr = s.nextLine();
			System.out.println("니가 입력한 값 : " + calcStr);
			if("q".equals(calcStr.toLowerCase())) {
				break;
			}
			String[] str = calcStr.split(",");
			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[2]);
			String operator = str[1];
			if(operator.equals("+")) {
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			}else if(operator.equals("-")) {
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			}else if(operator.equals("*")) {
				System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
			}else if(operator.equals("/")) {
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			}else if(operator.equals("%")) {
				System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
			}else {
				System.out.println("알 수 없는 연산자입니다.");
			}
		}
		System.out.println("계산기가 종료되었습니다.");
	}
}

