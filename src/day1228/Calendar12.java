package day1228;

import java.util.Calendar;

/**
 * 12�� Ķ����
 * 
 * @author user
 *
 */
public class Calendar12 {

	public void dayWeek() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, 1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String[] weekTitle = { "", "��", "��", "ȭ", "��", "��", "��", "��" };
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
		int lastDay = cal.getActualMaximum(Calendar.DATE);// �� ���� ������ ��
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("\t\t" + month + "�� �޷�");
		dayWeek();
		System.out.print("\t\t\t\t");
		int week = 0;//������ �����ٰ� �ϰ� �Ʒ��� ���� �ٲٸ� �޸� ���� x
		int day = 0;
		for (int i = 1; i < lastDay+1; i++) {
			week = cal.get(Calendar.DAY_OF_WEEK);
			day = cal.get(Calendar.DAY_OF_MONTH);
			//if������ switch������ �� �˾ƾ� �Ѵ�. if�� ���� switch�� ������ ������ ���
			if (week == 7) {// ������̸� ��� �� �� ����
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
