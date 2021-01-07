package kh.java.network.socket.cilient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import kh.java.network.socket.server.CharServer;

public class CharClient {
	
	public static void main(String[] args) {
		new CharClient().init();
	}

	public static final String SERVER_IP = "khmclass.iptime.org";
	public static final int  SERVER_PORT = 7777;

	
	private void init() {
		try {
			//1.소켓 생성및 연결요청
			Socket socket = new Socket(SERVER_IP,SERVER_PORT);
			
			//2.소켓용 입출력 스트림준비
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			//3.서버통신
//			System.out.println("서버 : "+br.readLine());//서버 웰컴메시지
			
			//4. 채팅
			String data = "";
			Scanner sc = new Scanner(System.in);//사용자 키보드 입력
			while((data = br.readLine()) != null) { //무언가를 읽어들이면서 시작
				System.out.println("서버 : "+data); // 환영합니다.
				System.out.print("클라이언트 : ");
				String msg = sc.nextLine();
				pw.println(msg); //다시 소캣에 입력(쓰기작업)
				pw.flush();		// 소캣에 exit하면 if문에 걸리게 된다.	
				
				if("exit".equals(msg)) {
					System.out.println("채팅프로그램을 종료합니다.");
					break;}
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
