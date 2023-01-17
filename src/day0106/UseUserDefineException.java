package day0106;

import java.util.Random;

public class UseUserDefineException {
	
	public String kyeongtae() throws TobaccoException {
		
		String result = "";
		
		String[] stuArr = {"초딩", "중딩", "고딩"};
		
		int random = new Random().nextInt(stuArr.length);
		
		if(random == 0) { //초딩이면 예외를 발생
			throw new TobaccoException(stuArr[0]+"금 연좀 plz");
			
		}
		result = stuArr[random] + "님께서 흡연 중 모른 척 지나간다. (,,) (..)";

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
