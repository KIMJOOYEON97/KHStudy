package com.oop.body.controller;

import java.util.Scanner;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {
	
	public static void main(String[] args) {
		
		Body body[] = new Body[5];
		Head h = new Head();
		
		int idx = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("머리색을 입력하세요: ");
		h.setHairColor(sc.next());
		for(int i = 0; i<body.length; i++) {
			int check =(int)(Math.random()*3)+1;
			if(check == 1) body[i] = new Arm();
			else if(check == 2) body[i] = h;
			else body[i] =new Leg();
		}
		
		//동적바인딩
		for(Body b: body) {
			b.action();  
			
		}
		ActionBody ab = new ActionBody();	
		System.out.println("------------------");
		//메인메소드내 action 메소드 실행
		for(Body b1 : body)
			ab.action(b1);
	}
	//Body 타입을 변수로 사용하는 action 메소드
		//instanceof로 타입변경하고 각 클래스의 메소드 실행
		public void action(Body body) {
			if(body instanceof Head)
				((Head)body).headBang();
			else if (body instanceof Arm)
				((Arm)body).armSwing();
			else if (body instanceof Leg)
				((Leg)body).run();
		}
}
