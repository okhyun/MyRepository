package ch04.homework;

public class HomeWork2 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++){ 
			// i가 1부터 10까지 1씩증가하면서 반복 (반복문)
			for(int j=1; j<=10; j++){
				// j가 1부터 10까지 1씩증가하면서 반복 (반복문)
				if(4*i+5*j==60){ 
					/* 4*i+5*j==60 값이 참일때 출력한다. 
					반대로 거짓이면 출력하지 않는다.(조건문)*/ 
					System.out.println("4X+5Y=60 일때" + " ( " + " X : " +  i  + ","+ " Y : " +  j  +" )");
					//(출력문)
					System.out.println();
					
				}
				
			}
		}

	}

}
