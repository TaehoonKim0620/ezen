package p0210.review;

public class Gugudan {
	static void printGugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.print(dan + " x " + i + " = " + dan*i);
			if(i!=9) {
				System.out.print(",");
			}
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			printGugudan(i);
			System.out.println();
		}
	}
}
