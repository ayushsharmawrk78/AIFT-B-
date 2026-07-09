package LEC2;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
//		int a  = in.nextInt();
//		
//		int i =0;
//		while(i<a) {
//			System.out.print("* ");
//			i++;
//		}
//		
		
		int n =5;
		
//		
//		int row=0;
//		while(row<n) {
//			
//			
//			int star =0;
//			
//			
//			while(star<n) {
//				System.out.print("* ");
//				star++;
//			}
//			System.out.println();
//			row++;
//		}
//		
//	}
		
		
		int row =1;
		int val =1;
		
		while(row<=n) {
			
			
			
			int star =0;
			while(star<row) {
				System.out.print(val+" ");
				val++;
				star++;
			}
			
			System.out.println();
		
			row++;
		}
		
		
//	int row =1;
//		int star =n;
//		
//		while(row<=n) {
//			
//			
//			
//			int st =0;
//			while(st<star) {
//				System.out.print("* ");
//				st++;
//			}
//			
//			System.out.println();
//			row++;
//			star--;
//		}
		
		

	int space = n-1;
	
	while(row<=n) {
		
		
		int sp = 0;
		while(sp<space) {
			System.out.print(" ");
			sp++;
		}
		
		int st =0;
		while(st<row) {
			System.out.print("*");
			st++;
		}
		
		
		System.out.println();
		
		space--;
		row++;
	}
		
	}

}
