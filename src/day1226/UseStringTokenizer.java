package day1226;

import java.util.StringTokenizer;

/**
 * 문자열을 짧은 하나의 마디로 구분(토큰)할 때 사용하는 클래스
 * 
 * @author user
 *
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
//		String msg = "자바 오라클 JDBC HTML CSS JavaScript JSP";
		String csvData = "자바~오라클/JDBC.HTML,CSS.JavaScript,JSP";
		// CSV (Comma Separated Value) Data : ,로 구분된 값
		// , 또는 특정 문자로 구분된 문자열 데이터를 CSV 데이터라고 한다.
		// 1. 생성)
		// 공백으로 토큰을 생성하는 생성자
//		StringTokenizer stk = new StringTokenizer(msg);
		// 특정 문자열로 토큰을 생성하는 생성자 (구분자는 OR 기능이 있다.)
//		StringTokenizer stk = new StringTokenizer(csvData,",.~/");
		// 특정 문자열로 토큰을 생성하는 생성자 (구분자는 OR 기능이 있다.) (구분자를 토큰으로 만들 때)
		StringTokenizer stk = new StringTokenizer(csvData, ",.~/", true);

		// 입력된 값의 제어권을 가지고 입력된 값에 포인터를 생성한다.
		System.out.println(stk);// StringTokenizer는 toString이 Override가 되어 있지 않기 때문에 주소가 나옴
		// 2. 사용)
		System.out.println("토큰의 수 : " + stk.countTokens());

		String token = "";
		while (stk.hasMoreTokens()) {// 토큰이 있는 지 없는 지 모르지만 있다면 끝까지 자르자
			token = stk.nextToken();
			System.out.println(token);
		} // end while
		System.out.println("토큰의 수 : " + stk.countTokens());

	}// UseStringTokenizer

	public static void main(String[] args) {
		new UseStringTokenizer();
	}// main

}// class
