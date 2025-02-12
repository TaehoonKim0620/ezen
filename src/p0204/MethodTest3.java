package p0204;

public class MethodTest3 {
	int coffeePrice = 1000;
	int getCoffee(int money) {
		return money - coffeePrice;
	}
	public static void main(String[] args) {
		MethodTest3 nt = new MethodTest3();
		// getCoffee를 2000을 넣고 호출했을때
		// 커피값을뺀 나머지 잔돈을 출력하는 코딩을 완성하세요.
		int minusMoney = nt.getCoffee(2000);
		System.out.println(minusMoney);
		
	}
}
