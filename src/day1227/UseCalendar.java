package day1227;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author user
 *
 */
public class UseCalendar {
	
	public UseCalendar() {
		//1. 객체 생성)
		//자식클래스
		Calendar cal = new GregorianCalendar();
		
		//instance를 얻는 method 사용 (권장)
		Calendar cal1 = Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal1);
		
		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH)+1;//0월부터 11월까지 12달을 표현
		int day = cal1.get(Calendar.DAY_OF_MONTH);
		int amPm = cal1.get(Calendar.AM_PM);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int lastDate=cal.getActualMaximum(Calendar.DATE); //달의 마지막 날
		
		String am = "";
//		switch(amPm) {
//		//API에서 Field number가 아닌 Constant는 비교의 용도
//		case Calendar.AM : am="오전"; break;
//		case Calendar.PM : am="오후"; break;
//		}//end switch
		String[] amTitle= {"오전","오후"};
		String[] weekTitle = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
	
		System.out.println("Calendar : " + year + "-" + month +"-" + day + " " + am + " / " + amTitle[amPm] + " " + weekTitle[dayOfWeek]
				+ "/ 이번 년도 몇 번째 날 : " + dayOfYear + " " + hour + " ( " +  hourOfDay + " ) " + minute + "분 " + second + "초 ");
		System.out.println("달의 마지막 날 : " + lastDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a E");
		System.out.println("SimpleDateFormat : " + sdf.format(new Date()));
		
		
		
		
	}//UseCalendar

	public static void main(String[] args) {
		new UseCalendar();
		

	}//main

}//class
