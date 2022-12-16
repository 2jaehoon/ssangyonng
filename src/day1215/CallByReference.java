package day1215;

/**
 * 주소는 하나.
 * method 매개변수가 참조형 데이터형을 받으면 주소가 그대로 전달된다.
 * @author user
 *
 */
public class CallByReference {
	
	private int i;
	private int j;
	
	public void swap(CallByReference cbr){
		int temp = 0;
		temp = cbr.j;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.println("swap method i : " + cbr.i +",j = "+ cbr.j);//15,12
		}

	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i = 12;
		cbr.j = 15;
		System.out.println("swap 전 i : " + cbr.i + ", j = "+ cbr.j);//12,15 
		cbr.swap(cbr); //주소가 전달
		System.out.println("swap 후 i : " + cbr.i + ", j = "+ cbr.j); //15,12
		
	}//main


}//class
