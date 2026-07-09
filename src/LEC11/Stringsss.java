package LEC11;

public class Stringsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Object b = new Object(); 
//int m = arr.length;
//int  []arr2 = {1,2,3};
//System.out.println(arr ==arr2);
//
//
//String a = "hello";
//String b = "hello";
//
//String f = new String("hii");
//String g = new String("hii");
//System.out.println(g==f);
//
//
//
//System.out.println(arr.length);
//
//System.out.println(a.length());
//
//
//System.out.println(arr);
//System.out.println(f);
		
		String m = "Hello";
		System.out.println(m.charAt(0));
		
//System.out.println(m.toUpperCase());
//System.out.println(m.toLowerCase());

for (int i = 0; i < m.length(); i++) {
	//System.out.print(m.charAt(i)+" ");
}
String a = "Nitin";
//System.out.println();
//System.out.println(a.compareTo(m));
//System.out.println(a.substring(1));
//System.out.println(a.substring(0,3));


for (int i = 0; i < a.length(); i++) {
	for (int j = i+1; j <=a.length(); j++) {
		System.out.println(a.substring(i,j));
	}
}
	}

}
