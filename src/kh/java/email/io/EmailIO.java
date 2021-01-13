package kh.java.email.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kh.java.email.model.vo.Email;

/**
 * 직접 파일에 접근하는 성격의 코드를 작성(저장하거나 읽어오는 것을 함)
 *
 */
public class EmailIO {

	File f = new File("emailList.txt"); //같은 파일 접근함으로 필드로 만듬
	/**
	 * emailList.txt에 Email객체 추가하기
	 * 
	 */
	
	public void insertEmail(Email email) {
		//기존정보 읽어오기
		List<Email> list  = loadEmailList();
		list.add(email);
		System.out.println("list@io.insertEmail = "+list);
		
		try(
			ObjectOutputStream oos =
				new ObjectOutputStream(
					new BufferedOutputStream(  
						new FileOutputStream(f)
					) 
				);

		){
			for(Email e : list)
				oos.writeObject(e); 		//email하면 썼던 것만 계속나옴
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<Email> loadEmailList() {
		List<Email> list = new ArrayList<>();
		
		try(
			ObjectInputStream ois
							= new ObjectInputStream(
							new BufferedInputStream(
						new FileInputStream(f)));
		){
			while(true) {
				Email email = (Email)ois.readObject();
				list.add(email);
			}
		}catch(FileNotFoundException e) {
			//최초 등록시 FileNotFoundException발생
//			//최종 등록시 파일 생성하기 
//			try {
//				f.createNewFile();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		}catch(EOFException e) {
			//처리코드 없음.//예외가 발생하기 때문에 반복문이 탈출됌.
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		return list;
	}
	
	
	

}
