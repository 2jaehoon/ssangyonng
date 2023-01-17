package day0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드 버퍼에 돌어온 값을 엔터키 전까지 모두 읽어 들이기
 * @author user
 *
 */
public class UseBufferedReader {
	
	public UseBufferedReader() throws IOException{ 
		//메소드 안에서 발생되는 중복된 예외를 중복처리하지 않아도 된다.
		
		
		System.out.println("메시지를 입력한 후 엔터");
//		BufferedReader br = new UseBufferedReader(System.in);//인풋 부모가ㅓ 없다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str = "";
			do {
				System.out.println("메시지를 입력한 후 엔터, 종료하실 꺼면 y |  Y를 입력");
				str = br.readLine();
			System.out.println(str);
			}while(!str.toUpperCase().equals("Y"));
		}finally {
				if(br!=null) {
				br.close();
				}
		}//end finally
		
		
	}//UseBufferedReader
	

	public static void main(String[] args) {
		
		try {
			new UseBufferedReader();
			//메서드 안에서 발생된 예외를 한 번에 모아서 처리할 수 있다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}//main

}//class
