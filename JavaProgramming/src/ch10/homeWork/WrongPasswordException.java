package ch10.homeWork;

public class WrongPasswordException  extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);//		
	}
	/*  String Ÿ���� �Ű������� ���� �����ڴ� �θ�Ŭ���� �����ڿ��� �޽����� �Ѱ��ش�.
	  ������ �θ�Ŭ������ catch{} ��Ͼȿ� ����ó�� �ڵ带 ��� �ϱ����ؼ� �̴�.
	  �θ� ��Ī�ϴ� super�� �־��ְ� �Ѱ��� �Ű����� �Ѿ��ش�.
	 *
	 */
}
