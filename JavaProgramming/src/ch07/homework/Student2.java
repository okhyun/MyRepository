package ch07.homework;

public class Student2 {
	//Field
	private int num;
	private String title;
	private String name;
	private String typing;
	private int count;
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTyping() {
		return typing;
	}

	public void setTyping(String typing) {
		this.typing = typing;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	//Constructor
	//Student2(){}
	Student2(int num, String title, String name, String typing, int count){
		this.num = num;
		this.title = title;
		this.name = name;
		this.typing = typing;
		this.count = count;
	}
	
	//Method

}
