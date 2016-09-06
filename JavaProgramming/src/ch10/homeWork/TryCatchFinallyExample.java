package ch10.homeWork;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] strArray = {"10", "2a"}; //�迭�� 1�����迭�̰� �ε�����ȣ�� [0],[1] �̴�.
		int value = 0; 
		for(int i=0; i<=2; i++){
			try {
				value = Integer.parseInt(strArray[i]); //StringŸ�� ���ڿ��� int ����Ÿ������ ��ȯ
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����"); //strArray�迭�� ������ 0~1�����⿡ for���� ��� ���� 3��° for���� ���� ���ܰ� �߻��Ѵ�. 
			}catch (NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");//StringŸ���� intŸ������ �ٲ��־����� �迭[1]��° ���� ��ȯ�� ���ܰ� �߻��Ѵ�.("2a a��ü�� ���ڿ� ���ں�ȯ �Ұ���")
			} finally{
				System.out.println(value);//���ܰ� �߻����� ������ finally���� �ڵ带 �����Ѵ�.
			}
		}	

	}

}
