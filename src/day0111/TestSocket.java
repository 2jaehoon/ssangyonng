package day0111;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Client : 서버의 ip 주소와 PORT를 넣어 소켓을 생성하면
 * 서버에 접속하는 일
 * @author user
 *
 */
public class TestSocket {
	public TestSocket() {
		//2. 소켓을 생성하여 서버에 접속을 시도한다.
		try {
			Socket client  = new Socket("211.63.89.149",3000);
			System.out.println("서버에 접속을 하였습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//TestSocket

	public static void main(String[] args) {
		new TestSocket();
	}//main

}//class
