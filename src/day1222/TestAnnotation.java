package day1222;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * annotation ���
 * @author user
 *
 */
public class TestAnnotation {
	
	@Deprecated
	public void myMethod(){
		System.out.println("ó���� ������ ������ ������ �߻�.");
	}
	
	@Override
	public String toString() { //1. ������ ������ �� �� ���� => ���� �ܰ迡������ üũ
		return "�������̵�";
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
		System.out.println(date.toString()); //2. ������ �غ��� Override�� ����� �ߴ� �� �� �� �ִ�.
		System.out.println(date.getYear());
		
	}//main

}//class
