package day0109;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UseFileInputStream {
	public UseFileInputStream() throws FileNotFoundException,IOException { //FileNotFoundException�� �θ�� IOException�̹Ƿ� IOException�� ������ ��
		
		//1. File ��ü ����
		File file = new File("e:/dev/temp/java_read.txt");
		if(file.exists()) {
		//2. Stream�� ����Ͽ� ���Ͽ� ����
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		//3. ������ ������ �о���δ�.
//			System.out.println(fis.read());//����� ������ ���� 1byte �б�
			int data = 0;
			while((data = fis.read()) != -1){ // 8��Ʈ ��Ʈ���� ����ϸ� �ѱ� ����(�ѱ��� 2~3byte�̱� ������)
				System.out.print((char)data);
			}//end while	
		}finally{
			if(fis != null) {
				fis.close();
			}
		}
		
		}else {
			System.out.println("������ �������� �ʽ��ϴ�. ��θ� Ȯ�����ּ���.");
		}
		
		
	}//UseFileInputStream

	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (FileNotFoundException e) {
			System.err.println("������ ��θ� Ȯ�����ּ���");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
