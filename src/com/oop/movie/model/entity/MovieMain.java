package com.oop.movie.model.entity;

import java.util.Calendar;

public class MovieMain {
	
	public static void main(String[] args) {
		
		Calendar release = Calendar.getInstance();
		
		release.set(Calendar.YEAR,2014);
		release.set(Calendar.MONTH,11);
		release.set(Calendar.DAY_OF_MONTH,6);
		
		
		
		String[] casting = {"매슈 매코너헤이","앤 해서웨이","마이클 케인","매켄지 포이"};
		
				
		Movie m1 = new Movie("인터스텔라","크리스토퍼 놀란",casting,release);
		Movie m2 = new Movie("인터스텔라","크리스토퍼 놀란",casting);
		Movie m3 = new Movie("인터스텔라","크리스토퍼 놀란");
		Movie m4 = new Movie("인터스텔라");
		
		System.out.println(m1.infomation());
		System.out.println(m2.infomation());
		System.out.println(m3.infomation());
		System.out.println(m4.infomation());
	}

}
