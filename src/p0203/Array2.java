package p0203;

public class Array2 {
	
	public static void main(String[] args) {
		char[] hello = new char[] {'안','녕','하','세','요','.'};
		
	
		for(int i=0;i<hello.length;i++) {
			System.out.print(hello[i]);
			
		
		}
		for(int i = hello.length -1;i>=0;i--) {
			System.out.println(hello[i]);
		}
	}
}
