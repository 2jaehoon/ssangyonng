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
 * 1.������ �޾�, 2.��Ʈ���� �����ϰ�, 3.�޽����� ��� �о�鿩,
 * 4.��� �����ڿ��� �޽����� �Ѹ���.
 * @author user
 */
public class ServerHelper extends Thread {
	
	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	private JScrollPane jspCenter;//��ũ�ѹٸ� �����̱� ���ؼ�
	
	private int cnt;
	private JTextArea jtaServerDisp;
	
	
	/**
	 *  ������ ����, �����並 J.T.A, ���Ӽ����� �ް�, ��Ʈ���� �����Ͽ�
	 *   �޽����� �аų� ���� �� �ֵ��� ä�� �غ� �ϴ� ������
	 * @param someClient ������ ����
	 * @param jtaServerDisp ������ ������ ���¸� �����ֱ� ���� J.T.A
	 * @param cnt ���� count
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
		//����â�� �޽����� ���
//		MultiChatClient mcc  = 
		jtaServerDisp.append(nick + cnt+" ��°�� "+someClient.getInetAddress() //���⿡ �ִ� �ǵ�
				+" �� �����Ͽ����ϴ�.\n");
		//��ũ�ѹ� ����
		jspCenter.getVerticalScrollBar().setValue(jspCenter.getVerticalScrollBar().getMaximum());
		//��� �����ڿ��� �޽����� �����ֱ�
		broadcast(cnt+"��°�� �����ڰ� �����Ͽ����ϴ�. \n");
		
	}//ServerHelper
	
	@Override
	public void run() {
		
		if(disReadStream!=null) {
			
		String revMsg = "";
		try {
		while(true) {
			//�޽����� �а� 
			revMsg = disReadStream.readUTF();
			//��� �����ڿ��� ������.
			broadcast(revMsg);
		}//end while
		}catch(IOException ie){
			//�������� ���¸� ����â�� �����ְ�
			jtaServerDisp.append(cnt+"��° �����ڰ� ��� �Ͽ����ϴ�.\n");
			//��ũ�ѹ� ����
			jspCenter.getVerticalScrollBar().setValue(jspCenter.getVerticalScrollBar().getMaximum());
			if(someClient !=null) {
				try {
					someClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//end if
			
			//Vector���� ���ܸ� �߻���Ų Helper ��ü�� ����
			MultiChatServer.vecConnectClient.remove(this);
			//��� �����ڿ��� �˷��ش�.
			broadcast(cnt+"��° �����ڰ� ��� �Ͽ����ϴ�.\n");
			ie.printStackTrace();
		}//end catich
		
	}//end if
	}//run
	
	public void closeMsg() {
	
	}//closeMsg
	
	/**
	 * ��� �����ڿ��� �޽����� ������ ��
	 * @param msg
	 */
	public void broadcast(String msg) {
		Vector<ServerHelper> vec=MultiChatServer.vecConnectClient;
		
		try {
			for(ServerHelper sh : vec) {//��� �����ڿ���
				sh.dosWriteStream.writeUTF(msg);//��Ʈ������ �޽����� ����
				sh.dosWriteStream.flush();//������ �������� ����
			}//end for
		} catch (IOException ie) {
			//�������� ���¸� ����â�� �����ְ�
			jtaServerDisp.append(cnt+"��° �����ڰ� ��� �Ͽ����ϴ�.\n");
			//��ũ�ѹ� ����
			jspCenter.getVerticalScrollBar().setValue(jspCenter.getVerticalScrollBar().getMaximum());
			//�޽��� �б�
			if(someClient !=null) {
				try {
					someClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//end if
			//Vector���� ���ܸ� �߻���Ų Helper ��ü�� ����
			MultiChatServer.vecConnectClient.remove(this);
			//��� �����ڿ��� �˷��ش�.
			broadcast(cnt+"��° �����ڰ� ��� �Ͽ����ϴ�.\n");
			ie.printStackTrace();
		}//end catch
	}//broadcast

}//class





