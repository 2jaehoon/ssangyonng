package day0109;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8비트 스트림과 16비트 스트림을 연결
 * @author user
 *
 */
public class UseFlieStream2 {
	public UseFlieStream2() throws IOException{
		
		//1.File 생성
		File file = new File("e:/dev/temp/java_read2.txt");
		if(file.exists()) {
		//2. Stream 연결
		BufferedReader br = null;
		try {
			//BufferedReader 줄 단위 읽기
			//InputStreamReader 8비트 스트림과 16비트 스트림 연결, charset encoding
			//FlieInputStream  파일과 연결
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8") );
		
		//3. 파일의 내용읽기
			String readData = "";
			while((readData = br.readLine())!= null){
				System.out.println(readData);
			}//end while
		//4. 연결 끊기
		}finally {
			if(br!=null) {
				br.close();			
				}//end if
		}//end finally
		
		}else {
			System.out.println(file + "의 경로를 확인해주세요");
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
