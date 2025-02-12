package p0210;


class B 
{ 
	int a = 1;
  static C out = new C();
  static int c = 3;
} 
class C 
{ 
  void println(){ 
    System.out.println("확인"); 
 } 
}  
public class practice {
	public static void main(String[] args)  
	  { 
	    B.out.println(); 
	    System.out.println(B.c);
	    B b = new B();
	    System.out.println(b.a);
	 } 
}
