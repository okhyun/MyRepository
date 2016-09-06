package ch11.homework;

//Ȯ�ι��� 3�� 
public class Student { 
	private String studentNum; //�ʵ尪
	
	public Student(String studentNum) { //������ ����
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

}
