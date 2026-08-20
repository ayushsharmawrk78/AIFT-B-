package lec28;

public class Demo2 {

	
	public static void main(String[] args) {
//		Runnable t = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("hello from runnable");
//			}
//		};
		Runnable t =()->{
			
		};
	Thread m = new Thread(t);
	}
	
	
}


