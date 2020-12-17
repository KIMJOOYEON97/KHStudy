package kh.java.oop.student;

public class Speaker {
	
	String brand;
	String color;
	int volume;
	int maxVolume;
	//field에 객체 특징 세팅
	
	//기능
	public void volumUp() {
		volume++;
	}
	
	public void volumeDown() {
		volume--;
	}
	
	public String info() {
		return brand+", "+color+", "+volume+", "+maxVolume; 
		//필드 정보를 모아서 한번에  문자열ㄹ로 리턴한다.
	}

}
