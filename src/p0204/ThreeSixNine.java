package p0204;

public class ThreeSixNine {

	public static void main(String[] args) {
		// 1부터 100까지 출력하되
		// 3,6,9가 들어가면 모두 짝을 출력해주세요.
		
		for(int i=1;i<=100;i++) {
			int num1 = i % 10;
			int num2 = i / 10;
			if((num1!=0 && num1 % 3 == 0) || (num2 % 3 == 0 && i>10)) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
	}
}
