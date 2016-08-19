package ch04.exam02;

public class whileExample4 {

	public static void main(String[] args) throws Exception{ //Unhandled exception 에러 나올시에
		System.out.println("프로그램 시작");
		int num=0;
		while(num !=113){ // q는 멈춤 숫자로 바꾸면 113
			 num = System.in.read();
			
			if(num !=13 && num !=10){
				System.out.println(num);
			}

		}
		System.out.println("프로그램 종료");

	}
}