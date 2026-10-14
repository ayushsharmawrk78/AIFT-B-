package lec39;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PriorityQueue<Integer>pq = new PriorityQueue<>();
//		
//		pq.add(1);
//		pq.add(2);
//		System.out.println(pq);
//		pq.add(-1);
//		System.out.println(pq);
//		pq.add(10);
//		pq.add(20);
//		pq.add(-2);
//		pq.add(-12);
//	 
//		
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
//		
//		System.out.println(pq);
		
		PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(1);
		pq.add(2)
		;
		pq.add(3);
		System.out.println(pq);
		
		pq.add(30);
		System.out.println(pq);
	}

}
