package day1223;

import static java.lang.Integer.valueOf;
import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Short.MAX_VALUE//; 같은 이름을 쓰지 않는다.
//static import는 같은 이름의 대상을 사용할 수 없다.


public class TestStaticImport {

	public static void main(String[] args) {
		String year = "2022";
		String month = "12";
		
		int intYear=valueOf(year); //Integer.valueOf()
		int intMonth=valueOf(month);
		System.out.println(intYear+"/"+intMonth);
		System.out.println("int의 최고값 : " + MAX_VALUE);//Integer.MAX_VALUE
		
	}//main

}//class
