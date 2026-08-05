package lec23;

public class School {
String name;
String address;

Student []arr ;
int laststudent =0;
Employee []arr2;
int lastemp =0;

public School(String name , String address,  int ns , int ne) {
	this.name=name;
	this.address= address;
	arr = new Student[ns];
	arr2 = new Employee[ne];
}
public void addstudent(String name , int age) throws Exception {
	if(laststudent==arr.length) {
		throw new Exception("School is full");
	}
	Student s = new Student(name);
	
	s.name=name;
s.setage(age);

arr[laststudent]=s;
laststudent++;
}
public void addemployee(String name , int id) throws Exception {
	if(lastemp==arr2.length) {
		throw new Exception("Employee is full");
	}
	Employee s = new Employee();
	for(Employee i:arr2) {
		if(i!=null&&i.id==id) {
			throw new Exception("id should be unique");
		}
	}
	s.id=id;
	s.name=name;
	arr2[lastemp]=s;
	lastemp++;
	
}

public void display() {
	System.out.println(name);
	System.out.println(address);
	System.out.println(" STUDENTS ");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i].name+"  "+arr[i].getage());
	}
	System.out.println(" Employee ");
	for (int i = 0; i < arr2.length; i++) {
		System.out.println(arr2[i].name+"  "+arr2[i].id);
	}
}


}
