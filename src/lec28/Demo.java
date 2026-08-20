package lec28;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  a =10;
int b=20;
//System.out.println(a+b);
fun();

Mythread t1 = new Mythread();
Mythread t2 = new Mythread();
t2.start();
t1.run();// main
System.out.println(t1.getState());
t1.start();

System.out.println(t1.getState());
//System.out.println(Thread.currentThread().getName());
	}
	
	
	
	
public static void fun() {
	System.out.println(Thread.currentThread().getName());
}



}
class Mythread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Demo.fun();
	}
}
