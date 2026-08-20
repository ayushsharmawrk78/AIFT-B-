package Lec24;

public class Demo2 implements Moksh , Ramanpreet ,Rajat{

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
	obj.fun2();
	}
	
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gym() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void code() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		Moksh.super.fun2();
	}

}
