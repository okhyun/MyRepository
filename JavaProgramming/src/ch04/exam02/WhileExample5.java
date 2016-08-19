package ch04.exam02;

public class WhileExample5 {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run){
			if(keyCode !=13 && keyCode != 10){
			System.out.println("----------------------");
			System.out.println("1.증속 2.감소 3.멈춤");
			System.out.println("----------------------");
			System.out.println("숫자를 선택하세요 ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49){
				speed++;
				System.out.println("현재속도 : " + speed);
				
			}else if(keyCode == 50){
				speed--;
				System.out.println("현재속도 : " + speed);
				
			}else if(keyCode == 51){
				System.out.println("마지막 속도 : " + speed);
				run=false;
			}
		}
		System.out.println("종료");

	}

}
