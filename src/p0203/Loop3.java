package p0203;

public class Loop3 {

	public static void main(String[] args) {
		//짝수일때만 출력
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//홀수일 때만 출력
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
}
