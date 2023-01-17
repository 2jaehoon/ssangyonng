package day0109;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8��Ʈ ��Ʈ���� 16��Ʈ ��Ʈ���� ����
 * @author user
 *
 */
public class UseFlieStream2 {
	public UseFlieStream2() throws IOException{
		
		//1.File ����
		File file = new File("e:/dev/temp/java_read2.txt");
		if(file.exists()) {
		//2. Stream ����
		BufferedReader br = null;
		try {
			//BufferedReader �� ���� �б�
			//InputStreamReader 8��Ʈ ��Ʈ���� 16��Ʈ ��Ʈ�� ����, charset encoding
			//FlieInputStream  ���ϰ� ����
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8") );
		
		//3. ������ �����б�
			String readData = "";
			while((readData = br.readLine())!= null){
				System.out.println(readData);
			}//end while
		//4. ���� ����
		}finally {
			if(br!=null) {
				br.close();			
				}//end if
		}//end finally
		
		}else {
			System.out.println(file + "�� ��θ� Ȯ�����ּ���");
		}

	}//UseFlieStream2

	public static void main(String[] args) {
		
		try {
			new UseFlieStream2();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
	}// main
	
}// class
