package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {
	
	public static void main(String[] args) {
		
		Body body[] = new Body[5];
		
		int idx = 0;
		
		for(int i = 0; i<body.length; i++) {
			int check =(int)(Math.random()*3)+1;
			if(check == 1) body[i] = new Arm();
			else if(check == 2) body[i] = new Head();
			else body[i] =new Leg();
		}
		
		for(Body b: body) {
			b.action();
		}
	}
	
}
