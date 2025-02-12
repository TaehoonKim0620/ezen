package p0212;

import java.util.ArrayList;

public class Drink {
	private String what;
	private int price;
	private double when;
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWhen() {
		return when;
	}
	public void setWhen(double when) {
		this.when = when;
	}
	public String toString() {
		return "Drink [what=" + what + ", price=" + price + ", when=" + when + ", getWhat()=" + getWhat()
				+ ", getPrice()=" + getPrice() + ", getWhen()=" + getWhen() + "]";
	}
	
}
class DrinkDrink{
	public static void main(String[] args) {
		ArrayList<Drink> drinks = new ArrayList<>();
		Drink drink1 = new Drink();
		Drink drink2 = new Drink();
		Drink drink3 = new Drink();
		Drink drink4 = new Drink();
		Drink drink5 = new Drink();
		
		drink1.setWhat("칠성사이다");
		drink1.setPrice(1500);
		drink1.setWhen(1.5);
		
		drink2.setWhat("코카콜라");
		drink2.setPrice(2000);
		drink2.setWhen(1.8);
		
		drink3.setWhat("포카리스웨트");
		drink3.setPrice(900);
		drink3.setWhen(2.1);
		
		drink4.setWhat("토레타");
		drink4.setPrice(2100);
		drink4.setWhen(3.3);
		
		drink5.setWhat("파워에이드");
		drink5.setPrice(2300);
		drink5.setWhen(6.5);
		
		drinks.add(drink1);
		drinks.add(drink2);
		drinks.add(drink3);
		drinks.add(drink4);
		drinks.add(drink5);
		
		for(Drink d : drinks) {
			System.out.println(d);
		}
	}
}
