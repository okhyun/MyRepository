package ch11.exam03;

import javax.sound.midi.SysexMessage;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		

	}

}
