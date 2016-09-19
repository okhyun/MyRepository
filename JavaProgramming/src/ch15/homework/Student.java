package ch15.homework;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return studentNum;
		
		/*return name.hashCode() + studentNum; --> 문제풀이*/
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student student = (Student) obj;
		if(studentNum != student.studentNum) return false;
		return true;
		
		/*if(obj instanceof Student) {
			Student student = (Student) obj;
			return student.name.equals(name) && (student.studentNum == studentNum );
		} else {
			return false;
		}  -->문제풀이 */
		
	}

}
