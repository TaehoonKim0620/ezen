package p0212;

import java.util.ArrayList;

public class practice {
	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			int age = (int)(Math.random()*50 + 1);
			double weight = Math.random()*100 + 50;
			Human h = new Human(); 
			h.setName("이름" + i);
			h.setAddress("주소" + i);
			h.setAge(age);
			h.setweight(weight);
			list.add(h);
		}
		
		for(Human h: list) {
			System.out.println(h);
		}
	}
}
