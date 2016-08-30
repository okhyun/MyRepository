package ch07.exam09;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6); //앞왼쪽 바퀴는 최대회전수가 6번이다.
	Tire frontRightTire = new Tire("앞오른쪽", 2);//앞오른쪽 바퀴는 최대회전수가 2번이다.
	Tire backLeftTire = new Tire("뒤왼쪽", 3);//뒤왼쪽 바퀴는 최대회전수가 3번이다.
	Tire backRightTire = new Tire("뒤오른쪽", 4);//뒤오른쪽 바퀴는 최대회전수가 4번이다.
	
	
	//생성자
	
	
	
	//메소드
	int run() { //run 메소드가 0이 나오면 모든타이어는 정상이다.
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1;}; //Tire class에 있는 roll메소드가 출력된다.
		if(frontRightTire.roll()==false) { stop(); return 2;};//fasle가 나왔을때 멈춘다.
		if(backLeftTire.roll()==false) { stop(); return 3;};
		if(backRightTire.roll()==false) { stop(); return 4;};
		return 0 ;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
