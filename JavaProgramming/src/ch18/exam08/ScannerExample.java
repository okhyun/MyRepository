package ch18.exam08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("src/ch18/exam08/data.txt");
		Scanner scanner1 = new Scanner( is );
		
		
		String name = scanner1.nextLine(); //nextLine()�� ����Ű���� �д´�. �׷��� nextLine�� nextInt�� ���� ������� �ʴ´�. ���࿡ ���� ����ϰԵǸ� ���� ���ο� ����� ���Եȴ�.
													//�������ε� �Է��� ����Ű�� ġ�� ����ȴ�.
		
		int age = scanner1.nextInt();
		//int age = Integer.parseInt(scanner1.nextLine()); �̷��� nextLine���� �޾Ƽ� �����Ѵ�.
		
		
		double height = scanner1.nextDouble();
		//double height = Double.parseDouble(scanner1.nextLine()); �̷��� nextLine���� �޾Ƽ� �����Ѵ�.
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}

}
