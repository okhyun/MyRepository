package ch18.exam08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("src/ch18/exam08/data.txt");
		Scanner scanner1 = new Scanner( is );
		
		
		String name = scanner1.nextLine(); //nextLine()은 엔터키까지 읽는다. 그래서 nextLine과 nextInt는 같이 사용하지 않는다. 만약에 같이 사용하게되면 같은 라인에 출력이 오게된다.
													//대기상태인데 입력후 엔터키를 치면 저장된다.
		
		int age = scanner1.nextInt();
		//int age = Integer.parseInt(scanner1.nextLine()); 이렇게 nextLine으로 받아서 변경한다.
		
		
		double height = scanner1.nextDouble();
		//double height = Double.parseDouble(scanner1.nextLine()); 이렇게 nextLine으로 받아서 변경한다.
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}

}
