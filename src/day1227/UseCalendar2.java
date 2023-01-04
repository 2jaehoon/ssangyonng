package day1227;

import java.util.Calendar;

/**
 * Calendar를 사용한 다른 날짜 설정.
 * @author user
 *
 */
public class UseCalendar2 {
	
	public UseCalendar2() {
		//1. 생성
		Calendar cal = Calendar.getInstance();		
		
		//2. 변경
		//년
		cal.set(Calendar.YEAR, 2023);
		//월 : 0월부터 설정
		cal.set(Calendar.MONTH, 1);
		//일 : 설정된 월에 존재하지 않는 일이 들어가면 자동으로 다음달 1일로 설정된다.
		cal.set(Calendar.DAY_OF_MONTH, 29);
		System.out.println(cal.get(Calendar.YEAR) +"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH) +
				"-" + 
				("일,월,화,수,목,금,토".split(",")[cal.get(Calendar.DAY_OF_WEEK)-1]    ));
		
		
		
		
		Calendar cal2 = Calendar.getInstance();		
		//년, 월, 일을 한 번에 변경
		cal2.set(2023, 4,15);
		System.out.println(cal2.get(Calendar.YEAR) +"-"+(cal2.get(Calendar.MONTH)+1)+"-"+cal2.get(Calendar.DAY_OF_MONTH) +
				"-" + 
				("일,월,화,수,목,금,토".split(",")[cal2.get(Calendar.DAY_OF_WEEK)-1]    ));
	}//UseCalendar2

	public static void main(String[] args) {
		new UseCalendar2();
	}//main

}//class
