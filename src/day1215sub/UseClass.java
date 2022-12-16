package day1215sub;

import day1215.TestModifier;

/**
 * 접근 지정자에 따른 클래스 접근 연습.
 * @author user
 *
 */
public class UseClass {

	public static void main(String[] args) {
		//TestModifer는 접근 지정자가 public이므로 사용할 수 있음.
		TestModifier tm = new TestModifier();                     //TestModifier 는 지정자테스트
		//TestModifer2는 접근 지정자가 package이므로 사용할 수 없음.
//		TestModifier2 tm2 = new TestModifier2();
		
		

	}

}
