package Lec12;

public class Formbiggestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static void bubblesort(int []arr) {
		
	
		for (int turn = 1; turn < arr.length; turn++) {
			
			
			for (int i = 0; i < arr.length-turn; i++) {
					if(isswap(arr[i], arr[i+1])==true) {
			
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		
		}
	}
public static boolean isswap(int i , int j) {
	String a = i+"";
	String b = j+"";
	
	String m = a+b;
String n = b+a		;
	
	if(Integer.parseInt(n)>Integer.parseInt(m)) {
		return true;
	}
	
	return false;
	
}
}
