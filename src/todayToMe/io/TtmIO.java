package todayToMe.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class TtmIO {
	static File f = new File("todayToMe.txt");
			
	public static String insertName(String name) {
		List<String> nameList =new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(f));
			){
				while(true) {
					nameList.add(String.valueOf(br));
				}
			}catch(FileNotFoundException e) {
				//최초 등록시 FileNotFoundException발생
//				//최종 등록시 파일 생성하기 
//				try {
//					f.createNewFile();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}catch(EOFException e) {
				//처리코드 없음.//예외가 발생하기 때문에 반복문이 탈출됌.
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		return name;
		
	}
	
	public String loadName(String name) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			){
			}catch(FileNotFoundException e) {
				//최초 등록시 FileNotFoundException발생
//				//최종 등록시 파일 생성하기 
//				try {
//					f.createNewFile();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}catch(EOFException e) {
				//처리코드 없음.//예외가 발생하기 때문에 반복문이 탈출됌.
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		return name;
		
	}
}
