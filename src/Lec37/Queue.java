package Lec37;

public class Queue {

	private int []arr;
	int size;
	int front;
	
	public Queue() {
		arr  = new int [5];
		size=0;
		front =0;
		
	}
	public Queue(int cap) {
		arr  = new int [cap];
		size=0;
		front =0;
		
	}
	
	public boolean isfull() {
		return size==arr.length;
	}
	public boolean isempty() {
		return size==0;
	}
	
	public void enqueue(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Queue full hain");
		}
		int idx = (front+size)%arr.length;
		
		
		arr[idx]=item;
		size++;
	}
	public int dequeue() throws Exception {
		if(isempty()) {
			throw new Exception("Queue khaali hain");
		}
		
		
		int val = arr[front];
	
 front = (front+1)%arr.length;
		
		
		size--;
		return val;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	String a = "[";
	for (int i = 0; i < size; i++) {
		int idx = (front+i)%arr.length;
		
		a= a+ " " +idx + " " +arr[idx]+" ,  " ;
	}
	a = a+"]";
	return a;
	}
}
