package lec25;

public class MyArrayList {

	int []arr ;
private 	int lasti =0;;
	
	public MyArrayList() {
		arr = new int [5];
	}
	
	public void add(int element) {
		if(lasti==arr.length) {
			int []arr2 = new int [arr.length*2];
			for(int i=0;i<arr.length;i++) {
				arr2[i]=arr[i];
			}
			arr=arr2;
		}
		
		
		
		arr[lasti]=element;
		lasti++;
	}
	public void add(int element , int index) throws Exception {
		if(lasti==arr.length) {
			int []arr2 = new int [arr.length*2];
			for(int i=0;i<arr.length;i++) {
				arr2[i]=arr[i];
			}
			arr=arr2;
		}
		if(index>lasti) {
			throw new Exception("index cannot be skipped");
		}
		
		
		arr[lasti]=element;
		lasti++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s  ="[ ";
		for(int i =0;i<lasti;i++) {
			s=s+arr[i]+" ,";
			
		}
		s=s+"]";
		return s;
	}
}
