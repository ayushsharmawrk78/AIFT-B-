package LEC43;

import java.io.File;
import java.io.FileWriter;

public class File_writing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f = new File("/Users/ayushsharma/Desktop/untitled folder 2/abc2.txt");
	System.out.println(f.exists());
	
	System.out.println(f.canWrite());
	
	
	try {
		FileWriter fr = new FileWriter(f);
		fr.write("hello java");
fr.flush();
fr.write("hello");
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}

}
