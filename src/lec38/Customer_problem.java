package lec38;

import java.util.Stack;

public class Customer_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int cust(int [][]arr) {
		
		Stack<Integer> st = new Stack<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
			
			
		}
		
		
		while(st.size()>1) {
			int a = st.pop();
			int b = st.pop();
			
			if(arr[a][b]==1) {
				st.push(b);
			}else if (arr[a][b]==0) {
				st.push(a);
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			if(i==st.peek()) {
				continue;
			}
			
			if(arr[st.peek()][i]==1||arr[i][st.peek()]==0) {
				return -1;
			}
		}
		
		
		return st.peek();
	}
	

}
