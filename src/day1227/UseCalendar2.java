package day1227;

import java.util.Calendar;

/**
 * Calendar�� ����� �ٸ� ��¥ ����.
 * @author user
 *
 */
public class UseCalendar2 {
	
	public UseCalendar2() {
		//1. ����
		Calendar cal = Calendar.getInstance();		
		
		//2. ����
		//��
		cal.set(Calendar.YEAR, 2023);
		//�� : 0������ ����
		cal.set(Calendar.MONTH, 1);
		//�� : ������ ���� �������� �ʴ� ���� ���� �ڵ����� ������ 1�Ϸ� �����ȴ�.
		cal.set(Calendar.DAY_OF_MONTH, 29);
		System.out.println(cal.get(Calendar.YEAR) +"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH) +
				"-" + 
				("��,��,ȭ,��,��,��,��".split(",")[cal.get(Calendar.DAY_OF_WEEK)-1]    ));
		
		
		
		
		Calendar cal2 = Calendar.getInstance();		
		//��, ��, ���� �� ���� ����
		cal2.set(2023, 4,15);
		System.out.println(cal2.get(Calendar.YEAR) +"-"+(cal2.get(Calendar.MONTH)+1)+"-"+cal2.get(Calendar.DAY_OF_MONTH) +
				"-" + 
				("��,��,ȭ,��,��,��,��".split(",")[cal2.get(Calendar.DAY_OF_WEEK)-1]    ));
	}//UseCalendar2

	public static void main(String[] args) {
		new UseCalendar2();
	}//main

}//class
