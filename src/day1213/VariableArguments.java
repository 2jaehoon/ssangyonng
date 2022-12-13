package day1213;

import java.util.Arrays;

/**
 * variable arguments<br>
 * 매개변수 (parameter)는 하나이나, 입력 값(arguments)의 개수는 동적으로 입력할 수 있는
 * method
 * @author user
 *
 */
public class VariableArguments {
	
	/**
	 * int 형으로 입력 값을 몇 개든 넣을 수 있는 method
	 * @param param
	 */
	public void vaMethod(int ... param) {
		for(int i = 0; i < param.length; i++) {
		System.out.println(param[i] + "\t");
		}
		System.out.println();
	}//vaMethod
	
	//variable arguments는 여러개의 매개변수와 함께 정의할 때에는 가장 마지막에만 정의할 수 있다.
//	public void vaMethod2(int i, int ... va,double d) {
//		
//	}
	public void vaMethod2(int i, double d, int ... va) {
		System.out.println("parameter i " + i);
		System.out.println("parameter d " + d);
		System.out.println(Arrays.toString(va));
	
	}

	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		//호출 : 매개변수는 하나지만 입력값을 여러개 너흘 수 있따.
		System.out.println("입력값 없음");
		va.vaMethod();
		System.out.println("입력값 하나");
		va.vaMethod(0);
		System.out.println("입력값 여러개");
		va.vaMethod(0,1,2,3,4,100,300);
		//데이터형이 다르면 error
		//va.vaMethod(0.1);
		
		//여러개의 매개변수와 함께 사용된 v.a 호출
		//1. v.a생략
		va.vaMethod2(2022,12.13);
		//2. v.a 값 하나 입력
		va.vaMethod2(12, 12.56, 1);
		//3. v.a 값 여러 개 입력
		va.vaMethod2(12, 12.56, 1,12,13,14,15);
		

	

	}//main

}//class
