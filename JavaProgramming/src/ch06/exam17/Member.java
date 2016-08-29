package ch06.exam17;

public class Member {
	private String mid;
	private String mname;
	private String mpassword;
	private int mage;
	private boolean madult;
	private double mheight;
	
	public Member(String mid){
		this.mid = mid;
	}
	
	public String getMid(){
		return mid;
	}
	
	public void setMheight(double mheight){//set메소드는 값을 점검할수있다. if문 사용가능
		if(mheight<0.0){
			mheight = 0.0;
		}
		this.mheight = mheight;
	}

}
