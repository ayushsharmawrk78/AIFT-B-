package Lec29;

import java.util.Iterator;

public class MultithreadIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



//		for (int i = 0; i <100; i++) {
//			System.out.println(i+ Thread.currentThread().getName());
//		}
		
	
//		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		t2.start();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}
			
		//System.out.println("helloo");
//		t1.start();
//
//t2.start();
System.out.println("hello");
		
		

	}

}

class Mythread extends Thread{
	
	@Override
	public void run()  {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+ Thread.currentThread().getName());
			
		}
	}
}
class Mythread2 extends Thread{
	
	@Override
	public void run()  {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(i+ " "+Thread.currentThread().getName());
			
		}
	}
}
