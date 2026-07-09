package Lec12;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "nitin";
System.out.println(ispalindrome(s));

for (int i = 0; i < s.length(); i++) {
	
	for (int j = i+1; j <=s.length(); j++) {
		
		String m = s.substring(i,j);
		if(ispalindrome(m)) {
			System.out.println(m);
		}
	}
}
	}
	
	public static boolean ispalindrome(String s) {
		
		int i =0;
		int j = s.length()-1;
		
		
		while(i<=j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		
		return true;
	}

}
