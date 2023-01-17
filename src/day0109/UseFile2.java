package day0109;

import java.io.File;

public class UseFile2 {
	public UseFile2(){
		
	}
	
	public void makeDirectory() {
		File file = new File("E:\\dev\\temp\\leeJaeHoon");
		if(!file.exists()){
			System.out.println(file + " 디렉토리 생성 " + file.mkdirs());
		}//end if
		
	} // makeDirectory
	
	public void removeFile() {		
		File file = new File("E:/dev/temp/test.txt");
		if(file.exists()) {
			System.out.println(file + " 삭제 ? " + file.delete());
		}
		
	} // removeFile
	
	public void renameFile() {
		//원본 파일 생성
		 File file = new File("e:/dev/temp/test1.txt");
		//변경할 이름의 파일 생성
		 System.out.println(file + "을");
		 File file2 = new File("e:/dev/temp/test222.txt");
		 System.out.println(file2 + "로 변경 ? : " + file.renameTo(file2));
		
		//변경
	}

	public static void main(String[] args) {
		UseFile2 uf2 = new UseFile2();
		uf2.makeDirectory();
		System.out.println("===========================================");
		uf2.removeFile();
		System.out.println("===========================================");
		uf2.renameFile();

	}//main

}//class
