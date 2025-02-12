package p0206;

public class StringTest4 {
	
	public static void main(String[] args) {
		String str = "안녕하세요";
		int idx = str.indexOf("세");
		System.out.println(idx);
		idx = str.indexOf("안");
		System.out.println(idx);
		idx = str.indexOf("안녕");
		System.out.println(idx);
		idx = str.indexOf("하세요");
		System.out.println(idx);
		idx = str.indexOf("하세요."); //-1
		System.out.println(idx);
		idx = str.indexOf("ㅎ");
		System.out.println(idx); //-1
		
		str = str.replace("안","an");
		str = str.replace("하","ha");
		System.out.println(str);
		
		str = "안녕하세요";
		System.out.println(str.substring(0,2)); // 안녕
		System.out.println(str.substring(2,3)); // 하
		System.out.println(str.substring(2,2)); // 빈 문자열 ""
		// 엄청 많이 씀
	}
}
