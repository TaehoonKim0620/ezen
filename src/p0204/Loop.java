package p0204;

public class Loop {
	
	public static void main(String[] args) {
		// 총 9개의 포문을 사용해서
		// 구구단 1단부터 9단까지 출력해주세요
		
		for(int i=1;i<=9;i++) {
			System.out.println("1" + " x " + i + " = " + 1*i);
		}
		for(int i=1;i<=9;i++) {
			System.out.println("2" + " x " + i + " = " + 2*i);
		}
		for(int i=1;i<=9;i++) {
			System.out.println("3" + " x " + i + " = " + 3*i);
		}
		for(int i=1;i<=9;i++) {
			System.out.println("4" + " x " + i + " = " + 4*i);
		}
		for(int i=1;i<=9;i++) {
			System.out.println("5" + " x " + i + " = " + 5*i);
		}
		for(int i=1;i<=9;i++) {
			System.out.println("6" + " x " + i + " = " + 6*i);
		}
		for(int i=1;i<=9;i++) {
			System.out.println("7" + " x " + i + " = " + 7*i);
		}
		for(int i=1;i<=9;i++) {
			System.out.println("8" + " x " + i + " = " + 8*i);
		}
		for(int i=1;i<=9;i++) {
			System.out.println("9" + " x " + i + " = " + 9*i);
		}
		
		// 다중 포문을 사용해서 구구단을 완성해주세요
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}
}
