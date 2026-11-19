package LEC43;

import java.io.File;

public class File_handling {

	public static void main(String[] args) {
		
		File f = new File("/Users/ayushsharma/Desktop/untitled folder 2/abc2.txt");
//		System.out.println(f.exists());
//		System.out.println(f.canWrite());
//		System.out.println(f.canRead());
//	System.out.println(f.getAbsolutePath());
//	
//	System.out.println(f.getName());
//	System.out.println(f.getParent());
//
//	System.out.println(f.setReadOnly());

		int []arr = {1,2,3};
		try {
			if(f.createNewFile()) {
				System.out.println("file created successfullu");
			}
			else {
				System.out.println("file already exists");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		System.out.println(f.delete());
	}

}
