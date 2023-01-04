package day1226;

import java.text.DecimalFormat;

/**
 * @author user
 *
 */
public class UseDecimalFormat {
	public UseDecimalFormat() {
		int i = 10_000_000;//구분 문자 사용
		System.out.println(i);//구분 문자는 출력되지 않는다.
		
		//1. 객체 생성
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
		//데이터가 자릿수를 초과하더라도 반복된 위치에 구분자를 넣어준다.
		DecimalFormat df4 = new DecimalFormat("#,###");
		System.out.println(df4.format(i));
		
	}//UseDecimalFormat

	public static void main(String[] args) {
		new UseDecimalFormat();

	}//main

}//class
