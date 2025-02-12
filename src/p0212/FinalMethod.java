package p0212;

class Mother{
	void test() {
		System.out.println("난 엄마 테스트");
	}
}
public class FinalMethod extends Mother{
	void test(int a) {
		System.out.println("그냥 테스트");
	}
	public static void main(String[] args) {
		FinalMethod fm = new FinalMethod();
		Mother m = new FinalMethod();
		fm.test(); // 엄마 테스트
		Object o = new FinalMethod();
		m.test(); // 엄마 테스트
//		o.test() 사용 불가능
	}
}
