package lec36;

public class Stack {

	
	protected int []arr;
	int top ;
	
	public Stack() {
		arr = new int [5];
		top=-1;
	}
	public Stack(int cap) {
		arr = new int [cap];
		top=-1;
	}
	
	public boolean isfull() {
		return top==arr.length-1;
	}
	public boolean isempty() {
		return top==-1;
	}
	public int size() {
		return top+1;
	}
	
	public void push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Stack is full");
		}
		
		top++;
		arr[top]=item;
	}
	public int pop() throws Exception {
		if(isempty()) {
			throw new Exception("Stack is empty");
		}
		
	
	int val	=arr[top];
	top--;
	return val;
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	String a = "[";
	
	for (int i = 0; i <=top; i++) {
		a = a+arr[i]+" , ";
		
	}
	
	a= a+" ]";
	
	return a;
	} 
}
