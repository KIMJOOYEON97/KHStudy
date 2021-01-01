package kh.java.io.byte_object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectIOTest {

	public static void main(String[] args) {
		ObjectIOTest o = new ObjectIOTest();
		o.test1();
		o.test2();
	}
	
	public void test2() {
		File f = new File("object/user.ser");
		try(
			ObjectInputStream ois =
				new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(f)
					) 
				);

		){
			//몇개 저장되었는지 모르는 상황
			while(true) {
				
				System.out.println(ois.readObject()); 
			}
		}catch(EOFException e) {
			System.out.println("파일읽어오기 완료");
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private void test1() {
		
		File f = new File("object/user.ser");
		
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream( //객체형식으로 쓸 것임
						new BufferedOutputStream(  // 성능좋은 출력스트림
								new FileOutputStream(f)));	//대상을 가리키고 있는 주 스트림
		){
			User u1 = new User("honggd","1234","길동",Calendar.getInstance());
			User u2 = new User("sinsa","1234","신사임당",Calendar.getInstance());
			User u3 = new User("sejong","1234","세종",Calendar.getInstance());

			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(u3);
			System.out.println("객체 쓰기 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
