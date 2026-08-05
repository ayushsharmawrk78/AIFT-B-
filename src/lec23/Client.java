package lec23;

public class Client   {

	
	
	public static void main(String[] args) throws Exception {

School obj = new School("chitkara", "rajpura", 3, 2);


obj.addstudent("rajat", 20);
obj.addstudent("raman", 24);
obj.addstudent("kunal", 25);

obj.addemployee("moksh", 1);
obj.addemployee("moksh", 2);


obj.display();

	}

}
