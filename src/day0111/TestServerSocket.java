package day0111;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ClientInfoStatus;

/**
 * PORT를 열고 접속자 소켓을 받는다.
 * PORT는 선점(같은 프로그램일지라도 포트는 먼저 실행될 하나의 프로그램만 사용할 수 있다.)
 *같은 포트를 두 번 쓰면 에러가 난다.
 *방화벽은 OS의 설정으로 열린다.
 *방화벽에 인바운드 정책을 열어야 사용이 가능하다.
 *
 * @author user
 *
 */
public class TestServerSocket {
	
	public TestServerSocket() {
		//컴퓨터에서 PORT는 0~65535 사이 중 하나의 PORT가 열린다.
		//1024번 이후의 포트를 연다.
		try {
			//1. 서버소캣을 생성하여 포트를 연다.
			ServerSocket server = new ServerSocket(3000);
			System.out.println("서버 실행");
			
			//3. 접속자 소켓이 들어오면 접속자 소켓을 허가하여 받는다.
			Socket client = server.accept();//접속자 소켓이 들어오면 허가하여 받는다.
			System.out.println("접속자 있음 :" + client.getInetAddress());
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//TestServerSocket
	
	//remove launch  콘솔창을 여러개 띄울 시 지우는 것

	public static void main(String[] args) {
		new TestServerSocket();

	}//main

}//class
