package ch07.exam04;

public class Robot extends Machine {// �������̵�(������) ��Ʈ��+�����̽��� ã�Ƽ� �����Ѵ�.
	@Override //������̼� : �̸��� �����ϰų� �����ǰ� �ߵǾ����� �˷��� �Ҷ� ������̼��� ���ش�.
	public void work(){
		super.work(); //super �θ��� ���뵵 ����ϰ� ������ ����Ѵ�.
		System.out.println("Robot-work() ����");
	}

}
