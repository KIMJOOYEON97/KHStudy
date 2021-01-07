package kh.java.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) {
		NetworkTest n = new NetworkTest();
//		n.test1();
//		n.test2();
		n.test3();
	}
	/**
	 * URL 연결 요청 → 파일로 저장
	 */
	//외부자원을 접근하고 결과를 저장했다.
	private void test3() {//view source를 지워야 한다.
		String address ="https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%BD%94%EB%A1%9C%EB%82%98";
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection(); //외부연결로부터 읽어내겠다 
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			bw = new BufferedWriter(new FileWriter("search_result.html"));
													// 읽어낸 것을 search_result.html에 저장하겠다.
													//=>브라우저에서 받아낸 것을 java로 받아냄
			String data ="";
			while((data= br.readLine()) != null) {
//				System.out.println(data);
				bw.write(data);
				bw.write("\n");
			}
			
			System.out.println("검색 완료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}


	/**
	 * URL
	 * protocol + hostname + port + 자원path
	 * 
	 * https:// : protocol : 통신규약 http https ftp
	 * 
	 * docs.oracle.com : hostname
	 * 
	 * :443 --->프로토콜에 대한 기본포트는 생략가능 http-443, http-80,ftp-20....
	 * port : 서비스번호. 컴퓨터 내에 특정프로그램을 가리키는 논리적인 번호 ex)443, 80 =>서버 프로그램
	 * 여러개의 프로그램은 각각의 포트번호를 가지고 있다.
	 * 
	 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	 * 
	 * 폴더 구조처럼 보이지만 폴더가 아닐 수도 있다.
	 * /javase/8/docs/api/java/util/ArrayList.html
	 * 
	 */
	private void test2() {
		
		try {
//			URL url = new URL("https://docs.oracle.com:443/javase/8/docs/api/java/util/ArrayList.html");
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%BD%94%EB%A1%9C%EB%82%98");
			System.out.println(url.getProtocol()); // https
			System.out.println(url.getHost()); // docs.oracle.com
			System.out.println(url.getPort() != -1 ? url.getPort():url.getDefaultPort()); // 443 
			                   //프로토콜에 따른 기본 포트 번호 생략되어있다.
			System.out.println(url.getDefaultPort()); //443
			System.out.println(url.getPath()); // /javase/8/docs/api/java/util/ArrayList.html
			System.out.println(url.getQuery()); // 사용자 입력값 //%EC%BD%94%EB%A1%9C%EB%82%98 =>한글이 변환된 유니코드 문자
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * InetAddress
	 * IP주소에 대한 정보를 가진 클래스
	 *       0~255
	 * - ip : 10.10.10.10 4바이트로 이루어진 실제 주소     http://121.65.121.149:12345
	 * 
	 * - hostname : naver.com, iei.or.kr   http://khmclass.iptime.org:12345/
	 * 
	 * 모든 메소드가 static!
	 * 
	 */
	private void test1() {
		try {
			InetAddress naver = InetAddress.getByName("naver.com"); //이름으로 ip주소를 가져오겠다.
			System.out.println(naver.getHostAddress());//ip주소 출력
			
			InetAddress[] arr = InetAddress.getAllByName("naver.com"); //모든 서버의 ip주소를 가져오겠다.
			System.out.println(arr.length);
			for(InetAddress ip : arr)
				System.out.println(ip.getHostAddress());
			
			//내컴퓨터의 ip 주소
			InetAddress localhost = InetAddress.getLocalHost(); // 내컴퓨터의 ip주소
			System.out.println(localhost.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
}
