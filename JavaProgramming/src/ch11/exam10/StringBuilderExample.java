package ch11.exam10;

public class StringBuilderExample {

	public static void main(String[] args) {
		String data = "a";
		data += "b";
		data += "c";
		System.out.println(data);
		
		//_______위아래 값이 같다.________
		
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.append("b");
		sb.append("c");
		System.out.println(sb);
		
		
		String data2 = "abc"; 
		StringBuilder sb2 = new StringBuilder(data2);
		sb2.insert(1, "0");  // 1index위치에 0을 삽입한다. //insert 문자열 중간에 주어진 매개값을 추가
		data2 = sb2.toString(); //타입을 맞추기 위해서 toString을 넣어준다.
		System.out.println(data2);
	}

}
