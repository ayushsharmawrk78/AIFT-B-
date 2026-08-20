package lec28;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable task = ()->{
			System.out.println("hellol" + Thread.currentThread().getName());
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		Thread t4 = new Thread(task);
		Thread t5 = new Thread(task);
		Thread t6 = new Thread(task);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
