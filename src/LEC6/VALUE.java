package LEC6;

public class VALUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =20;
int b =30;
System.out.println(a +"   " +b);
fun(a, b);
System.out.println(a +"   " +b);

	}
	
	public static void fun(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
	}
	

}
