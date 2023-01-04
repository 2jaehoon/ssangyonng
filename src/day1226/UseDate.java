package day1226;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Date 사용
 * 
 * @author user
 *
 */
public class UseDate {
	public UseDate() {
		System.out.println("자바에서 얻어온 날짜 : " + System.currentTimeMillis());

		Date date = new Date();
		System.out.println(date);

//		System.out.println(date.getYear()); // 대부분의 메소드가 비추천이다.

		// 사용자가 원하는 날짜 형식을 만들기 위해 사용하는 클래스.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE (a h)kk:mm:ss");
		System.out.println(sdf.format(date));

		// Locale 클래스의 사용. => 다른 나라의 날짜 형식을 사용할 수 있다,
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH:mm:ss", Locale.CHINA);
		System.out.println(sdf2.format(date));

	}// UseDate

	public static void main(String[] args) {
		new UseDate();
	}// main

}// class
