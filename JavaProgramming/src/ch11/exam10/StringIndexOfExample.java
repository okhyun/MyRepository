package ch11.exam10;

public class StringIndexOfExample {

	public static void main(String[] args) {
		/*String subject = "�̰��� C++�̴�.";
		String subject1 = "�̰��� �ڹٴ�.";*/
		String subject = "�ڹ� ���α׷���";
		
		boolean result1 = subject.contains("�ڹ�");
		if(result1) {
			System.out.println("�ڹ� ���� å�̱���");
		} else {
			System.out.println("�ڹ� ���� å�� �ƴϱ���");
		}
		
		
		
		
		int result2 = subject.indexOf("�ڹ�");
		if(result2 != -1) {
			System.out.println("�ڹ� ���� å�̱���");
		} else {
			System.out.println("�ڹ� ���� å�� �ƴϱ���");
		}
		
		
		int startIndex = subject.indexOf("�ڹ�");
		int endIndex = startIndex +2;
		String token1 = subject.substring(startIndex, endIndex);
		System.out.println(token1);
		
		String find = "���α׷���";
		startIndex = subject.indexOf("�ڹ�"); //���ϴ� ���ڿ��� ã����
		/*endIndex = startIndex +"���α׷���".length();
		String token2 = subject.substring(startIndex, endIndex);*/ //���� ��ġ���� ���� ���������� ����Ҷ� //endIndex�� �ڱ������ �������� �ʴ´�.
		String token2 = subject.substring(startIndex);   //���� ��ġ���� ������ ����Ҷ�
		System.out.println(token2);
		
		
		/*String token = subject.substring(4, 7);
		System.out.println(token);
		
		String token1 = subject1.substring(4, 6); //(4, 6) = (stratIndex, endIndex) ����. //endIndex�� �ڱ������ �������� �ʴ´�.
		System.out.println(token1);*/

	}

}
