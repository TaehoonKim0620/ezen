package p0205;

public class StaticTest {
	int i1;
	int i2;
	static int i3 = 3;
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		System.out.println(StaticTest.i3);
		System.out.println(st.i1);
		
	}
}
