package com.api.member.model.vo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Member {
	
	private int memberNo;
	private String memberName;
	private int height;
	private int weight;
	private Calendar birth;
	
	
	
	public Member() {}

	public Member(int memberNo, String memberName, int height, int weight, Calendar birth) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.height = height;
		this.weight = weight;
		this.birth = birth;
	}
	
	
	
	public String information() {
		return "번호 : "+memberNo+"\n"
				+"이름 : "+memberName+"\n"
				+"키 : "+height+"cm"+"\n"
				+"몸무게: "+weight+"kg"+"\n"
				+"생년월일: "+birth.get(Calendar.YEAR)+"년 "
				+birth.get(Calendar.MONTH)+"월 "
				+birth.get(Calendar.DATE)+"일"
				+"\n-----------------";
	}

	//getter setter
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}

	
		
		
		
}
	

