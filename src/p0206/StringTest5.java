package p0206;

public class StringTest5 {
	
	public static void main(String[] args) {
		String str = " 우 리 나 라 ";
		System.out.println(str);
		int idx = str.indexOf(" ");//1
		System.out.println(idx);
		idx = str.lastIndexOf(" ");//8
		System.out.println(idx);
		System.out.println(str.replace(" ", ""));
		str = str.trim(); // 앞 뒤 공백을 제거함
		System.out.println(str);//우 리 나 라
		
		idx = str.indexOf("타"); //
		System.out.println(idx);
		if(str.indexOf("타")!=-1) {
			System.out.println("str 에는 타 라는 글자가 있다");
		}else {
			System.out.println("str에는 타라는 글자가 없다.");
		}
		boolean hasTa = str.contains("타");
		System.out.println(hasTa);
		if(hasTa) {
			System.out.println("str에는 타라는 글자가 있다.");
		}else {
			System.out.println("str에는 타라는 글자가 없다.");
		}
	}
}
