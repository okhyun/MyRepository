package ch06.exam17;

public class Example {

	public static void main(String[] args) {
		Member m1 = new Member("angel");
		//System.out.println(m1.mid); private�� ���� ������ ���� ���������ʰ� ȣ�⸸�� �ʿ��Ҷ�
		//�߸��� �����Ͱ� �� �� �ֱ� ������  
		System.out.println(m1.getMid());
		
		m1.setMheight(-100.0);

	}

}
