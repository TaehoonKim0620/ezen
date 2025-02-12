package p0204;

public class MethodTest {
	int i;
	// 오버로딩이 성립하려면 같은영역 이여야 됨
	static void test() {
		System.out.println("첫번째 테스트");
	}
	static void test(int i) {
		System.out.println("두번째 테스트");
	}
	static void test(String i) {
		System.out.println("세번째 테스트");
	}
	static void test(int i, String i2) {
		System.out.println("네번째 테스트");
	}
	static void test(String i, int i2) {
		System.out.println("다섯번째 테스트");
	}
	public static void main(String[] args) {
		test(1);
	}
}
