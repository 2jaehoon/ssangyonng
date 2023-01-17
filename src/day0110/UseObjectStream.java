package day0110;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ��ü�� ���Ϸ� ����, ���Ͽ� �ִ� ��ü�� �о� ���̱�
 * 
 * @author user
 *
 */
public class UseObjectStream {

	public void writeObject() throws IOException {
		// ��Ʈ���� �� ��ü ����
		DataVO dVO = new DataVO("�����", 184.5, 72.4);
		// 1. ��Ʈ�� ����
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("e:/dev/temp/obj.txt"));
			// 2. ��ü ����
			oos.writeObject(dVO);    //����ȭ�� ���� ���� ��ü�� ���� �����߻�!
			System.out.println(dVO + "��ü ���� �Ϸ�");
			
		} finally {
			// 3. ���� ����
			if (oos != null) {
				oos.close();
			}
		}
	}// writeObject

	public void readObject() throws IOException, ClassNotFoundException{
		//1. ��Ʈ�� ����
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("e:/dev/temp/obj.txt"));
		//2. ��ü �б�
			DataVO dVO = (DataVO)ois.readObject(); //�θ�� �ڽ��� �𸣱� ������ ���� �Ҵ� �ȵǰ� �׷��� ĳ������ �ؼ� �Ҵ��Ѵ�.
			System.out.println("�о���� ��ü : " + dVO);
		}finally {
		//3. ���� ����
			if(ois!=null) {
				ois.close();
			}//end if
		}//end finally
	}// readObject;

	public static void main(String[] args) {
		UseObjectStream uos = new UseObjectStream();
//		try {
//			uos.writeObject();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			uos.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}// main

}// class
