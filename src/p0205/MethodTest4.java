package p0205;
	
public class MethodTest4 {
	static void printGugudan(int dan) {
		for(int i = 1;i<10;i++) {
			System.out.println(dan + " x " + i  + " = " + dan *i);
		}
	}
	public static void main(String[] args) {
		int dan = 2;
		for(int i=1;i<10;i++) {
			printGugudan(i);
		}
	}
}
