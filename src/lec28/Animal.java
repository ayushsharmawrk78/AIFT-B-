package lec28;

public class Animal  {

	
	public void eat() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("eating in animal"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		
	}
}
