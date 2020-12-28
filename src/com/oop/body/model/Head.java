package com.oop.body.model;

public class Head extends Body {
	

	private String hairColor;
	
	public Head() {
		super();
		//기본색 설정
		this.hairColor = "검정";
		// TODO Auto-generated constructor stub
	}

	public Head(String hairColor) {
		super();
		this.hairColor = hairColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public void headBang() {
		System.out.println(hairColor+"색 머리를 돌립니다.");
	}
	public void action() {
		headBang();
	}

}
