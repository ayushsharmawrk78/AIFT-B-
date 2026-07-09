package LEC6;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fun(40));
fun4();
	}

	
	public static int fun(int a) {
		
		System.out.println("hello");
		 int m = fun2(20);
		return m+2;
	}
	public static int fun2(int b) {
		
		fun3();
		return b+8;
	}
	
	public static void fun3() {
		int a = 40;
		System.out.println(a);
		fun4();
		
	}
	public static int fun4() {

		return 0;}
}
