package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {

	private Scanner sc = new Scanner(System.in);

	public BookManager() {
		super();
	}
	
	public void fileSave() {
		File f = new File("test4/books.dat");
		Book[] books = new Book[5];
		try(
			ObjectOutputStream oos =
				new ObjectOutputStream( //객체형식으로 쓸 것
					new BufferedOutputStream( //성능좋은 출력 튜닝
						new FileOutputStream(f))); //byte주 스트림
		){
			Calendar c1 = new GregorianCalendar(2007,2,17);
			Calendar c2 = new GregorianCalendar(2015,9,30);
			Calendar c3 = new GregorianCalendar(2013,7,25);
			Calendar c4 = new GregorianCalendar(2016,11,10);
			Calendar c5 = new GregorianCalendar(2015,12,7);
			
			books[0] = new Book("디자인의 디자인","하라 켄야",15000,c1,10.0);
			books[1] = new Book("소비의 사회","장 보드리야르",18000,c2,15.0);
			books[2] = new Book("살인자의 기억법","김영하",10000,c3,20.0);
			books[3] = new Book("소음과 투자","리처드 번스타인",16000,c4,25.0);
			books[4] = new Book("보건교사 안은영","정세랑",14000,c5,5.0);
			
			
			//for문으로 작성
			for(int i = 0; i<books.length;i++) {
				
				oos.writeObject(books[i]);
			}
			
			System.out.println("books.dat 에 저장 완료!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void fileRead() {
		File f = new File("test4/books.dat");
		try( 
			ObjectInputStream ois = 
				new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(f)));
				
		){
			Book[] books = new Book[10];
			
			//for문으로 출력
			for(int i = 0 ;i <books.length; i++) {
				if(books[i] == null) { //왜 null이 되어야 출력이 되는지 모르겠음
					System.out.println(ois.readObject());
				}
			}
			
			//while문으로 출력
//			while(true) {
//				System.out.println(ois.readObject()); 
//			}
		}catch(EOFException e) {
			System.out.println("books.dat 읽기 완료!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *     + fileSave():void
    >> 구현내용
        1. Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
        2. "books.dat" 파일에 객체 기록 저장함
        3. try with resource 문 사용할 것
        4. "books.dat 에 저장 완료!" 출력
    + fileRead():void
    >>구현내용
        1. Book 객체 배열 선언 : 10개
        2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
        3. 객체 정보를 화면에 출력함
        4. try with resource 문 사용할 것
        5. "books.dat 읽기 완료!" 출력
	 */
	
}
