package day0111;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ClientInfoStatus;

/**
 * PORT�� ���� ������ ������ �޴´�.
 * PORT�� ����(���� ���α׷������� ��Ʈ�� ���� ����� �ϳ��� ���α׷��� ����� �� �ִ�.)
 *���� ��Ʈ�� �� �� ���� ������ ����.
 *��ȭ���� OS�� �������� ������.
 *��ȭ���� �ιٿ�� ��å�� ����� ����� �����ϴ�.
 *
 * @author user
 *
 */
public class TestServerSocket {
	
	public TestServerSocket() {
		//��ǻ�Ϳ��� PORT�� 0~65535 ���� �� �ϳ��� PORT�� ������.
		//1024�� ������ ��Ʈ�� ����.
		try {
			//1. ������Ĺ�� �����Ͽ� ��Ʈ�� ����.
			ServerSocket server = new ServerSocket(3000);
			System.out.println("���� ����");
			
			//3. ������ ������ ������ ������ ������ �㰡�Ͽ� �޴´�.
			Socket client = server.accept();//������ ������ ������ �㰡�Ͽ� �޴´�.
			System.out.println("������ ���� :" + client.getInetAddress());
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//TestServerSocket
	
	//remove launch  �ܼ�â�� ������ ��� �� ����� ��

	public static void main(String[] args) {
		new TestServerSocket();

	}//main

}//class
