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
		//1. ��ü ����)
		//�ڽ�Ŭ����
		Calendar cal = new GregorianCalendar();
		
		//instance�� ��� method ��� (����)
		Calendar cal1 = Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal1);
		
		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH)+1;//0������ 11������ 12���� ǥ��
		int day = cal1.get(Calendar.DAY_OF_MONTH);
		int amPm = cal1.get(Calendar.AM_PM);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int lastDate=cal.getActualMaximum(Calendar.DATE); //���� ������ ��
		
		String am = "";
//		switch(amPm) {
//		//API���� Field number�� �ƴ� Constant�� ���� �뵵
//		case Calendar.AM : am="����"; break;
//		case Calendar.PM : am="����"; break;
//		}//end switch
		String[] amTitle= {"����","����"};
		String[] weekTitle = {"","�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
	
		System.out.println("Calendar : " + year + "-" + month +"-" + day + " " + am + " / " + amTitle[amPm] + " " + weekTitle[dayOfWeek]
				+ "/ �̹� �⵵ �� ��° �� : " + dayOfYear + " " + hour + " ( " +  hourOfDay + " ) " + minute + "�� " + second + "�� ");
		System.out.println("���� ������ �� : " + lastDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a E");
		System.out.println("SimpleDateFormat : " + sdf.format(new Date()));
		
		
		
		
	}//UseCalendar

	public static void main(String[] args) {
		new UseCalendar();
		

	}//main

}//class
