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
		
		
		BufferedWriter bw = null;
		try {
			// 1. 스트림 생성 : 없으면 만들고, 있으면 덮어씀
			if(!createFlag) {
				bw = new BufferedWriter(new FileWriter(file));
				System.out.println("생성 또는 덮어 씀");
				

				String msg = "오늘은 미세먼지 한가득 화요일입니다.";
				//2. 스트림에 기록할 내용을 쓴다.
				bw.write(msg); 
				System.out.println("스트림에 기록 되어 있음");
				
				//3. 스트림에 남아있는 내용을 목적지로 분출
				bw.flush(); 
				System.out.println("스트림의 내용이 목적지로 분출 되었음");
				
			}//end if
			
			
		}finally {
			if(bw != null) {
				//스트림에 남아있는 내용을 목적지로 분출(flush)하고 연결을 끊는다.
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
