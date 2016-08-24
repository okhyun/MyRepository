package ch06.exam08;

public class Math {
	//Field
	
	//Constructor
	
	//Method
	void printInfo(String info){
		System.out.println(info);
	}
	
	int max(int x, int y){ //매개변수의 값을 정했을때
		if(x>y){
			return x;
		} else {
			return y;
		}
	}
	
	double avg1( int [] values ){ //1.번째 방법---매개변수에 값들의 수를 정하지않았을때 
		int sum = 0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		double avg = (double)sum / values.length;
		return avg;
	}
	
	double avg2( int ... values ){//2.번째 방법---매개변수에 값들의 수를 정하지않았을때
		int sum = 0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		double avg = (double)sum / values.length;
		return avg;
	}

}
