package ch11.homework;

//11�� Ȯ�ι���4��
public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() { //�������̵�(������)�� �� ���ϰ����� 
		return id + " : " + name; //�������--> blue : ���Ķ�<-- �̰��̱� ������ �����Ѱ��� ���´�  id + " : " + name; �̴�.
	}

}
