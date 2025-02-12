package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest4 {
	
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> numsArray = new ArrayList<>();
		while(numsArray.size()<10) {
			int rNum = r.nextInt(10) + 1;
			
				if(numsArray.indexOf(rNum) == -1) {
					numsArray.add(rNum);
				} 
					
				}
		for(int i=0;i<numsArray.size();i++) {
			System.out.println("nums["+i+"] : " + numsArray.get(i));
		}
	}
}


