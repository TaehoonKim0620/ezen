package p0204;

class Mother{
	int money = 10000;
	int age;
	void test() {
		System.out.println("난 엄마 테스트");
	}
}
public class Extends extends Mother{
	
	public static void main(String[] args) {
		Extends e = new Extends();
		e.test();
		System.out.println(e.age);
		System.out.println(e.money);
	}
}
