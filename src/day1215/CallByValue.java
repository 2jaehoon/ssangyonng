package day1215;


/**
 * method의 parameter가 기본형 데이터 형인 경우 입력되는 값은 복사되어 전달 된다.<br>
 * (method 안에서 값을 변경하더라도 복사된 값을 변경하기 때문에
 * 원본 변수에 영향을 주지 않는다.)
 * @author user
 *
 */
public class CallByValue {
	
	public void swap(int i, int j) { //이름만 같지 아예 다른 변수
	int temp = i;
	i = j;
	j = temp;
	System.out.println("swap method i : " + i +",j = "+ j); //i = 15, j = 12;
	}//swap 

	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		int i = 12;
		int j = 15;
		System.out.println("swap 전 i : " + i + ", j = "+ j); // i = 12, j =15
		cbv.swap(i, j); //i변수와 j변수가 복사됨
		System.out.println("swap 후 i : " + i + ", j = "+ j); // i = 12, j =15
	}//main

}//class
