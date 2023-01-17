package day0112;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ���� ���Ͽ� �޽����� �����ϴ� ����
 * @author user
 *
 */
public class SimpleDataServer {
	
	public SimpleDataServer() throws IOException{
		//1. ���� ���� ����(PORT)����
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(60000);
			System.out.println("���� ������.....");
		//3. ���� ������ �޴´�.
			while(true) {
			client = server.accept();
			
			String msg = "211.63.89.149 ������ �����ϼ̽��ϴ�. qwewqewqewqewqeqweq"; // �����ڿ��� �����ְ� ���� �޽���
		//4. �޽����� ������ ���� ��Ʈ�� ���
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		//5. Stream�� �޽��� ���
			dos.writeUTF(msg);//������ => %xx%xx%xx �� ���ڵ��� �ȴ� ��ȯ�Ǿ� ��Ʈ������ charset encoding�̶� �Ѵ�.
		//6. ������ Socket���� ����(���ӵ� �������� ���޵ȴ�.)
			dos.flush();
			//11. �޽����� �ϱ� ���� ��Ʈ���� ���Ͽ��� ���
			DataInputStream dis = new DataInputStream(client.getInputStream());
			//12. �����ڰ� �������� �޽����� �ֿܼ� ���
			System.out.println(client.getInetAddress()+ "�� �޽���" + dis.readUTF());
			
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
