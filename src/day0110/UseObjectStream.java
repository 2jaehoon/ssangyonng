package day0110;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 객체를 파일로 쓰고, 파일에 있는 객체를 읽어 들이기
 * 
 * @author user
 *
 */
public class UseObjectStream {

	public void writeObject() throws IOException {
		// 스트림에 쓸 객체 생성
		DataVO dVO = new DataVO("김경태", 184.5, 72.4);
		// 1. 스트림 생성
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("e:/dev/temp/obj.txt"));
			// 2. 객체 쓰기
			oos.writeObject(dVO);    //직렬화가 되지 않은 객체가 들어가면 에러발생!
			System.out.println(dVO + "객체 쓰기 완료");
			
		} finally {
			// 3. 연결 끊기
			if (oos != null) {
				oos.close();
			}
		}
	}// writeObject

	public void readObject() throws IOException, ClassNotFoundException{
		//1. 스트림 생성
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("e:/dev/temp/obj.txt"));
		//2. 객체 읽기
			DataVO dVO = (DataVO)ois.readObject(); //부모는 자식을 모르기 떄문에 직접 할당 안되고 그래서 캐스팅을 해서 할당한다.
			System.out.println("읽어들인 객체 : " + dVO);
		}finally {
		//3. 연결 끊기
			if(ois!=null) {
				ois.close();
			}//end if
		}//end finally
	}// readObject;

	public static void main(String[] args) {
		UseObjectStream uos = new UseObjectStream();
//		try {
//			uos.writeObject();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			uos.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}// main

}// class
