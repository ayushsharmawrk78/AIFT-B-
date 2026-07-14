package Lec16;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Parent p = new Parent();
//
//Child c = new Child();
//
//System.out.println(c.d1);
//c.fun2();
		
		
		//Parent obj = new Parent();

		
		
		Parent obj = new Child();
		

System.out.println(obj.d1);

System.out.println(obj.d);

System.out.println(( (Child) (obj)).d2);

obj.fun();

System.out.println(obj.d);



obj.fun();
;// method overriding 


Child c = new Child();



	}

}
