package ch10.homeWork;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] strArray = {"10", "2a"}; //배열은 1차원배열이고 인덱스번호는 [0],[1] 이다.
		int value = 0; 
		for(int i=0; i<=2; i++){
			try {
				value = Integer.parseInt(strArray[i]); //String타입 문자열울 int 정수타입으로 변환
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음"); //strArray배열의 범위는 0~1까지기에 for문이 계속 돌면 3번째 for문이 돌떄 예외가 발생한다. 
			}catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");//String타입을 int타입으로 바꿔주었지만 배열[1]번째 값은 변환시 예외가 발생한다.("2a a자체가 문자열 숫자변환 불가능")
			} finally{
				System.out.println(value);//예외가 발생하지 않으면 finally블럭의 코드를 실행한다.
			}
		}	

	}

}
