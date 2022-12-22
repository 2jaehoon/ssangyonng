package day1222;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * annotation 사용
 * @author user
 *
 */
public class TestAnnotation {
	
	@Deprecated
	public void myMethod(){
		System.out.println("처음엔 정상동작 했으나 문제가 발생.");
	}
	
	@Override
	public String toString() { //1. 개발할 때에는 알 수 없고 => 개발 단계에서부터 체크
		return "오버라이딩";
	}
	
	@SuppressWarnings({"unused","rawtypes"})
	public void test() {
		int i;
		int j;
		
		//@SuppressWarnings("rawtypes")
		List list = new ArrayList();
	}
	
	
	
	public static void main(String[] args) {
		TestAnnotation ta = new TestAnnotation();
		ta.myMethod();
		System.out.println(ta.toString());
		
		Date date = new Date();
		System.out.println(date.toString()); //2. 실행을 해봐야 Override를 제대로 했는 지 알 수 있다.
		System.out.println(date.getYear());
		
	}//main

}//class
