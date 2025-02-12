package p0203;

public class Scope {
	
	public static void main(String[] args) {
		int i = 1;
		if(i==1) {
			System.out.println("i는 1이구나");
		}
	}
	
	void test() {
		int i = 1; // i가 10라인에서 죽으므로 다시 선언 가능.
	}
}
