package p0211;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListTest3 {
	
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>();
		Random r = new Random();
		while(strs.size()<6) {
			String rNum = r.nextInt(45) + 1 + "";
			if(strs.indexOf(rNum) == -1) {
				strs.add(rNum);
			}
		}
		for(int i=0;i<6;i++) {
			int num = Integer.parseInt(strs.get(1));
		}
		int num2 = Integer.parseInt(strs.get(1));
		System.out.println(strs);
		Scanner s = new Scanner(System.in);
		System.out.print(",를 사용하여 6개의 숫자를 적어주세요 : ");
		String m = s.nextLine();
		String[] k = m.split(",");
		

		int count=0;
		for(int i=0;i<strs.size();i++) {	
			for(int j=0;j<k.length;j++) {
				if(k[i].indexOf(strs.get(j)) != -1) {
					count++;
				}
			}
		}
		System.out.println("count : " + count);
	}
}
