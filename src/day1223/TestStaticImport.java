package day1223;

import static java.lang.Integer.valueOf;
import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Short.MAX_VALUE//; ���� �̸��� ���� �ʴ´�.
//static import�� ���� �̸��� ����� ����� �� ����.


public class TestStaticImport {

	public static void main(String[] args) {
		String year = "2022";
		String month = "12";
		
		int intYear=valueOf(year); //Integer.valueOf()
		int intMonth=valueOf(month);
		System.out.println(intYear+"/"+intMonth);
		System.out.println("int�� �ְ� : " + MAX_VALUE);//Integer.MAX_VALUE
		
	}//main

}//class
