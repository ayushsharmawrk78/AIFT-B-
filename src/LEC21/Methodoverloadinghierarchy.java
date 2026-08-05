package LEC21;

public class Methodoverloadinghierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int  m =10;
//fun(m);
char c = 'a';
c++;// c++ --> c = (char)(c+1)

byte c1 =10;
c1+=1;
// +=, ++ ...---> c++; c= (char)(c+1);



System.out.println(c);

//for (int i = Integer.MAX_VALUE-1; i <=Integer.MAX_VALUE ; i++) {
//	System.out.println(i);
//}
 

	}
	// exact match 


//	public static void fun(int a) {
//		System.out.println(a);
//	}
	
	// primitive widening
	
	
//	public static void fun(long a) {
//		System.out.println(a +"in long");
//	}
	//autoboxing
//public static void fun(Integer a) {
//	System.out.println(a +"in wrapper");
//	}
//reference widening 
//public static void fun(Object a) {
//	System.out.println(a +"in Object ");
//	}

//vargs
//public static void fun(int ...var) {
//	System.out.println(var +"in vargs");
//}
}
