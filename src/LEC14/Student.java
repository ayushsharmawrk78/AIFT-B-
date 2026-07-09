package LEC14;

public class Student {

	private String name = "raman";
 private	int age = 24;
 
 
 
 
 
 
 
 
 public Student(String name , int age) {
	 
	 this.name= name ; 
	 if(age<0) {
		 System.out.println("age - ve nhi ho sakti");
		 return;
	 }

 }
 
 public void setname(String name ) {
	 this.name = name;
 }
 public void setage(int age ) {
	 
	 if(age<0) {
		 System.out.println("age - ve nhi ho sakti");
		 return;
	 }
	 this.age = age;
 }
 public String getname( ) {
	 return this.name;
 }
 public int getage( ) {
return this.age
		;
 }
 
}
