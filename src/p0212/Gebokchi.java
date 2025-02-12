package p0212;
import java.util.ArrayList;

public class Gebokchi {
	private String status;
	private int exp;
	private String dangerFood;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getDangerFood() {
		return dangerFood;
	}
	public void setDangerFood(String dangerFood) {
		this.dangerFood = dangerFood;
	}
	public String toString() {
		return "상태 : " + status + " 경험치 : " + exp + " 위험한 음식 : " + dangerFood;
	}
}

class Fish{
	public static void main(String[] args) {
		ArrayList<Gebokchi> bokchi = new ArrayList<>();
		Gebokchi bok1 = new Gebokchi();
		Gebokchi bok2 = new Gebokchi();
		Gebokchi bok3 = new Gebokchi();
		Gebokchi bok4 = new Gebokchi();
		Gebokchi bok5 = new Gebokchi();
		
		bok1.setStatus("생존");
		bok1.setExp(555);
		bok1.setDangerFood("해파리");
		
		bok2.setStatus("사망");
		bok2.setExp(5534);
		bok2.setDangerFood("오징어");
		
		bok3.setStatus("생존");
		bok3.setExp(1004);
		bok3.setDangerFood("정어리");
		
		bok4.setStatus("돌연사");
		bok4.setExp(2030);
		bok4.setDangerFood("게");
		
		bok5.setStatus("생존");
		bok5.setExp(3333);
		bok5.setDangerFood("가리비");
		
		bokchi.add(bok1);
		bokchi.add(bok2);
		bokchi.add(bok3);
		bokchi.add(bok4);
		bokchi.add(bok5);
		
		for(Gebokchi b : bokchi) {
			System.out.println(b);
		}
	}
}
