package lec44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filesss {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("abc2.txt");

try {
	if(f.createNewFile()) {
		System.out.println("File created");
	}else {
		System.out.println("already exists");
	}
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}

try {
	FileWriter fw = new FileWriter(f);
	
	fw.write("hello world");
	fw.close();
} catch (Exception e) {
	// TODO: handle exception
}

//try {
//	FileReader fr = new FileReader(f);
//	int ch ;
//	while( (ch= (fr.read()))!=-1) {
//		System.out.println((char)(ch));
//	}
//
//	System.out.println("file done");
//} catch (Exception e) {
//	// TODO: handle exception
//}


FileReader fr2 = new FileReader(f);

BufferedReader br = new BufferedReader(fr2);

String line ;
while((line = br.readLine())!=null) {
	System.out.println(line);
}

System.out.println("file reading done");


	}
	
	

}
