package Lec12;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String m = "1234";

 int z = Integer.parseInt(m);
String s = "chitkara";
int [] freq = new int [26];

for (int i = 0; i < s.length(); i++) {
	
	int ascii = s.charAt(i);
	int idx = ascii - 97;
	
	freq[idx]=freq[idx]+1;
}

for (int i = 0; i < freq.length; i++) {
	
	char ch = (char)(i+97);
	System.out.println(ch+" ----> "+freq[i]);
}
	}

}
