package day0109;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UseFileInputStream {
	public UseFileInputStream() throws FileNotFoundException,IOException { //FileNotFoundException의 부모는 IOException이므로 IOException만 날려도 됨
		
		//1. File 객체 생성
		File file = new File("e:/dev/temp/java_read.txt");
		if(file.exists()) {
		//2. Stream을 사용하여 파일에 연결
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		//3. 파일의 내용을 읽어들인다.
//			System.out.println(fis.read());//연결된 파일의 최초 1byte 읽기
			int data = 0;
			while((data = fis.read()) != -1){ // 8비트 스트림을 사용하면 한글 깨짐(한글은 2~3byte이기 때문에)
				System.out.print((char)data);
			}//end while	
		}finally{
			if(fis != null) {
				fis.close();
			}
		}
		
		}else {
			System.out.println("파일이 존재하지 않습니다. 경로를 확인해주세요.");
		}
		
		
	}//UseFileInputStream

	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (FileNotFoundException e) {
			System.err.println("파일의 경로를 확인해주세요");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
