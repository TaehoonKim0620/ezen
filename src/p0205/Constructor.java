package p0205;

import java.util.Scanner;

public class Constructor {
	public Constructor() { // 생성자도 오버로딩이 됨
		System.out.println("클래스 메모리 생성");
	}
	public Constructor(int i) {
		System.out.println("1");
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(c);
		Scanner s = new Scanner(System.in);
	}
}
