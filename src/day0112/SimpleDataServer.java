package day0112;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 접속 소켓에 메시지를 전달하는 서버
 * @author user
 *
 */
public class SimpleDataServer {
	
	public SimpleDataServer() throws IOException{
		//1. 서버 소켓 생성(PORT)열림
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(60000);
			System.out.println("서버 가동중.....");
		//3. 접속 소켓을 받는다.
			while(true) {
			client = server.accept();
			
			String msg = "211.63.89.149 서버에 접속하셨습니다. qwewqewqewqewqeqweq"; // 접속자에게 보내주고 싶은 메시지
		//4. 메시지를 보내기 위한 스트림 얻기
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		//5. Stream에 메시지 기록
			dos.writeUTF(msg);//가나다 => %xx%xx%xx 로 인코딩이 된다 변환되어 스트림으로 charset encoding이라 한다.
		//6. 목적지 Socket으로 분출(접속된 소켓으로 전달된다.)
			dos.flush();
			//11. 메시지를 일긱 위한 스트림을 소켓에서 얻기
			DataInputStream dis = new DataInputStream(client.getInputStream());
			//12. 접속자가 보내오는 메시지를 콘솔에 출력
			System.out.println(client.getInetAddress()+ "의 메시지" + dis.readUTF());
			
			}
		}finally {
			if(server!=null) {
				server.close();
			}//end if
		}//end finally
		
	}//SimpleDataServer

	public static void main(String[] args) {
		try {
			new SimpleDataServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
