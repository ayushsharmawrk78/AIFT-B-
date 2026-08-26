package lec30;

import java.util.Iterator;

public class Muti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Runnable task = () -> {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i+Thread.currentThread().getName());
		
		}
		
		
		
		};
	Thread t1 = new Thread(task);
	t1.start();
	
		Mythread t2 = new Mythread();
		t2.start();
		
	//t2.join();
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i+Thread.currentThread().getName());
//		}
//		 
//	}

}}

class Mythread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 100; i++) {
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(i+Thread.currentThread().getName());
	}


	
	}
}
