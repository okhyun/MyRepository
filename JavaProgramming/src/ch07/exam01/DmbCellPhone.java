package ch07.exam01;

public class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;
	
	//������
	 DmbCellPhone(String model, String color, int channel) {
		this.model = model;//this�� �ڱ��ڽ��� ��Ī�Ѵ�.
		super.color = color; //super�� �θ� ��Ī�ϴ� ��ɾ�(CellPhone), �ڽ�Ŭ���� �ȿ����� �����ִ�, �ν��Ͻ� ��ü������ �����ִ�.
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int chnnel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void tuenOffDmb(){
		System.out.println("DMB ��� ������ ����ϴ�.");
	}

}
