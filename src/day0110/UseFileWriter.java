package day0110;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class UseFileWriter {
	
	public UseFileWriter() throws IOException{
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
		
		
		BufferedWriter bw = null;
		try {
			// 1. ��Ʈ�� ���� : ������ �����, ������ ���
			if(!createFlag) {
				bw = new BufferedWriter(new FileWriter(file));
				System.out.println("���� �Ǵ� ���� ��");
				

				String msg = "������ �̼����� �Ѱ��� ȭ�����Դϴ�.";
				//2. ��Ʈ���� ����� ������ ����.
				bw.write(msg); 
				System.out.println("��Ʈ���� ��� �Ǿ� ����");
				
				//3. ��Ʈ���� �����ִ� ������ �������� ����
				bw.flush(); 
				System.out.println("��Ʈ���� ������ �������� ���� �Ǿ���");
				
			}//end if
			
			
		}finally {
			if(bw != null) {
				//��Ʈ���� �����ִ� ������ �������� ����(flush)�ϰ� ������ ���´�.
				bw.close(); 
			}//end if
		}//end finally
		
	} // UseFileOutputStream
	
	

	public static void main(String[] args) {
		try {
			new UseFileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch

	} // main

} // class
