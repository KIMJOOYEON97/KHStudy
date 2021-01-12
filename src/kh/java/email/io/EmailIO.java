package kh.java.email.io;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import kh.java.email.model.vo.Email;

/**
 * 직접 파일에 접근하는 성격의 코드를 작성(저장하거나 읽어오는 것을 함)
 *
 */
public class EmailIO {

	/**
	 * emailList.txt에 Email객체 추가하기
	 * 
	 */
	
	public void insertEmail(Email email) {
	
		File f = new File("emailList.txt");
		try(
			ObjectInputStream ois =
				new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(f)
					) 
				);

		){
			while(true) {
				System.out.println(ois.readObject()); 
			}
		}catch(EOFException e) {
			System.out.println("파일읽어오기 완료");
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
