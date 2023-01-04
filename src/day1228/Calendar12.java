package day1228;

import java.util.Calendar;

/**
 * 12월 캘린더
 * 
 * @author user
 *
 */
public class Calendar12 {

	public void dayWeek() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, 1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String[] weekTitle = { "", "일", "월", "화", "수", "목", "금", "토" };
		for (int i = 0; i < 7; i++) {
			System.out.print(weekTitle[dayOfWeek] + "\t");
			dayOfWeek++;
		}
		System.out.println();
	}

	public Calendar12() {
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.DAY_OF_MONTH, 1);
//		cal.set(Calendar.MONTH, 2);
		int lastDay = cal.getActualMaximum(Calendar.DATE);// 그 달의 마지막 날
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("\t\t" + month + "월 달력");
		dayWeek();
		System.out.print("\t\t\t\t");
		int week = 0;//선언은 위에다가 하고 아래서 값만 바꾸면 메모리 낭비가 x
		int day = 0;
		for (int i = 1; i < lastDay+1; i++) {
			week = cal.get(Calendar.DAY_OF_WEEK);
			day = cal.get(Calendar.DAY_OF_MONTH);
			//if쓸때나 switch구분할 줄 알아야 한다. if는 조건 switch는 정해진 정수에 사용
			if (week == 7) {// 토요일이면 출력 후 줄 내림
				System.out.print(day + " \n");
			} else {
				System.out.print(day + "\t");
			}
			cal.set(Calendar.DAY_OF_MONTH, i + 1);
		}
	}

	public static void main(String[] args) {
		new Calendar12();
	}// main

}// class
