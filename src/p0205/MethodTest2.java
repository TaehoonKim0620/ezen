package p0205;

public class MethodTest2 {
	
	static int add(int n1, int n2) {
		return n1+n2;
	}
	static int minus(int n1, int n2) {
		return n1-n2;
	}
	static int multiply(int n1, int n2) {
		return n1*n2;
	}
	static int divide(int n1, int n2) {
		return n1/n2;
	}
	static int mod(int n1, int n2) {
		return n1%n2;
	}
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 4;
		System.out.println(add(n1,n2));
		System.out.println(minus(n1,n2));
		System.out.println(multiply(n1,n2));
		System.out.println(divide(n1,n2));
		System.out.println(mod(n1,n2));
	}
}
