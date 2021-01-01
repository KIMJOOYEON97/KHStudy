package kh.java.io.byte_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		FileIOTest f = new FileIOTest();
		f.test1();
		
		f.test2();
		System.out.println("--- 정상종료 ---");
	}
	
	/**
	 * 내 컴퓨터의 이미지파일을 복사해서 byte폴더 하위에 위치시킬것.
	 * 경로상의 한글을 피할것.
	 */
	public void test2() {
		String fileName ="C:\\Users\\김주연\\Desktop\\OBS녹화 방법\\KakaoTalk_20200926_113104654.png";//절대경로
		String copy ="byte/image_copy.png";//root기준으로 상대경로
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fileName);//fileName을 읽어와라
			fos = new FileOutputStream(copy);//copy를 읽어와라
			
			int data = 0;
			
			while((data=fis.read())!= -1) {
				fos.write(data);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close(); //자원반납
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사 완료!");
	}
	public void test1() {
		String filePath ="test.txt";
		String copyPath = "byte/test_copy.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(filePath);
			fos = new FileOutputStream(copyPath);
			
			int data= 0; //읽어온 데이터를 담은 변수 byte는 경우의 수가 모자라서 못씀 int를 사용해야함 =>읽어온 값 숫자

			while((data=fis.read() )!= -1 ) {
				System.out.print((char)data); //문자로 바꿔줌
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
