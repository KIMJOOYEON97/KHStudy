package com.thread.sleep;

//+ sendAphorism() : void 
//- 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
//- 10번 출력후 종료하세요
public class SleepTest {
	public static void main(String[] args) {
		SleepTest s = new SleepTest();
		s.sendAphorism();
	}
	
	public void sendAphorism() {
		String[] str =new String[10];
		str[0]="가는 날이 장날이다."; 
		str[1]="갈수록 태산."; 
		str[2]="간이 콩알만해지다."; 
		str[3]="가랑비에 옷 젖는 줄 모른다."; 
		str[4]="가랑잎이 솔잎더러 바스락거린다고 한다."; 
		str[5]="간이 콩알만해지다."; 
		str[6]="가재는 게 편이라."; 
		str[7]="가지 많은 나무에 바람 잘 날 없다."; 
		str[8]="간에 붙었다 쓸개에 붙었다 한다."; 
		str[9]="간에 기별도 안간다"; 
		
		Thread th = new RandomThread(str);
		th.start();
	

		}
		
		
		
}



