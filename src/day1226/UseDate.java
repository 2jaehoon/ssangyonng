package day1226;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Date ���
 * 
 * @author user
 *
 */
public class UseDate {
	public UseDate() {
		System.out.println("�ڹٿ��� ���� ��¥ : " + System.currentTimeMillis());

		Date date = new Date();
		System.out.println(date);

//		System.out.println(date.getYear()); // ��κ��� �޼ҵ尡 ����õ�̴�.

		// ����ڰ� ���ϴ� ��¥ ������ ����� ���� ����ϴ� Ŭ����.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE (a h)kk:mm:ss");
		System.out.println(sdf.format(date));

		// Locale Ŭ������ ���. => �ٸ� ������ ��¥ ������ ����� �� �ִ�,
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH:mm:ss", Locale.CHINA);
		System.out.println(sdf2.format(date));

	}// UseDate

	public static void main(String[] args) {
		new UseDate();
	}// main

}// class
