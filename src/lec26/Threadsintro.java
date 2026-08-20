package lec26;

public class Threadsintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  a =10;
int b =20;
int c =a+b;


System.out.println(Thread.currentThread().getName());

 fun();

	}
	
	public static  void fun() {
		System.out.println(Thread.currentThread().getName());
	}

}
