package com.oop.movie.model.entity;

import java.util.Calendar;

/**
 * @실습문제1 : 영화클래스 만들기
- 클래스명 : com.oop.movie.model.entity.Movie.java
- 멤버변수 : 반드시 캡슐화를 적용할 것
    - movieTitle : String                   //영화제목
    - director : String                     //감독이름
    - casting : String[]                    //출연배우 최대5명까지
    - release : Calendar                    //개봉일
- 각 멤버변수별 getter, setter
- 영화정보를 담은 information():String
- 파라미터 생성자.
    1. movieTitle
    2. movieTitle, director
    3. movieTitle, director, casting
    4. movieTitle, director, casting, release
생성자간 생성자호출 this()를 활용할 것.
영화4편을 각각의 생성자를 통해 생성한 후에 출력한다.

 */
public class Movie {
	
	
	private String movieTitle; 
	private String director; 
	private String[] casting = new String [5]; 
	private Calendar release = Calendar.getInstance();
	
	//기본생성자
	public Movie() {
		
	}
	//1
	public Movie(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	//2
	public Movie(String movieTitle, String director) {
		this(movieTitle);
		this.director =director;
	}
	//3
	public Movie(String movieTitle, String director, String[] casting) {
		this(movieTitle,director);
		this.casting = casting;
	}
	//4
	public Movie(String movieTitle, String director, String[] casting, Calendar release) {
		this(movieTitle,director,casting); 
		this.release = release;
		
	}
	
	public String infomation() {
		String str="";
		if(movieTitle != null) {
			str = this.movieTitle;			
		}
		if(director != null) {
			str += "\n-";
			str += this.director;			
		}
		if(casting[0] != null ) {
			str += "\n--";
			int i = 0;
			for(String str1: casting) {
				str+=str1;
				i++;
				str += i == 4  ?  "": ",";
			}
		
		}
		if(release.get(Calendar.YEAR) !=2020) {
			str += "\n---";
			
			
			int year = this.release.get(Calendar.YEAR);
			int month = this.release.get(Calendar.MONTH);
			int day = this.release.get(Calendar.DAY_OF_MONTH);
			int yo = this.release.get(Calendar.DAY_OF_WEEK);
			
			String yoli = "";
			
			switch(yo) {
			case 2: yoli += "월";break;
			case 3: yoli += "화";break;
			case 4: yoli += "수";break;
			case 5: yoli += "목";break;
			case 6: yoli += "금";break;
			case 7: yoli += "토";break;
			case 1: yoli += "일";break;
			}
			
			str += "개봉 : "+year+"년 "+(month)+"월 "+day+"일 "+yoli+"요일";
		}	
		str +="\n========================================";
		return str;
	}
	
	//getter setter
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String[] getCasting() {
		return casting;
	}
	public void setCasting(String[] casting) {
		this.casting = casting;
	}
	public Calendar getRelease() {
		return release;
	}
	public void setRelease(Calendar release) {
		this.release = release;
	}
	
	
}
