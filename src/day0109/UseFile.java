package day0109;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 파일 클래스의 사용
 * @author user
 *
 */
public class UseFile {
	
	public UseFile() {
		//1. 생성
		File file = new File("e:\\dev\\temp\\java_read.txt");
		if(file.exists()) {
			try {
				System.out.println("절대경로 : " + file.getAbsolutePath()); // 여러 개의 경로가 나올 수 있다.
				System.out.println("규범경로 : " + file.getCanonicalPath()); // 하나의 경로만 나온다.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end catch
			System.out.println("경로 : " + file.getPath());
			System.out.println("디렉토리 : " + file.getParent());
			System.out.println("파일 이름 : " + file.getName());
			System.out.println("파일 크기 : " + file.length() + "byte");
			
			System.out.println("디렉토리인지 여부 : " + file.isDirectory());
			System.out.println("파일인지 여부 : " + file.isFile());
			
			System.out.println("읽기 가능 여부 : " + file.canRead());
			System.out.println("실행 가능 여부 : " + file.canExecute());
			System.out.println("쓰기 가능 여부 : " + file.canWrite()); // 읽기 전용
			System.out.println("숨김 파일 여부 : " + file.isHidden());
			
			System.out.println("마지막 수정일 : " + file.lastModified());
			Date date = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss EEEE");
//			System.out.println(sdf.format(date));
//			System.out.println(date);
			System.out.println(file.lastModified());
			
			
			
		}else {
			System.out.println("파일이 없음");
		}//end else
		
		
		
		
		
	}//UseFile

	public static void main(String[] args) {
		new UseFile();
	}//main

}//class
