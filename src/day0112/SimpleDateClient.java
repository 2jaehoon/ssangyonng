package day0112;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * �������� ������ ������ ��, ��Ʈ���� �����Ͽ� �������� �������� �޽��� �б�
 * @author user
 *
 */
public class SimpleDateClient {
	
	public SimpleDateClient() throws UnknownHostException, IOException{
		//2. ���� ���� (���� ip, port)
		Socket client = null;
		
		try {
			String ip = JOptionPane.showInputDialog("������ ������ ip�ּҸ� �Է�\n 132,133,134,135,162,137,139,140,141,142,143,144,146,149,150,151,152,154");
		client = new Socket("211.63.89."+ip, 60000);
		//4. �����͸� �б� ���� ��Ʈ���� ���Ͽ��� ���
		DataInputStream dis = new DataInputStream(client.getInputStream());
		
		//7. �������� ������ �����͸� �б�		
		String revMsg = dis.readUTF();
		String sendMsg = JOptionPane.showInputDialog("�������� �� �޽��� : \n" + revMsg);
		//8. ��½�Ʈ�� ���
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		//9. ��Ʈ���� ���� ����
		dos.writeUTF(sendMsg);
		//10. ������ ��Ʈ���� ������ ����
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
