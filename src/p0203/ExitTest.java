package p0203;

public class ExitTest {
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i == 5) {
				return;
			}
		}
		System.out.println("반복문이 종료되었습니다.");
	}
}
// System.exit(0) 이라고 쓰면 프로그램을 완전히 종료시켜버림..