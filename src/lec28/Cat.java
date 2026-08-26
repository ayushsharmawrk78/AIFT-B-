package lec28;

public class Cat  extends Animal implements Runnable {

	
	
	
	public void meow() {
		System.out.println("meowwwww");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Cat c = new Cat();

	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
