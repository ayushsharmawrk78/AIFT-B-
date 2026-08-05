package lec23;

public class Student {
String name  ;
private int age ;

public Student(String name ) {
	this.name=name;
	System.out.println("hello welcome "+this.name);
}



 public void setage(int age) throws Exception {
	 if(age<0) {
		 throw new Exception("age cannot be -ve");
	 }
	 this.age=age;
 }
 public int getage() {
	 return age;
 }
}
