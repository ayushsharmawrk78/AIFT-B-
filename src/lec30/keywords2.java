package lec30;

public class keywords2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Type t1 = new Type();

Type t2 = new Type();
t1.start();
t2.start();


System.out.println(Type.count);
	}

}

class Type extends Thread {
 static    int count =0;
	
	
public  synchronized  void counterinc() {
	for (int i = 0; i < 1000; i++) {
		count++;
	}
}
@Override
public void run() {
	// TODO Auto-generated method stub
counterinc();
}
}


