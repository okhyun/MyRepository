package ch07.homework;

public class HankookTire extends Tire { //Tire(�θ�)�� ���� �ʵ�, �޼ҵ带 �����޴´�.
	//�ʵ�
	//������
	public HankookTire(String location, int maxRotation) { 
		super(location, maxRotation); //super�� Tire�� �����ڸ� ��Ī�Ѵ�.
	}
	
	//�޼ҵ�
	@Override //�ؿ� ����ΰ� �´��� Ȯ���ϴ� (�����Ϸ�)
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ���� : " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire ��ũ ***");
			return false;
		}
	}

}
