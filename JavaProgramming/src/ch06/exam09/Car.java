package ch06.exam09;

public class Car {
	//Field
	int gas;
	
	//Constructor
	
	
	//Method
	void setGas(int gas){
		this.gas = gas;
	}
	
	boolean isLeftGas(){ //is로시작하는 메소드는 boolean타입이다.
		if(gas == 0){
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			System.out.println("gas가 있습니다.");
			return true;
		}
		
	}
	
	void run(){
		while(true){
			if(gas > 0){
				System.out.println("멈춤니다.(gas 잔량 :" + gas +  ")");
				gas-=1;
				
			} else {
				System.out.println("멈춤니다.(gas 잔량 :" + gas +  ")");
				//break; break도 같은 실행종료지만 break는 while문만 빠져나간다. 만약에 리턴이 없는 메소드(void) 안에 다른 실행문이 있다면 while문을 빠져나가 그쪽으로 실행될수있다.
				return; //리턴이 없는 void 타입에서는 return을 사용하면 실행 종료된다.
			}
		}
	}

}
