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
		System.out.println("�ƹ� Ű�� �Է� �޾Ƽ� ����");
		
		try {
//			int inputKey = System.in.read(); //���Ͱ� ������ ������ ������� �ʴ´�
//			
//			System.out.println("�Է� �ڵ� �� : " + inputKey + "���� : " + (char)inputKey);
		int inputKey=0;
//		while((inputKey=System.in.read())!=13) {//���� ������ ��� ���ǹ� ������
//			
//			System.out.print((char)inputKey);
//		}
		while((inputKey=System.in.read())!=13) {//���� ������ ��� ���ǹ� ������
			
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
