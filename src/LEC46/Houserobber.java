package LEC46;

import java.util.Arrays;

public class Houserobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {2,7,9,3,1};
int []dp= new int [arr.length];
Arrays.fill(dp, -1);
System.out.println(houserob(arr, dp, 0));
	}

	
	
	public static int houserob(int []arr ,int []dp , int i ) {
		
		
		
		if(i>=arr.length) {
			return 0;
		}
		
		if(dp[i]!=-1) {
			return dp[i];
		}
		int rob = houserob(arr,dp, i+2) +arr[i];
		int dont  = houserob(arr, dp, i+1);
		
		
		dp[i]=Math.max(dont, rob);
		return Math.max(dont, rob);
	}
}
