package day0111;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Client : ������ ip �ּҿ� PORT�� �־� ������ �����ϸ�
 * ������ �����ϴ� ��
 * @author user
 *
 */
public class TestSocket {
	public TestSocket() {
		//2. ������ �����Ͽ� ������ ������ �õ��Ѵ�.
		try {
			Socket client  = new Socket("211.63.89.149",3000);
			System.out.println("������ ������ �Ͽ����ϴ�.");
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
