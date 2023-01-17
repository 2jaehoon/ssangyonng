package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import kr.co.sist.chat.client.MultiChatClient;

/**
 * 1.소켓을 받아, 2.스트림을 연결하고, 3.메시지를 계속 읽어들여,
 * 4.모든 접속자에게 메시지를 뿌린다.
 * @author user
 */
public class ServerHelper extends Thread {
	
	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	private JScrollPane jspCenter;//스크롤바를 움직이기 위해서
	
	private int cnt;
	private JTextArea jtaServerDisp;
	
	
	/**
	 *  접속자 소켓, 서버뷰를 J.T.A, 접속순서를 받고, 스트림을 연결하여
	 *   메시지를 읽거나 보낼 수 있도록 채팅 준비를 하는 생성자
	 * @param someClient 접속자 소켓
	 * @param jtaServerDisp 서버에 접속자 상태를 보여주기 위한 J.T.A
	 * @param cnt 접속 count
	 * @throws IOException
	 */
	
	
	
	public ServerHelper(Socket someClient, JTextArea jtaServerDisp, JScrollPane jspCenter, int cnt ) throws IOException {
		this.someClient=someClient;
		this.jtaServerDisp=jtaServerDisp;
		this.jspCenter=jspCenter;
		this.cnt=cnt;
		
		disReadStream=new DataInputStream(someClient.getInputStream());
		dosWriteStream=new DataOutputStream(someClient.getOutputStream());
		
		String nick = disReadStream.readUTF();
		//서버창에 메시지를 출력
//		MultiChatClient mcc  = 
		jtaServerDisp.append(nick + cnt+" 번째로 "+someClient.getInetAddress() //여기에 넣는 건데
				+" 가 접속하였습니다.\n");
		//스크롤바 갱신
		jspCenter.getVerticalScrollBar().setValue(jspCenter.getVerticalScrollBar().getMaximum());
		//모든 접속자에게 메시지를 보내주기
		broadcast(cnt+"번째로 접속자가 접속하였습니다. \n");
		
	}//ServerHelper
	
	@Override
	public void run() {
		
		if(disReadStream!=null) {
			
		String revMsg = "";
		try {
		while(true) {
			//메시지를 읽고 
			revMsg = disReadStream.readUTF();
			//모든 접속자에게 보낸다.
			broadcast(revMsg);
		}//end while
		}catch(IOException ie){
			//접속종료 상태를 서버창에 보여주고
			jtaServerDisp.append(cnt+"번째 접속자가 퇴실 하였습니다.\n");
			//스크롤바 갱신
			jspCenter.getVerticalScrollBar().setValue(jspCenter.getVerticalScrollBar().getMaximum());
			if(someClient !=null) {
				try {
					someClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//end if
			
			//Vector에서 예외를 발생시킨 Helper 객체를 삭제
			MultiChatServer.vecConnectClient.remove(this);
			//모든 접속자에게 알려준다.
			broadcast(cnt+"번째 접속자가 퇴실 하였습니다.\n");
			ie.printStackTrace();
		}//end catich
		
	}//end if
	}//run
	
	public void closeMsg() {
	
	}//closeMsg
	
	/**
	 * 모든 접속자에게 메시지를 보내는 일
	 * @param msg
	 */
	public void broadcast(String msg) {
		Vector<ServerHelper> vec=MultiChatServer.vecConnectClient;
		
		try {
			for(ServerHelper sh : vec) {//모든 접속자에서
				sh.dosWriteStream.writeUTF(msg);//스트림으로 메시지를 쓰고
				sh.dosWriteStream.flush();//목적지 소켓으로 분출
			}//end for
		} catch (IOException ie) {
			//접속종료 상태를 서버창에 보여주고
			jtaServerDisp.append(cnt+"번째 접속자가 퇴실 하였습니다.\n");
			//스크롤바 갱신
			jspCenter.getVerticalScrollBar().setValue(jspCenter.getVerticalScrollBar().getMaximum());
			//메시지 읽기
			if(someClient !=null) {
				try {
					someClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//end if
			//Vector에서 예외를 발생시킨 Helper 객체를 삭제
			MultiChatServer.vecConnectClient.remove(this);
			//모든 접속자에게 알려준다.
			broadcast(cnt+"번째 접속자가 퇴실 하였습니다.\n");
			ie.printStackTrace();
		}//end catch
	}//broadcast

}//class





