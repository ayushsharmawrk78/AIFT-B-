package LEC32;

public class Maxcircularsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int ans(int []arr) {
		
		int ts = 0;
		for (int i = 0; i < arr.length; i++) {
			ts = ts+arr[i];
		}
		
		int normal = kadaens(arr);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=-1*arr[i];
		}		
		int minkd = kadaens(arr);
		
		int cirular = ts+minkd;
		
		return Math.max(normal, cirular);
		
		
		
		
	}
	
	
	public static int kadaens (int []arr) {
		
		
		int i =0;
		int max = Integer.MIN_VALUE;
		int sum =0;
		
		while(i<arr.length) {
			sum = sum +arr[i];
			
			
			max = Math.max(sum, max);
			
			if(sum<0) {
				sum=0;
				
			}
			
			i++;
		}
		
		return max;
	}

	
	
	
}
