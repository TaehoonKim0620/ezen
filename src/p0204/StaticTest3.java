package p0204;

class Test{
	static int num1 = 1; // 접근제어자가 없으면 default 같은 패키지에서 사용가능
	int num2 = 2;					// private 은 같은 클래스 안에서 사용가능
}
public class StaticTest3 {
	static int num1;
	public static void main(String[] args) {
		System.out.println(Test.num1);
		Test t = new Test();
		System.out.println(t.num2);
	}
}
