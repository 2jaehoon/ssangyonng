package day1223;

import java.util.Calendar; //특정 클래스 하나만 import 받을 때
import java.util.Date;
//import java.util.*;//패키지의 모든 클래스를 import 받을 때
//패키지는 다르나 이름이 같다면 하나만 import 처리할 수 있다.

import day1222.HongGilDong;

/**
 * @author user
 *
 */
public class TestImport {

	public static void main(String[] args) {
		//import를 사용하지 않으면, 클래스를 사용할 때마다 full path를 기술하여 사용
		//패키지명.클래스명
//		java.util.Date d = new java.util.Date();
//		java.awt.Frame f = new java.awt.Frame();
		Date d = new Date();//java.util.Date를 사용하고 싶고
		java.sql.Date d2 = null;//java.sql.Date를 사용하고 싶다. 
		//둘 중 적은 수로 선언하고 사용하는 클래스를 full path로 사용한다.
		//패키지는 다르나 이름이 같다면 하나만 import 처리할 수 있다.
		
		HongGilDong hgd = new HongGilDong();
		
		Calendar cal = Calendar.getInstance();
	}//main

}//class
