package lec25;

import java.util.ArrayList;
import java.util.HashMap;

public class Genericdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<E>
	
//Genericintro<String>obj = new Genericintro<>();
//obj.name="yug";
//obj.fun();
//
//obj.ret("yugg");
		System.out.println(fun('a'));
	}

	public static <T> T fun(T val) {
		
		return val;
		
	}
}
