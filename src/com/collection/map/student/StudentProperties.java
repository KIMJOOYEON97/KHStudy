package com.collection.map.student;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

public class StudentProperties {

	public static void main(String[] args) {
		
		StudentProperties sp = new StudentProperties();
		List<Student> stdList = sp.readFile();
		sp.printConsole(stdList);
		sp.saveXMLFile(stdList);

	}
	//구현 내용
//		1. Properties 객체 생성하고, score.txt 파일의 내용을 읽어
//		2. 리스트 만듦
//		3. 키를 사용하여, 객체정보를 List<Student>에 저장하여 리턴함
//		  => ", " 으로 문자열 분리처리
//		  => 분리된 문자열을 각 자료형 필드의 값으로 형변환 대입 저장함

	public List<Student> readFile(){
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("score.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Student> stdList = new ArrayList<Student>();
		Enumeration<?> en = prop.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String name = prop.getProperty(key);
			StringTokenizer token = new StringTokenizer(name,",");
			String no = token.nextToken();
			String nameL = token.nextToken();
			String kor = token.nextToken();
			String eng = token.nextToken();
			String math = token.nextToken();
		
			stdList.add(new Student(Integer.valueOf(no),nameL,Integer.valueOf(kor),Integer.valueOf(eng),Integer.valueOf(math)));
				
//			System.out.println(key+" = "+ name);
		}
		return stdList;
	}
	
	public void printConsole(List<Student> stdList) {
//		1. 전달받은 값 출력
		for(Student s: stdList) {	
			System.out.println(s);
		}
		
//		2. 각 객체의 국어합계, 영어합계, 수학합계를 구하고
		int totkor = 0;
		int totmath = 0;
		int toteng = 0;
		for(Student s: stdList){
			totkor += s.getKor();
			toteng += s.getEng();
			totmath += s.getMath();
		} 
//		3. 과목별 평균점수를 출력함
		System.out.println("국어과목 평균점수 : "+totkor/5.0);
		System.out.println("영어과목 평균점수 : "+toteng/5.0);
		System.out.println("수학과목 평균점수 : "+totmath/5.0);
		
		
	}
	
	public void saveXMLFile(List<Student> stdtList) {
//		1. "student.xml" 파일에 번호필드를 key로 객체가 가진 값 기록 저장함.
		Properties prop = new Properties();
		for(Student s: stdtList) {
			String result = s.getName() +","+s.getKor()
							+","+s.getEng()+","+s.getMath();
			prop.setProperty(String.valueOf(s.getNo()), result);
		}
		
		try {
			prop.storeToXML(new FileOutputStream("student.xml"), "student.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
