package ch07.exam09;

public class Car {
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6); //�տ��� ������ �ִ�ȸ������ 6���̴�.
	Tire frontRightTire = new Tire("�տ�����", 2);//�տ����� ������ �ִ�ȸ������ 2���̴�.
	Tire backLeftTire = new Tire("�ڿ���", 3);//�ڿ��� ������ �ִ�ȸ������ 3���̴�.
	Tire backRightTire = new Tire("�ڿ�����", 4);//�ڿ����� ������ �ִ�ȸ������ 4���̴�.
	
	
	//������
	
	
	
	//�޼ҵ�
	int run() { //run �޼ҵ尡 0�� ������ ���Ÿ�̾�� �����̴�.
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) { stop(); return 1;}; //Tire class�� �ִ� roll�޼ҵ尡 ��µȴ�.
		if(frontRightTire.roll()==false) { stop(); return 2;};//fasle�� �������� �����.
		if(backLeftTire.roll()==false) { stop(); return 3;};
		if(backRightTire.roll()==false) { stop(); return 4;};
		return 0 ;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

}
