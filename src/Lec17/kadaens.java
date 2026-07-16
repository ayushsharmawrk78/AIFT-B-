package Lec17;

public class kadaens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {2,3,-7,1,-4,10};
System.out.println(kadaens(arr));
	}
	
	public static int kadaens(int[]arr) {
		
		
		int max = Integer.MIN_VALUE;
		
		
		int i =0;
		int sum =0;
		
		
		while(i<arr.length) {
			sum = sum+arr[i];
			
			max = Math.max(sum, max);
			
			if(sum<0) {
				sum =0;
				
			}
			
			i++;
			
			
		}
		return max;
	}

}
