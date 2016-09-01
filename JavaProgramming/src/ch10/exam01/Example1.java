package ch10.exam01;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			try{ // try문에 실행코드를 입력
				System.out.println("입력 : ");
				String data = scanner.nextLine();
				int value = Integer.parseInt(data);
				System.out.println(value);
			} catch(Exception e){ //예외를 잡는곳
				System.out.println("숫자가 아닌것 같습니다.");
			} finally { //catch후엔 finally 실행
				System.out.println("무조건 실행");
			}
		}
	}

}
