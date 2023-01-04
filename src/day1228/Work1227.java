package day1228;

import java.util.Calendar;

public class Work1227 {

	public String nowDate() {
		
		StringBuilder sbDate=new StringBuilder();
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int end = cal.getActualMaximum(Calendar.DATE);
		
		cal.set(Calendar.DAY_OF_MONTH, 1); //1�Ϸ� ����
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1���� ����
		
		sbDate.append("---------------------" + year + "��" + month + "��" + "---------------------\n");
		sbDate.append("��\t��\tȭ\t��\t��\t��\t��\n");

		//1���� ����ϱ����� ������ ���
		for (int blank = 1; blank < dayOfWeek; blank++) {
			sbDate.append("\t");
		}//end for
		
		for (int day = 1; day <= end; day++) {
			sbDate.append(day).append("\t");
			cal.set(Calendar.DAY_OF_MONTH , day);//�����ϴ� ��¥�� ������ �����Ѵ�.
			
			switch( cal.get(Calendar.DAY_OF_WEEK) ) {//������ ��¥�� ������ ���ͼ�
			case Calendar.SATURDAY: //������̴�?
				sbDate.append("\n");
			}//end switch
		}//end for
		
		return sbDate.toString();
	}// work

}// class
