package LEC46;

import java.util.Arrays;

public class MIN_COST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []cost = {1,100,1,1,1,100,1,1,100,1};
		int []dp = new int [cost.length];
		Arrays.fill(dp, -1);
int f = mincost(dp , cost, 0);
int s = mincost(dp,cost, 1);

System.out.println(Math.min(f, s));
	}
	
	
	public static int mincost( int [] dp , int []cost ,int i ) {
		if(i>=cost.length) {
			return 0;
		}
		
		if(dp[i]!=-1) {
			return dp[i];
		}
		int fs = mincost(dp , cost, i+1);// i-1
		int ss =  mincost( dp , cost, i+2);//i-2
		int costing = cost[i];
		
		dp[i]=costing+Math.min(ss, fs);
		return costing+Math.min(ss, fs);
	}
	
	public static int BU(int []cost ) {
		int []dp = new int [cost.length];
		
		
		dp[0]=cost[0];
		dp[1]=cost[1];
		
		for (int i = 2; i < dp.length; i++) {
			
		dp[i]= cost[i]+Math.min(dp[i-1], dp[i-2]);
		}
		
		return Math.min(dp[dp.length-1], dp[dp.length-2]);
		
	}

}

