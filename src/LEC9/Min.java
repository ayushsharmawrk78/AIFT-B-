package LEC9;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {-10,-20,-30,-40,-50};

System.out.println(max(arr));
	}
	
	public static int min(int []arr) {
		
		int mini = Integer.MAX_VALUE; // + infinity
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<mini) {
				mini = arr[i];
			}
		}
		return mini;
	}

public static int max(int []arr) {
		
		int maximum = Integer.MIN_VALUE; // + infinity
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maximum) {
				maximum = arr[i];
			}
		}
		return maximum;
	}
}
