package day0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ű���� ���ۿ� ����� ���� ����Ű ������ ��� �о� ���̱�
 * @author user
 *
 */
public class UseBufferedReader {
	
	public UseBufferedReader() throws IOException{ 
		//�޼ҵ� �ȿ��� �߻��Ǵ� �ߺ��� ���ܸ� �ߺ�ó������ �ʾƵ� �ȴ�.
		
		
		System.out.println("�޽����� �Է��� �� ����");
//		BufferedReader br = new UseBufferedReader(System.in);//��ǲ �θ𰡤� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str = "";
			do {
				System.out.println("�޽����� �Է��� �� ����, �����Ͻ� ���� y |  Y�� �Է�");
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
			//�޼��� �ȿ��� �߻��� ���ܸ� �� ���� ��Ƽ� ó���� �� �ִ�.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}//main

}//class
