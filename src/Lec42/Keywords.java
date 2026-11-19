package Lec42;

import java.util.concurrent.locks.ReentrantLock;

public class Keywords {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Runnable r = ()->{
	
Counter.increment();
};


Thread t1 = new Thread(r);
Thread t2 = new Thread(r);

t1.start();
t2.start();


t1.join();
t2.join();


System.out.println(Counter.count);
	}

}

class Counter {
static int count =0;
static ReentrantLock lk = new ReentrantLock();
	
	public static  void increment() {
	
		//lk.lock();
		
		for (int i = 0; i < 1000; i++) {
	
			Counter.count++;
		}
		//lk.unlock();
	}
	
}
