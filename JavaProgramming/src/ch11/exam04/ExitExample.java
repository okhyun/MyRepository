package ch11.exam04;

public class ExitExample {//����

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {//exit�޼ҵ尡 ȣ��Ǿ����� üũ�ϰڴ�. ������ ����ó���Ǹ� ���ᰡ �ȴ�.
				if(status !=5) {
				System.out.println("��?");
				throw new SecurityException(); //����ó�� �ؾ��Ѵ�.
				}
			}
		});
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try{
				System.exit(i); //����� �ȵȴ�. --���α׷��� �����ض�. i�� ������¹�ȣ
				//break; //����� �ȴ�. --for���� ������
				//return; //����� �ȵȴ�. --�޼ҵ带 �����ض�
			} catch(SecurityException e) { }
		}

	}
}