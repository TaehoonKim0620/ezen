package p0212;

import java.util.ArrayList;

public class ListTest {
	
	public static void main(String[] args) {
		ArrayList<Human> people = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			int age = (int)(Math.random() * 100) + 1;
			int weight = (int)(Math.random() * 50) + 50; 
			Human h = new Human();
			h.setName("이름" + i);
			h.setAddress("주소" + i);
			h.setAge(age);
			h.setweight(weight);
			people.add(h);
		}
		System.out.println(people);
		for(int i=0;i<people.size();i++) {
			Human h = people.get(i);
			System.out.println(h);
		}
		for(Human h : people) { // people 에 있는 값을 h 에 대입함.
			System.out.println(h);
		}
	}
}
