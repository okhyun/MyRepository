package ch08.exam07;

public class Driver {
	//�ʵ�
	
	//������
	
	//�޼ҵ�
	public void drive(Vehicle vehicle) { //�������̽��� ������ ��ü�� �Ű����� �ڸ��� ����.
		if(vehicle instanceof Bus){
			Bus bus = (Bus) vehicle;
			bus.CheckFare();
		}
		vehicle.run();
	}
}
