package ch04.homework;

public class HomeWork1 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 100 ; i++ ){ //주사위 100번 던짐 (반복문)
			int num1 = (int) (Math.random() * 6) + 1 ; 
			// 1에서 6사이의 랜덤한 값의 주사위 A
			int num2 = (int) (Math.random() * 6) + 1 ;
			// 1에서 6사이의 랜덤한 값의 주사위 B
						 
			if ( num1 + num2 == 10 ) { 
				/*num1 과 num2 의 합이 10과 같으면 참이므로 출력한다. 
				반대로 같지않으면 거짓이므로 출력하지 않는다.(조건문)*/
				System.out.println("( 주사위 A는 " + num1 + ", 주사위 B는 " + num2 + " )");
				System.out.println();
			}
		}

	}

}
