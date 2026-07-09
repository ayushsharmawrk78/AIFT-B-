package Lec8;

public class Bubblesort {
static int a =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,20,30,40 , 50 , 60 ,70 ,80 , 90 , 100};

bubblesort(arr);
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}
	
	
	public static void bubblesort(int []arr) {
		
		boolean flag =false;
		
		for (int turn = 1; turn < arr.length; turn++) {
			
			
			for (int i = 0; i < arr.length-turn; i++) {
				
				
				if(arr[i]>arr[i+1]) {
					flag = true;
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			

			
			}
			if(flag ==false) {
				return;
			}
			
			flag = false;
		}
	}

}
