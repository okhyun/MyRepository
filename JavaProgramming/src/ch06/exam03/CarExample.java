package ch06.exam03;

public class CarExample {//Car.class���� �����ڸ� ���ؼ� ���� ���赵�� �̿��Ͽ� �����Ѵ�.

	public static void main(String[] args) {
		//Car ���� ����
		Car myCar = null;
		
		//Car ��ü �����ϰ� ��ġ ���� ���
		try{
			myCar = new Car();//�����ڸ� ȣ���Ѵٴ°��� �������� ���๮�� �����ϴ°��̴�.
		} catch(Exception e){
			
		  }
		
		//Car ��ü�� �ִ����� ����
		if(myCar !=null){
			System.out.println("Car ��ü ����");
		} else{
			System.out.println("Car ��ü ����");
		}
		
		//��ü ������ �ʵ尪�� �о��.
		System.out.println(myCar.company);
		
		//��ü ������ �ʵ尪�� ������ ����.
		myCar.company = "KOSA";
		System.out.println(myCar.company);
		
		//��ü ������ �޼ҵ带 ȣ���� ����.
		myCar.run();
		 

	}

}
