package day1228;

import java.util.Calendar;

public class Work1227 {

	public String nowDate() {
		
		StringBuilder sbDate=new StringBuilder();
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int end = cal.getActualMaximum(Calendar.DATE);
		
		cal.set(Calendar.DAY_OF_MONTH, 1); //1일로 설정
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일
		
		sbDate.append("---------------------" + year + "년" + month + "월" + "---------------------\n");
		sbDate.append("일\t월\t화\t수\t목\t금\t토\n");

		//1일을 출력하기전에 공백을 출력
		for (int blank = 1; blank < dayOfWeek; blank++) {
			sbDate.append("\t");
		}//end for
		
		for (int day = 1; day <= end; day++) {
			sbDate.append(day).append("\t");
			cal.set(Calendar.DAY_OF_MONTH , day);//증가하는 날짜로 요일을 설정한다.
			
			switch( cal.get(Calendar.DAY_OF_WEEK) ) {//설정된 날짜의 요일을 얻어와서
			case Calendar.SATURDAY: //토요일이니?
				sbDate.append("\n");
			}//end switch
		}//end for
		
		return sbDate.toString();
	}// work

}// class
