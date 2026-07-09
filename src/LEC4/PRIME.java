package LEC4;

import java.util.Scanner;

public class PRIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner n = new Scanner(System.in);

int a = n.nextInt();


int fact =0;
int i =2;
while(i<a) {
	
	if(a%i==0) {
		fact++;
break;
	}
	System.out.println("hello");
	i++;
	
	
}

if(fact>=1) {
	System.out.println("Non Prime");
}else {
	System.out.println("Prime");
}
	}

}
