package ch07.homework;

public class Car {
	//필드
	Tire[] tires = {
			 new Tire("앞왼쪽", 6),
			 new Tire("앞오른쪽", 2),
			 new Tire("뒤왼쪽", 3),
			 new Tire("뒤오른쪽", 4)
	};
	//생성자
	
	
	
	//메소드
	int run() { //run 메소드가 0이 나오면 모든타이어는 정상이다.
		System.out.println("[자동차가 달립니다.]");
		for(int i =0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return(i+1);
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
