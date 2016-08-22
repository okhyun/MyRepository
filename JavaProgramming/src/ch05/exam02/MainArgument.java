package ch05.exam02;

public class MainArgument {

	public static void main(String[] args) {
		//java MainArgument 3 4
		String v1  = args[0]; //"3"
		String v2  = args[1]; //"4"
		
		int intV1 = Integer.parseInt(v1); //Integer.parseInt(); 정수로 해석한다. parse :해석한다.라는 뜻
		int intV2 = Integer.parseInt(v2);
		
		int result  = intV1 + intV2;
		System.out.println("result = " + result);

	}

}
