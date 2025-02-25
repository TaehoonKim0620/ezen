package p0221;

class Test{
	public void test() {
		System.out.println("1");
	}
}
public class Overloading extends Test{
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println();
		Object o = new Test();
		System.out.println(o.test());
	}
}
