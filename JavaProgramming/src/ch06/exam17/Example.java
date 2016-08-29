package ch06.exam17;

public class Example {

	public static void main(String[] args) {
		Member m1 = new Member("angel");
		//System.out.println(m1.mid); private를 쓰는 이유는 값을 변경하지않고 호출만이 필요할때
		//잘못된 데이터가 들어갈 수 있기 때문에  
		System.out.println(m1.getMid());
		
		m1.setMheight(-100.0);

	}

}
