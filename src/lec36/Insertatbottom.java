package lec36;

import java.util.Stack;

public class Insertatbottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer>st = new Stack<>();
st.push(50);
st.push(40);
st.push(30);
st.push(20);
st.push(10);
System.out.println(st);
insertatb(st,-6);
System.out.println(st);
	}
	
	public static void insertatb(Stack<Integer>st  , int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int a =st.pop();
		insertatb(st, item);
		st.push(a);
	}

}
public static void reverse(Stack<Integer>st) {
	if(st.isEmpty()) {
	
		return;
	}
	
	int a =st.pop();
reverse(st);
	insertatb(st, a);
}

}
