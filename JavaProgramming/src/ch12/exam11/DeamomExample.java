package ch12.exam11;

public class DeamomExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);//main Thread�� ������ ���� �װ� �����.
		ast.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) { }
		
		System.out.println("���� ������ ����");

	}

}
