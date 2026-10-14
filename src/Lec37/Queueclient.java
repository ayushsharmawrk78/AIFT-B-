package Lec37;

public class Queueclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Queue q = new Queue();
	System.out.println(q);
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	q.enqueue(50);
	System.out.println(q);
	// q.enqueue(50);
	System.out.println(q.dequeue());
	System.out.println(q.dequeue());
	System.out.println(q);
	q.enqueue(60);
	q.enqueue(70);
	System.out.println(q);
//	System.out.println(q.dequeue());
//	System.out.println(q.dequeue());
//	System.out.println(q.dequeue());
//	System.out.println(q.dequeue());
//	System.out.println(q.dequeue());
//	System.out.println(q.dequeue());
	
	}

}
