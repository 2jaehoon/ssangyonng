package day0109;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���� Ŭ������ ���
 * @author user
 *
 */
public class UseFile {
	
	public UseFile() {
		//1. ����
		File file = new File("e:\\dev\\temp\\java_read.txt");
		if(file.exists()) {
			try {
				System.out.println("������ : " + file.getAbsolutePath()); // ���� ���� ��ΰ� ���� �� �ִ�.
				System.out.println("�Թ���� : " + file.getCanonicalPath()); // �ϳ��� ��θ� ���´�.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end catch
			System.out.println("��� : " + file.getPath());
			System.out.println("���丮 : " + file.getParent());
			System.out.println("���� �̸� : " + file.getName());
			System.out.println("���� ũ�� : " + file.length() + "byte");
			
			System.out.println("���丮���� ���� : " + file.isDirectory());
			System.out.println("�������� ���� : " + file.isFile());
			
			System.out.println("�б� ���� ���� : " + file.canRead());
			System.out.println("���� ���� ���� : " + file.canExecute());
			System.out.println("���� ���� ���� : " + file.canWrite()); // �б� ����
			System.out.println("���� ���� ���� : " + file.isHidden());
			
			System.out.println("������ ������ : " + file.lastModified());
			Date date = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss EEEE");
//			System.out.println(sdf.format(date));
//			System.out.println(date);
			System.out.println(file.lastModified());
			
			
			
		}else {
			System.out.println("������ ����");
		}//end else
		
		
		
		
		
	}//UseFile

	public static void main(String[] args) {
		new UseFile();
	}//main

}//class
