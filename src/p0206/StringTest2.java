package p0206;

class Test2{
	public int toInt() {
		return 1;
	}
	public String toString() {
		return "abc";
	}
}
public class StringTest2 extends Test2{
	
	public static void main(String[] args) {
		// 오버라이딩의 조건 : 무조건 상속관계
		// 메서드명이 같아야됨
		// 아빠가 정의되어있는걸 자손이 바꿀 수 없음 (데이터 타입이 같아야됨)
		StringTest2 st = new StringTest2();
		int num = st.toInt();
		System.out.println(num);
		String str = st.toString();
		System.out.println(str);
		
		Object o = new StringTest2();
		System.out.println(o);
	}
}
