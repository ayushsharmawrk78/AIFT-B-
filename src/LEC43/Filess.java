package LEC43;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("/Users/ayushsharma/Desktop/untitled folder 2/demo.txt");
		
	System.out.println(f.createNewFile());
	
	try {
		
		FileWriter fr = new FileWriter(f);
		
		fr.write("hello java");
		
		
		fr.close();
				FileWriter fr2 = new FileWriter(f,true);
		
	fr2.append('w');
	fr2.close();
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		
	}

}
