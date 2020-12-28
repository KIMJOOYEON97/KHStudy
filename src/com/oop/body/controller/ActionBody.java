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
		
		for(Body b: body) {
			b.action(b);  //이렇게 쓸 일이 없지 않나?? ->method의 test참고
		}
	}
	
}
