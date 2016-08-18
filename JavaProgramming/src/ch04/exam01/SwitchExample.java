package ch04.exam01;

public class SwitchExample {

	public static void main(String[] args) {
		/*double d = Math.random(); // 0.0 <= 임의의수 < 1.0 랜덤으로 숫자를 지정한다.
		d = d * 6; // 0.0 <= 임의의수 < 6.0
		int num = (int) d; // 0 <= 1, 2, 3, 4, 5 <6 double을 캐스팅으로 int타입으로 적용했기 때문에 소수점을 제외한 정수만 적용된다.
		num = num + 1; // 1<= 2, 3, 4, 5, 6 <7 양쪽으로 1씩 증가시켜서 적용한다.*/
		
		
		int num = (int) (Math.random()*6)+1;
				System.out.println(num);
		
		switch(num){
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			
		} // ctrl + shift + /   선택 전체 주석

	}

}
