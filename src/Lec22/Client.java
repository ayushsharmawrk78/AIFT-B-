package Lec22;

public class Client {

	public static void main(String[] args) {

		
		Demo d  = new Demo() {
			
			@Override
			public void fun2() {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println(d.getClass());
		Child c = new Child();
		System.out.println(c.getClass());
c.fun();
		

	}

}
