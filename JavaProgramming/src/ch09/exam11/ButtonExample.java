package ch09.exam11;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setOnClickListener( new Button.OnClickListener(){

			@Override
			public void onClick() {
				System.out.println("������ ����մϴ�.");
				
			}});
		
		Button btnCancel = new Button();
		btnCancel.setOnClickListener( new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ �����մϴ�.");
			}
		});
		
		btnOk.click();
		btnCancel.click();
	}
}


