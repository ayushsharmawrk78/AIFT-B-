package LEC5;

import java.util.Scanner;

public class anytoany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

int src = in.nextInt();
int des = in.nextInt();
int num = in.nextInt();




int mid = 0;
int mul =1;
while(num!=0) {
	
	int rem = num%10;
	num = num/10;
	mid = mid+ rem*mul;
	mul = mul*src;
}



mul =1;
int ans =0;
while(mid!=0) {
	int rem = mid%des;
	mid = mid/des;
	ans= ans+rem*mul;
	mul = mul*10;
}

System.out.println(ans);
	}

}
