package lec28;

public class Animal extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	eat();
	}
	public void eat() {
		System.out.println("eating in animal"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.start();
	}
}
