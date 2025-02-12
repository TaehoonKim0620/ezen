package p0212;

public class Human {
	private String name;
	private int age;
	private String address;
	private double weight;
	/*
	 * 모든 멤버변수는 private으로 선언한다.
	 * 대신 값을 셋팅하고 겟할 수 있는
	 * public get set 메소드를 만든다.
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setweight(double weight) {
		this.weight = weight;
	}
	public double getweight() {
		return weight;
	}
	public String toString() {
		return "[name=" + name + ",age=" +age + "address=" + address +",weight" + weight + "]";
	}
	
}
class Execute{
	public static void main(String[] args) {
		Human h = new Human();
		// name = 홍길동, age = 30, address = 서울, weight = 70.5
		h.setName("홍길동");
		System.out.println("name = " + h.getName());
		h.setAge(30);
		System.out.println("age = " + h.getAge());
		h.setAddress("서울");
		h.setweight(70.5);
		System.out.println("address = " + h.getAddress());
		System.out.println("weight = " + h.getweight());
		System.out.println(h);
	}
}
