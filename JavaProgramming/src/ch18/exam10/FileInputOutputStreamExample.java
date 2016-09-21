package ch18.exam10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputOutputStreamExample { //Copy
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ch18/exam10/Desert.jpg"); //Input은 파일이 존재해야한다.
		FileOutputStream fos = new FileOutputStream("src/ch18/exam10/Desert2.jpg");
		
		byte[] values = new byte[1024];
		int byteNum = -1;
		while((byteNum = fis.read(values)) != -1) {
			fos.write(values, 0, byteNum);
		}
		fos.flush();
		
		fis.close();
		fos.close();
	}

}
