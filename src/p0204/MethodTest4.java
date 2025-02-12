package p0204;

public class MethodTest4 {
	int money = 1000;
	void test() {
		System.out.println(money);
	}
	void saveMoney(int money) {
		this.money += money; // this를 하면 위에 money를 가리키는거임
	}
	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		mt.saveMoney(1000);
		System.out.println(mt.money); // 2000 
	}
}
