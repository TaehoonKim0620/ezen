package p0217;

class Test{
	static {
		System.out.println("4");
	}
}
public class Scope {
	public Scope() {
		System.out.println("내 메모리를 생성했구나~");
	}
	static {
		System.out.println("2");
	}
	public static void main(String[] args) {
		new Scope();
		System.out.println("메인 메서드 실행");
	}
}
