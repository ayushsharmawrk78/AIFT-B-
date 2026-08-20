package lec28;

public class Cat  extends Animal implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		meow();
		super.eat();
	}
	
	
	public void meow() {
		
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.start();
	}
}
