package p0204;

public class Food extends Object // Object 상속
{// Food는 Food거나 Object로 부를 수 있다
	int price;
	String name;
	public String toString() {
		return "가격 : " + price + ", 이름 : " + name;
	}
	public static void main(String[] args) {
		Food f = new Food();
		f.name = "참치김밥";
		f.price = 5000;
		System.out.println(f);
		String str = f.toString();
		System.out.println(str);
		// toString 을 쓸 수 있는 이유가 상속이 되있음
		
	}
}
