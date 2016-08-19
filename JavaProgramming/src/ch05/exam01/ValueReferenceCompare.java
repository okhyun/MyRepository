package ch05.exam01;

public class ValueReferenceCompare {

	public static void main(String[] args) {
		//값 비교
		int v1 = 100;
		int v2 = 100;
		System.out.println(v1 == v2); //값이 같은지 보는것
		System.out.println(v1 != v2);
		
		//참조비교(객체비교)
		String r1 = new String("자바");
		String r2 = new String("자바");
		
		System.out.println(r1 == r2);//참조하는 객체가 같은지 보는것
		System.out.println(r1 != r2);
		
		String r3 ="자바";//타입이 기본타입이 아니면 값이 번지에 저장된다
		String r4 ="자바";
		System.out.println(r3 != r4);
		System.out.println(r3 != r4);

	}

}
