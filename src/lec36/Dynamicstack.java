package lec36;

public class Dynamicstack  extends Stack{

	@Override
	public void push(int item) throws Exception {
		// TODO Auto-generated method stub
		if(super.isfull()) {
			
			int []narr = new int [super.arr.length*2];
			
			for (int i = 0; i < arr.length; i++) {
				narr[i]=arr[i];
			}
			arr=narr;
		}
		
		super.push(item);
	}
}
