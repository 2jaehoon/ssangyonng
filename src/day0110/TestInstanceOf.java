package day0110;

public class TestInstanceOf {

	public static void main(String[] args) {
		
		TestInstanceOf ti = new TestInstanceOf();
		//객체가 이 클래스로부터 만들어졌는가? 비교
		//instanceof 연산자는 객체의 생성관계를 판단하기 위한 연산자
		// 사용법
		//객체명 instanceof 클래스명 또는 인터페이스명
		if(ti instanceof TestInstanceOf) {
			System.out.println(ti + "는 TestInstanceOf 클래스로부터 생성");
		}else {
			System.out.println(ti + "다른 클래스로부터 생성");
		}

	}//main

}//class
