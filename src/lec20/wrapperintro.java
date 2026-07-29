package lec20;

import java.util.ArrayList;

public class wrapperintro {

	public static void main(String[] args) {
//		int a =10; 
//		
//		Integer m = 20;
//		Byte n = 40;
//		System.out.println(m);
//		String z = n.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(n));
//		
//		System.out.println(z);
		// -128 to 127
	Byte s = 12;
		Byte s1 =12;
		String z = s.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s));
		String z1 = s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s1));
		System.out.println(z);
		System.out.println(z1);
		System.out.println(s==s1);
		
		
		
		ArrayList<Object>ll = new ArrayList<>();
	ll.add(s);
	Integer m = 12;
	ll.add(m);
	}
}
