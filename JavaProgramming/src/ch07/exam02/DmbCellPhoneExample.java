package ch07.exam02;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone ��ü�� ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiVoice("�ȳ��ϼ���");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.tuenOffDmb();
		
		dmbCellPhone.powerOff();

	}

}
