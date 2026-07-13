package lec15;

public class Exceptionmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//fun();


		
		try {
			int []arr = new int [10];
			int a =10/2;
			System.out.println(arr[11]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("hello you got something divided by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
			System.out.println("hello you accessed wrong index");
		}finally {
			System.out.println("hellooooooooooooooo");
		}






	}
	
	
	public static void fun() {
		try {
			fun2();
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("helllo got an exception");
		}
	}
	
	public static void fun2() {
		fun3();
	}
	public static void fun3() {
	
		fun4();
	}
	public static void fun4() {
		
		
		int a =10/0;
	}
	

}
