package com.mycompany.myapp.exam13.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Member {
	private String mid;
	private String mname;
	private int mage;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date mbirth;
	private String mpassword;
	
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	
	public Date getMbirth() {
		return mbirth;
	}
	public void setMbirth(Date mbirth) {
		this.mbirth = mbirth;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	

}
