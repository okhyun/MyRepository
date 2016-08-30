package ch07.exam09;

public class Tire {//규격
	//필드
	public int maxRotation; //최대 회전수(최대 수명)
	public int accumulatedRotation; //누적 회전수
	public String location; // 타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() { //boolean은 true, false
		++accumulatedRotation; //누적회전수 증가
		if(accumulatedRotation < maxRotation) {//누적회전수가 최대회전수 보다작으면 true
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {   //누적회전수가 최대회전수보다 크면 flase
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}

}
