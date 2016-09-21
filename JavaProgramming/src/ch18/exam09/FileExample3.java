package ch18.exam09;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample3 {

	public static void main(String[] args) throws IOException {
		File root = new File("C:/");
		File[] contents = root.listFiles();
		
		for(File file : contents) {
			if(file.isDirectory()){ //파일 디렉토리 조사
				System.out.print("<DIR>");
				System.out.print("\t");
			} else {
				System.out.print("\t");
				System.out.print(file.length()); //파일의 크기 조사. 중요하다
			}
			System.out.print("\t");
			System.out.println(file.getName()); //파일의 이름 조사
		}
	}

}
