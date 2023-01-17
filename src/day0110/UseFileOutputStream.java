package day0110;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class UseFileOutputStream {
	
	public UseFileOutputStream() throws IOException{
		File file = new File("e:/dev/temp/write_test.txt");
			
		// 0. ������ �����ϸ� ��� ���ΰ��� �����.
		//������ ���ٸ� ������ �����ϰ� ������ �ִٸ� ���� ���������� ��� ��
		//ConfirmDialog�� ��� �� ����� ����� �ƴϿ���� ������ ����� �ʵ���
		boolean createFlag = false;
		if(file.exists()) {
			int select = JOptionPane.showConfirmDialog(null,file + "�� ���� ���ðڽ��ϱ�?","�����ϼ���",JOptionPane.YES_NO_OPTION);
			
			switch(select) {
			case JOptionPane.OK_OPTION: createFlag = false; break;
			case JOptionPane.NO_OPTION: createFlag = true;
			}//end switch
			
		}else {
			
		}
		
		
		FileOutputStream fos = null;
		try {
			// 1. ��Ʈ�� ���� : ������ �����, ������ ���
			if(!createFlag) {
				fos = new FileOutputStream(file);
				System.out.println("���� �Ǵ� ���� ��");
				
				int data = 97;
				int data2 = 98;
				
				//2. ��Ʈ���� ����� ������ ����.
				fos.write(data); // ���ڷ� �����ص� ���ڷ� ����
				fos.write(data2); // ���ڷ� �����ص� ���ڷ� ����
				
				
				//3. ��Ʈ���� �����ִ� ������ �������� ����
				fos.flush(); 
				
			}//end if
			
			
			
			// 2. 
			
		}finally {
			if(fos != null) {
				//��Ʈ���� �����ִ� ������ �������� ����(flush)�ϰ� ������ ���´�.
				fos.close(); 
			}//end finally
		}//end finally
		
	} // UseFileOutputStream
	
	

	public static void main(String[] args) {
		try {
			new UseFileOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch

	} // main

} // class
