package lec34;

import java.util.ArrayList;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Vector<Integer>ll= new Vector<>();

Runnable task = () -> {
	
	for (int i = 0; i < 1000; i++) {
		ll.add(i);
	}
};

Thread t1 = new Thread(task);
Thread t2 = new Thread(task);

t1.start();

t2.start();
t1.join();
t2.join();


System.out.println(ll.size());
	}
	
	
	

}
