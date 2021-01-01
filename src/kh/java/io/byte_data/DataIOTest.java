package kh.java.io.byte_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIOTest {
	
	public static void main(String[] args) {
		DataIOTest d = new DataIOTest();
//		d.test1();
		d.test2();
	}
	
	private void test2() { //읽어오기
		File f = new File("data/sample.dat");
		
		try(
			DataInputStream dis = new DataInputStream(new FileInputStream(f))
		){
			//쓰여진 자료형 순서대로 읽어올 것.
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
//			dis.readChars(String)//2byte식대로 나열
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	public void test1() {
		File f = new File("data/sample.dat");
		
		
		try(
				DataOutputStream dos = 
					new DataOutputStream(new FileOutputStream(f)); 
		){
			//자바 자료형별로 작성 가능 -> 자료형별로 가진 크기대로 작성하겠다.
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeDouble(3.14);
			dos.writeChar('안');
			dos.writeChar('녕');
			dos.writeUTF("자바자바자바");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DataOutputStream 작업 완료!");
	}

}
