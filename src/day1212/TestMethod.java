package day1212;

/**
 * instance method와 static method
 * @author user
 *
 */
public class TestMethod {
	public void instanceMethod() {
		System.out.println("객체가 가진 변수를 사용하여 업무를 처리하는 method => 객체화 선행");
	}//instanceMethod
	public static void staticMethod() {
		System.out.println("입력된 값으로만 업무처리하는 method => 객체화할 필요 없음");
	}//staticMethod

	public static void main(String[] args) {
		//static 영역인 main method에서 intstanceMethod는 직접 호출 불가능.
		//instanceMethod();
		System.out.println("----------------------instance method---------------------------------");
		//1. 객체화
		TestMethod tm = new TestMethod();
		//2. 호출
		tm.instanceMethod();
		
		
		System.out.println("----------------------static method---------------------------------");
		TestMethod.staticMethod();
//		tm.staticMethod() //static method는 특정객체에 속한 instance변수 값을 사용하는 method가
		//아니므로 객체명으로 호출하지 않는다.

	}//main

}//class
