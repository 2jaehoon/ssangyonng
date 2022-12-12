package day1212;

/**
 * instance variable의 기본 값
 * (static variable의 동일한 값이 할당 됨.)
 * @author user
 *
 */
public class TestDefaultValue {
	//기본형 데이터형 (값)
	public int a;
	char b;
	double c;
	boolean d;
	//참조형 데이터형 (주소)
	TestDefaultValue tdv;
	String str;
	int [] arr;

	public static void main(String[] args) {
		//객체화를 해야 위의 데이터(instance variable)를 사용 가능
		//문법) 클래스명 객체명 = new 클래스명();
		
		TestDefaultValue defaultValue = new TestDefaultValue();
		//인스턴스 변수가 heap에 올라가고, 정해진 기본 값으로 값이 설정된다.
		System.out.println("-----------기본형------------");
		System.out.println("정수형 : " + defaultValue.a); //0
		System.out.println("문자형 : " + defaultValue.b); //\u0000
		System.out.println("실수형 : " + defaultValue.c); //0.0
		System.out.println("불린형 : " + defaultValue.d);//false
		System.out.println("-----------참조형------------");
		//null - 참조형 데이터형이 heap의 주소를 가지지 않음(객체가 생성되지 않았음)
		System.out.println("class : " + defaultValue.tdv); //null
		System.out.println("String : " + defaultValue.str); //null
		System.out.println("array : " + defaultValue.arr); //null

		
		
		
		
	}//main

}//class
