package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		//Instance Member ���
		InstanceMember im = new InstanceMember(); //�����ڴ� �̺κп��� ����
		im.field = "�ڹ�"; //im������ �����ϰ��ִ� ��ü���� �ڹ�
		im.method(); 
		
		
		//Static Member ���
		StaticMember.field = "�ڹ�"; //����ϰ������� ���簡�ȴ�.
		StaticMember.method(); //class�̸����� �ٷ� �����Ѵ�.
		

	}

}
