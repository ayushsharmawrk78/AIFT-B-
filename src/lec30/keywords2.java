package lec30;

public class keywords2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Type obj = new Type();





Runnable task =() -> {
	obj.counterinc();
};
Thread t1 = new Thread(task);
Thread t2 = new Thread(task);
t1.start();
t2.start();

t1.join();
t2.join();
System.out.println(Type.count);
	}

}

class Type {
 static    int count =0;
	
	
public   synchronized void counterinc() {
	for (int i = 0; i < 5000; i++) {
		count++;
	}
}

}


