package com.oop.coffee.model.dto;
/**
 * - Coffee 멤버변수 원산지 origin, 지역 location
      기본생성자, 모든필드초기화생성자
      getter, setter
      출력메소드    
 * 
 *
 */
public class Coffee {

	private String origin;
	private String location;
	
	public Coffee(String from, String region){
		this.origin = from;
		this.location = region;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void printCoffee() {
		System.out.println(origin+"\t"+location);
		
	}
	
	
	
}
