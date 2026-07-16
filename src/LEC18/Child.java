package LEC18;

public class Child extends Parent{

	String name = " raman";
int age = 24;


public Child(String  namep , int agep , String namec , int agec) {
	super(namep ,agep);
	

	this.age=agec;
	this.name = namec;

}


public void fun() {
	System.out.println("hello "+super.name);
}





}
