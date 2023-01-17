package day0112;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * 소켓으로 서버에 접속한 후, 스트림을 연결하여 서버에서 보내오는 메시지 읽기
 * @author user
 *
 */
public class SimpleDateClient {
	
	public SimpleDateClient() throws UnknownHostException, IOException{
		//2. 소켓 생성 (서버 ip, port)
		Socket client = null;
		
		try {
			String ip = JOptionPane.showInputDialog("접속할 서버의 ip주소를 입력\n 132,133,134,135,162,137,139,140,141,142,143,144,146,149,150,151,152,154");
		client = new Socket("211.63.89."+ip, 60000);
		//4. 데이터를 읽기 위한 스트림을 소켓에서 얻기
		DataInputStream dis = new DataInputStream(client.getInputStream());
		
		//7. 서버에서 보내온 데이터를 읽기		
		String revMsg = dis.readUTF();
		String sendMsg = JOptionPane.showInputDialog("서버에서 온 메시지 : \n" + revMsg);
		//8. 출력스트림 얻기
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		//9. 스트림에 내용 쓰기
		dos.writeUTF(sendMsg);
		//10. 목적지 스트림의 내용을 분출
		dos.flush();
		
		}finally {
			if(client !=null) {
				client.close();
			}
		}
		
	}//SimpleDateClient

	public static void main(String[] args) {
		try {
			new SimpleDateClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
