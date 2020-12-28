package com.oop.body.model;

public class Arm extends Body{

	public Arm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void armSwing() {
		System.out.println("팔을 뻗습니다.");
	}
	
	public void action() {
		armSwing();
	}
}
