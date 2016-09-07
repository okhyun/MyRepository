package ch11.homework;

// 11장 확인문제 3번 
public class Student { 
	private String studentNum; //필드값
	
	public Student(String studentNum) { //생성자 생성
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) { //equals 재정의
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() { //hashCode 재정의
		return studentNum.hashCode(); //리턴값으로 studentNum.hashCode() 리턴
	}

}
