package Lec16;

public class Child extends Parent  {

	int d = 40;
	int d2 = 50;
	
	
	@Override
	public void fun() {
		System.out.println("hello i am in fun in child class");
	}

	public void fun3() {
		System.out.println("hello i am in fun3 in child class");
	}
}
