package LEC3;

import java.util.Scanner;

public class SOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v =new Scanner(System.in);
		
		
		int n=v.nextInt();
//		int sum =0;
//		
//		
//		while(n!=0) {
//			int digit = n%10;
//			
//			sum  = sum +digit;
//			n = n/10;
//			
//		}
		
		

		
		int a = n;
		int count =0;
		while(n!=0) {
			
			int rem = n%10;
			n=n/10;
			count++;
		}
		
		int sum =0;
		n =a;
		while(n!=0) {
			int rem = n%10;
			sum =  (int) (sum + Math.pow(rem, count));
			n= n/10;
		}
		
		if(sum ==a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
