package ch11.homework;

// 11�� Ȯ�ι��� 3�� 
public class Student { 
	private String studentNum; //�ʵ尪
	
	public Student(String studentNum) { //������ ����
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) { //equals ������
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() { //hashCode ������
		return studentNum.hashCode(); //���ϰ����� studentNum.hashCode() ����
	}

}
