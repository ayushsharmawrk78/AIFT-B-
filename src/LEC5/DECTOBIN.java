package LEC5;

import java.util.Scanner;

public class DECTOBIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

int n= in.nextInt();

int ans =0;
int mul =1;
while(n!=0) {
	
	
	int rem  = n%2;
	n = n/2;
	ans  = ans + rem*mul;
	mul = mul*10;
	
}

System.out.println(ans);
	}

}
