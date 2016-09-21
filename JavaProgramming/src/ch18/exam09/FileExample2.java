package ch18.exam09;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample2 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Temp/dir1/dir2/dir3/data.txt");
		file.getParentFile().mkdirs();
		file.createNewFile();
		
		System.out.println(new Date(file.lastModified()));
				
	}

}
