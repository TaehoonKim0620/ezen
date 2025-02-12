package p0205;

public class Loop2 {
	public static void main(String[] args) {
		//1부터 100까지 출력하는 반복문
		for(int i=1;i<=100;i++) {
			//5의 배수일때는 만세 아닐때는 숫자를 출력
			if(i%10==3 || i/10 == 3) {
				System.out.println("짝");
				if(i%5==0) {
				System.out.println("만세짝");
				}
			}else if(i%5==0){
				System.out.println("만세");
			}else {
				System.out.println(i);
			}
		}
	}
}
