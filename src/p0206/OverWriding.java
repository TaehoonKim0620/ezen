package p0206;

class Father{
	void work() {
		System.out.println("아빠가 일합니다.");
	}
}
// Ovewriding, Father, Object 로 부를 수 있음
public class OverWriding extends Father{
	
	public static void main(String[] args) {
		OverWriding o = new OverWriding();
		o.work();
		Father f = new OverWriding();
		o.work();
		Object ob = new OverWriding();
		
	}
}
