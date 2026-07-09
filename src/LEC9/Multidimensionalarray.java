package LEC9;

import java.util.Scanner;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][]arr = new int [5][4];
		
		int [][]arr2 = {{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120},
				{130,140,150,1600}
		};
//		
//		System.out.println(arr[0][2]);
//		
//		System.out.println(arr.length);
//		
//		System.out.println(arr[0].length);
//		Scanner in  =new Scanner(System.in);
//		
//		
//		for (int i = 0; i < arr2.length; i++) {
//			
//			for (int j = 0; j < arr2[0].length; j++) {
//			System.out.print(arr2[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		waveprint(arr2);
		
		
	}
	
	public static void waveprint(int [][]arr) {
		
		

		for(int col = 0;col<arr[0].length;col++) {
			
			if(col%2==0) {
				for (int j = 0; j < arr.length; j++) {
					
			
					System.out.print(arr[j][col]+" ");

				}
			}
			else {
	for (int j = arr.length-1; j >=0; j--) {
					
		
		System.out.print(arr[j][col]+" ");

				}
				System.out.println();
			}
	
	
	
	
		}
			
		
		
		
	}
	
	
	public static void transpose (int [][]arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
			for (int j = i+1; j < arr.length; j++) {
				int temp =arr[i][j];;
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
