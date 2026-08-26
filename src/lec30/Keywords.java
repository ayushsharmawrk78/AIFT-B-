package lec30;

public class Keywords {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Demo t1 = new Demo();

		
		t1.start();


	}

}



class Demo2 extends Thread{
 static  boolean b = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	fun();
	}
	
	public static  void fun() {
		
	System.out.println("loop started");
		
		while(b==true) {
			
		}

		System.out.println(" b is false loop closed");
	
	}
	
	public static void change() {
		b = false;
	}
}
