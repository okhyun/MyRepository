package ch07.exam09;

public class Tire {//�԰�
	//�ʵ�
	public int maxRotation; //�ִ� ȸ����(�ִ� ����)
	public int accumulatedRotation; //���� ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() { //boolean�� true, false
		++accumulatedRotation; //����ȸ���� ����
		if(accumulatedRotation < maxRotation) {//����ȸ������ �ִ�ȸ���� ���������� true
			System.out.println(location + "Tire ���� : " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {   //����ȸ������ �ִ�ȸ�������� ũ�� flase
			System.out.println("***" + location + "Tire ��ũ ***");
			return false;
		}
	}

}
