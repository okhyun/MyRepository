package ch04.exam03;

public class BreakExample {

	public static void main(String[] args) {//접근제한자 
		//주사위의 눈이 6이 나오면 프로그램을 종료하세요.
		while(true){
			
			/*double num = Math.random();
			num = num*6;
			int value = (int) num;
			value +=1;*/
			
			int value = (int)(Math.random()*6)+1;
			System.out.println(value);
			
			if(value==6){
				break;
			}
		}
		System.out.println("종료");

	}

}
