package day1226;

import java.text.DecimalFormat;

/**
 * @author user
 *
 */
public class UseDecimalFormat {
	public UseDecimalFormat() {
		int i = 10_000_000;//���� ���� ���
		System.out.println(i);//���� ���ڴ� ��µ��� �ʴ´�.
		
		//1. ��ü ����
		i=2023;
		DecimalFormat df = new DecimalFormat("#,###,###");
		System.out.println(df.format(i));
		DecimalFormat df2 = new DecimalFormat("0,000,000");
		System.out.println(df2.format(i));
		
		for(int j = 100; j<100001; j+=1000) {
			System.out.println(df.format(j));
		}
		double d = 1082.467;
		DecimalFormat df3 = new DecimalFormat("#,###.00");
		System.out.println(df3.format(d));
		
		i = Integer.MAX_VALUE;		
		//�����Ͱ� �ڸ����� �ʰ��ϴ��� �ݺ��� ��ġ�� �����ڸ� �־��ش�.
		DecimalFormat df4 = new DecimalFormat("#,###");
		System.out.println(df4.format(i));
		
	}//UseDecimalFormat

	public static void main(String[] args) {
		new UseDecimalFormat();

	}//main

}//class
