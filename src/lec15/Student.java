package lec15;

public class Student {

	private int age ;
	String name ;
	
	
	
	public int getage() {
		return this.age;
	}

	public void setage (int age) throws Exception{
		if(age<0) {
		throw new Exception(" Age cannot be -ve");
	
		}
	this.age=age;
	}
	
	

	
	
}
