package Lec45;

import java.util.Arrays;

public class Fibonacchi {
static int i =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(fibo(5));


int []dp = new int [6];
Arrays.fill(dp, -1);
System.out.println(dpfibo(dp, 5));
System.out.println(i);

	}

	
	public static int fibo(int n) {
		i++;
		if(n==0||n==1) {
			return n;
		}
	
		
		int f1 = fibo(n-1);
		int f2 = fibo(n-2);
		
		return f1+f2;
	}
	
	
	public static  int dpfibo(int []dp ,int n) {
		i++;
		if(n==0||n==1) {
			return n;
		}
		
		
		if(dp[n]!=-1) {
			return dp[n];
		}
		
		
		int f1 = dpfibo(dp, n-1);//i-1
		int f2 = dpfibo(dp, n-2);//i-2
		//dp[i]=dp[i-1]+dp[i-2];
		dp[n]=f1+f2;
		return f1+f2;
	}
	
	public static int bu( int n) {
		
		
		int []dp = new int [n+1];
		dp[0]=0;
		dp[1]=1;
		
		for (int i = 2; i < dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2];
			
		}
		
		
		return dp[n];
	}
	
}
