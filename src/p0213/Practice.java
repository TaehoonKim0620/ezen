package p0213;

import java.util.ArrayList;
class Animal{
	private String name;
	private int age;
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
}

class Cat extends Animal{
}
class Dog extends Animal{
}

public class Practice {

	public static void main(String[] args) {
		Color c = new Red();
		
		if(c instanceof Red) {
			System.out.println("hi");
		}
		
	}
}
