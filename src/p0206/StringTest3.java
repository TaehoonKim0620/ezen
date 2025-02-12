package p0206;


public class StringTest3 {
	
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i==1);// true
		double b1 = 1;
		System.out.println(b1); // 1.0
		System.out.println(b1+1); // 2.0
		System.out.println(b1==1);
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "안녕";
		String str4 = "안녕";
		System.out.println(str3==str4);
	}
}
