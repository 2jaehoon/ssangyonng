package day0106;

import java.io.IOException;

/**
 * @author user
 *
 */
//		char c = '\n';
//		char c1 = '\r';
//		System.out.println((int)c); //10
//		System.out.println((int)c1);  //13
public class TestSystemInput {
	
	public TestSystemInput() {
		System.out.println("아무 키나 입력 받아서 엔터");
		
		try {
//			int inputKey = System.in.read(); //엔터가 눌리기 전에는 실행되지 않는다
//			
//			System.out.println("입력 코드 값 : " + inputKey + "문자 : " + (char)inputKey);
		int inputKey=0;
//		while((inputKey=System.in.read())!=13) {//조건 거짓일 경우 조건문 나가짐
//			
//			System.out.print((char)inputKey);
//		}
		while((inputKey=System.in.read())!=13) {//조건 거짓일 경우 조건문 나가짐
			
			System.out.print((char)inputKey);
		}
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end catch
		
	}

	public static void main(String[] args) {
		
		new TestSystemInput();

	}//main

}//class
