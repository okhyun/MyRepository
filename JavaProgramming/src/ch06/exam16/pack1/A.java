package ch06.exam16.pack1;

public class A {//class앞에 
	//Field
	private int field1; //private 개인적인 비공개(자기 자신만 쓴다.)
	int field2; //디폴트 같은 패키지에서만 사용(패키지 풀네임이 같아야한다.)
	public int field3; //public 공개적인 공개 모든곳
	
	
	//Constructor
	private A() {}
	A(int field1) {}
	public A(int field1, int field2) {}
	
	
	
	//Method
	private void nethod1(){}
	void method2(){}
	public void method3(){}

}
