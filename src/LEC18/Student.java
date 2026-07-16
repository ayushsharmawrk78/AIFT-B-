package LEC18;

public class Student {
String name = "raman";
int age = 20;
static int m =200;

static {
	System.out.println("hello i am in static block");
	
}


public void fun() {
	System.out.println("hello my name is "+ name+ " my age is "+age);
}

public static void fun2() {
	
	System.out.println("hello i am in a static function");
}



}
