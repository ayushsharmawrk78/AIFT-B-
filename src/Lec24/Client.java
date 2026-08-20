package Lec24;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B obj = new B();
//A obj2 = new A();
//A obj3 = new B();
//B obj4 = new B();
//System.out.println(obj.getClass());
//System.out.println(obj2.getClass());
//System.out.println(obj3.getClass());
		
		
	Instanceclass obj = new Instanceclass() {
	};
	// client$2 impolements Moksh
	Moksh obj1 = new Moksh() {
		
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void code() {
			// TODO Auto-generated method stub
			
		}
	};
	Instanceclass obj3 = new Instanceclass() {
	};
	// client$2 impolements Moksh
	Moksh obj4 = new Moksh() {
		
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void code() {
			// TODO Auto-generated method stub
			
		}
	};
	
	// Client$1 extends InstanceClass
	System.out.println(obj4.getClass());

	}

}
