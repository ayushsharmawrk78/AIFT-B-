package lec15;

public class Exceptionassinment {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
fun(20);
	}
	
	
	public static void fun(int a )  throws Exception{
		if(a<0) {
			throw new Exception("hello");	
		}
		else {
			System.out.println(" i was in fun1 ");
			fun2(-4);
		}
	
	}
	public  static void fun2(int a)  throws Exception{
		if(a<2) {
		
		throw new Exception("hello i am in fun2");
		}
		else {
			System.out.println("hello no exception");
		}
		

		
	}

}
