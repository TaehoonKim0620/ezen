package p0207;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		System.out.println(str1 == str2);
		
		String str3 = null;
		System.out.println(str2 == str3);
		System.out.println(str2 == str3);
		
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		
//		System.out.println(str3.equals("안녕")); //str3이 null 이면 메모리를 생성 안했으므로 오류남
		System.out.println(str3!=null && str3.equals("안녕"));
		System.out.println("안녕".equals(str2)); // null 은 메모리가 없어서 안됨 문자열 먼저 쓰면 메모리생성됨
	}
}
