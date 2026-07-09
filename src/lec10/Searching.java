package lec10;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr = {
				{41,23,1,15},
				{12,21,0,5},
				{0,2,-4,75},
				{9,15,-164,74}
				
				
		};
		
		
		System.out.println(search(arr, 176));
		
	}
	
	
	public static boolean search(int [][]arr , int target) {
		int r = 0;
		int col = arr[0].length-1;
		
		while(col>=0&&r<arr.length) {
			
			
			if(arr[r][col]==target) {
				return true;
			}
			else if (arr[r][col]<target) {
				
				r++;
			}else {
				col--;
			}
		}
		
		return false;
		
	}

}
