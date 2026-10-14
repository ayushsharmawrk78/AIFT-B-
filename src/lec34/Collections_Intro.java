package lec34;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collections_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Iterable 
//		Collection obj = new Collection<E>() {
//		};

		
//		List<Integer> ll  = new List<Integer>() {
//
//		
//	};
		
		
	List<Integer>ll = new ArrayList<>();
	
	
	ll.add(1);
	ll.add(2);
	ll.add(3);
	ll.add(3,4);
	System.out.println(ll);
	ll.add(2,14);

	
	
	ll.set(2, 10);
	System.out.println(ll);
	
	
	ll.remove(0);
	System.out.println(ll);
	List<Integer>ll2 = new ArrayList<>();
	ll2.add(100);
	ll2.add(200);
	
	
	ll.addAll(ll2);
	System.out.println(ll);
	
	List<Object>ll3 = new ArrayList<>();
	
	ll3.add(1);
	ll3.add(true);
	ll3.add(2.0);
	System.out.println(ll3);
}
}
