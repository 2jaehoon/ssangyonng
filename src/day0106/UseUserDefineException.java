package day0106;

import java.util.Random;

public class UseUserDefineException {
	
	public String kyeongtae() throws TobaccoException {
		
		String result = "";
		
		String[] stuArr = {"�ʵ�", "�ߵ�", "���"};
		
		int random = new Random().nextInt(stuArr.length);
		
		if(random == 0) { //�ʵ��̸� ���ܸ� �߻�
			throw new TobaccoException(stuArr[0]+"�� ���� plz");
			
		}
		result = stuArr[random] + "�Բ��� �� �� �� ô ��������. (,,) (..)";

		return result;
	}

	public static void main(String[] args) {
		UseUserDefineException uude = new UseUserDefineException();
		try {
			String msg = uude.kyeongtae();
			System.out.println(msg);
		} catch (TobaccoException te) {
			System.out.println(te.getMessage());
			te.printStackTrace();
		}//end catch
	}//main

}
