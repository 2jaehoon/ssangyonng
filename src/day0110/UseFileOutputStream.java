package day0110;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class UseFileOutputStream {
	
	public UseFileOutputStream() throws IOException{
		File file = new File("e:/dev/temp/write_test.txt");
			
		// 0. 파일이 존재하면 덮어쓸 것인가를 물어본다.
		//파일이 없다면 파일을 생성하고 파일이 있다면 덮어 쓸것인지를 물어본 후
		//ConfirmDialog로 물어본 후 예라면 덮어쓰고 아니오라면 파일을 덮어쓰지 않도록
		boolean createFlag = false;
		if(file.exists()) {
			int select = JOptionPane.showConfirmDialog(null,file + "을 덮어 쓰시겠습니까?","선택하세요",JOptionPane.YES_NO_OPTION);
			
			switch(select) {
			case JOptionPane.OK_OPTION: createFlag = false; break;
			case JOptionPane.NO_OPTION: createFlag = true;
			}//end switch
			
		}else {
			
		}
		
		
		FileOutputStream fos = null;
		try {
			// 1. 스트림 생성 : 없으면 만들고, 있으면 덮어씀
			if(!createFlag) {
				fos = new FileOutputStream(file);
				System.out.println("생성 또는 덮어 씀");
				
				int data = 97;
				int data2 = 98;
				
				//2. 스트림에 기록할 내용을 쓴다.
				fos.write(data); // 숫자로 지정해도 문자로 나옴
				fos.write(data2); // 숫자로 지정해도 문자로 나옴
				
				
				//3. 스트림에 남아있는 내용을 목적지로 분출
				fos.flush(); 
				
			}//end if
			
			
			
			// 2. 
			
		}finally {
			if(fos != null) {
				//스트림에 남아있는 내용을 목적지로 분출(flush)하고 연결을 끊는다.
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
