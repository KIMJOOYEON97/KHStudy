package com.io.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MyNote {
	
	
	private Scanner sc = new Scanner(System.in);
	public MyNote() {
		super();
	}

	public MyNote(Scanner sc) {
		super();
		this.sc = sc;
	}


	
	
	public void fileSave() {
		
		sc.nextLine(); //문자날림
		
		//2. StringBuilder 를 사용하여 문자열을 반복해서 입력받아 추가함
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.print("파일에 저장할 내용을 입력하시오 :");
			String user = sc.nextLine();
			if(user.equals("exit")) {
				break;
			}
			sb.append(user+"\n");
			//3. "exit" 입력되면 반복 종료함
//			System.out.println(sb); 확인용
			//2
		}
		String result = sb.toString();
		//4. "저장하시겠습니까? (y/n) : " 출력
		System.out.print("저장하시겠습니까? (y/n) : " );
		String yesNo = sc.next().toUpperCase();
		//5. 입력값이 대소문자 상관없이 'Y' 이면, "저장할 파일명 : " 출력
		if(yesNo.equals("Y")) {
			//6. 파일명 입력받아, 해당 파일에 출력 기록함.
			System.out.print("저장할 파일명 :");
			String fileName = sc.next();
			
			File f = new File(fileName+".txt");
			//8. 스트림 반납하고 리턴함
			try(
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			){
				bw.write(result+"\n");
				//7. "oooo.txt 파일에 성공적으로 저장하였습니다." 출력
				
				System.out.println(fileName+".txt 파일에 성공적으로 저장하였습니다.");
				
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	public void fileOpen() {
		//1. "열기할 파일명 : " 출력하고, 파일명 입력받음
		System.out.print("열람할 파일명 :");
		String fileName = sc.next();
		File fr = new File(fileName+".txt");
		try (//2. 파일 입력 스트림 생성   4. 스트림 반납하고 리턴 
			BufferedReader br = new BufferedReader(new FileReader(fr));
		){
			String data = null;
			while((data = br.readLine()) != null) {
				//3. 파일의 내용을 한 줄씩 읽어서 화면에 출력함
				System.out.println(data);
			}
		}catch(EOFException e){
			System.out.println("출력 완료");
		}catch(Exception e) {
		e.printStackTrace();}
	}
	
	
	public void fileAppend() {
		//1. "수정할 파일명 : " 출력하고, 파일명 입력받음   11. 스트림 반납하고 리턴함
		System.out.print("수정할 파일명 :");
		String fileName = sc.next();
		File fm = new File(fileName+".txt");
		
		sc.nextLine(); //문자날림
		
		//2. 파일 입력 스트림 생성
		//3. 파일 출력 스트림 생성 
		
		StringBuilder abbsb = new StringBuilder();
//		sc.nextLine(); //문자날림 요기서 문자날림을 하면 화면출력이 안된다.
		
		try(
			BufferedReader brm = new BufferedReader(new FileReader(fm));
		){
			
			
			//4. 파일의 내용을 읽어서 화면출력.
			String data = null;
			while((data = brm.readLine()) != null) {
				System.out.println(data);
				abbsb.append(data+"\n"); // 단, 기존 내용 둔 상태로 생성할 것
				//abbsb에 기존내용을 추가해둠
			}
		}catch(EOFException e) {
			System.out.println("오류남");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(
				BufferedWriter bwm = new BufferedWriter(new FileWriter(fm));
		){
			//5. "파일에 추가할 내용을 입력하시오." 출력하고, 추가할 내용을 StringBuilder에 저장하기.
			do{
				System.out.print("파일에 추가할 내용을 입력하시오.:");
				String adduser = sc.nextLine();
				//7. "exit" 입력하면 반복 종료함
				if(adduser.equals("exit")) {break;}
				abbsb.append(adduser+"\n");
				
				
			}while(true); 
			String resultModify = abbsb.toString();
			
			//8. "저장하시겠습니까? (y/n) : " 출력
			System.out.println("저장하시겠습니까? (y/n):");
			String yesNo = sc.next().toUpperCase();
			//9. 입력값이 대소문자 상관없이 'Y' 이면, 해당 파일에 출력 기록함.
			if(yesNo.equals("Y")) {
				bwm.write(resultModify+"\n"); //개행문자 빼고 가져옴
				System.out.println(fileName+".txt 파일의 내용이 변경되었습니다.");
			}
			
		}catch(EOFException e) {
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
		
	}

}
