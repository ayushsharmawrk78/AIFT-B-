package Lec7;

import java.util.Scanner;

public class Inputarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

int n = 5;
int []arr = new int [6];

//arr[0]= in.nextInt();
//arr[1]=in.nextInt();
//arr[2]=in.nextInt();
//arr[3]= in.nextInt();
//arr[4]=in.nextInt();
for (int i = 0; i < arr.length; i++) {
	arr[i]=in.nextInt();
}
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
reverse(arr , 1, 4);

System.out.println();
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}
	
	
	public static void reverse(int[]arr , int i , int j) {
		
		while(i<=j) {
			
			
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
