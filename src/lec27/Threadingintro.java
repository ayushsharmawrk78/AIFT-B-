package lec27;



public class Threadingintro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			

	threaddemo t1 = new threaddemo();

	threaddemo t2 = new threaddemo();

	t1.start();
 
Thread.sleep(1000);
t1.m1();
		}

	}


	class threaddemo extends Thread{
	//volatile   static boolean  flag = true;
		
		
 static boolean  flag = true;
		
		@Override
		
		public void run() {
			System.out.println("hey i am running");
			
			while(flag==true) {
				
				
	
			}
			System.out.println("hi");
		}
		
		
		
		public static void m1 () {
	try {
		flag = false;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			System.out.println("flag==false");
		}
		
		
	}
