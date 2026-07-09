package LEC3;

public class Horizontalmirroring_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =5;
//int row =1;
//int star =1;
//while(row<=(2*n)-1) {
//	
//	int st=0;
//	while(st<star) {
//		System.out.print("* ");
//		st++;
//	}
//	System.out.println();
//	
//	
//	if(row<n) {
//		star++;
//		
//	}
//	else {
//		star--;
//	}
//	row++;
//}
//
//int row=1;
//int star =1;
//int space = n/2;
//
//while(row<=n) {
//	
//	int sp =0;
//	while(sp<space) {
//		System.out.print(" ");
//		sp++;
//		
//	}
//	
//	int st =0;
//	while(st<star) {
//		System.out.print("*");
//		st++;
//	}
//	
//	
//	
//	if(row<=n/2) {
//		space--;
//		star= star+2;
//	}else {
//		space++;
//		star= star-2;
//	}
//	System.out.println();
//	row++;
//	
//}


int row=1;

int space =n-1;
int star =1;
int val =1;
while(row<=n) {
	
	
	int sp =0;
	while(sp<space) {
		System.out.print(" ");
		sp++;
	}
	
	int st =1;
	val =row;
	while(st<=star) {
		System.out.print(val);
		
		if(st<=star/2) {
			val++;
		}else {
			val--;
		}

		st++;
	}
	System.out.println();

	row++;
	space--;
	star= star+2;
}






	}

}
