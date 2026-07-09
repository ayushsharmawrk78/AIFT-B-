package LEC6;

import java.util.Scanner;

public class Functions {

	
	public static void main(String[] args) {
		
		
		
		int m   = 40;
		int n =20;
		System.out.println(m+n);
		
		fun();
		
	int a =	fun3(20, 300);
	System.out.println(a);
	}
	
	
	public static void fun() {
		int a = 200;
		int b =400;
		System.out.println(a+b);
	}
	
	
	public static void fun2(int a , int b ) {
		
		
		System.out.println(a+b);
	}
	
	public static int fun3(int a , int b) {
		int c = a+b;
		return c;
	}
	
	public static int fun4() {
		int a =20;
		int b =30
				;
		return a+b;
	}
}
