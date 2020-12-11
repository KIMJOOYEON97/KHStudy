package com;

public class ReturnTest {

	public static void main(String[] args) {
		new ReturnTest().a();
		System.out.println("매인종료");
	}
	
	public void a() {
		b();
		System.out.println("a종료");
	}
	
	public void b() {
		if(true)
			return;
			System.out.println("b종료");
	}
}
