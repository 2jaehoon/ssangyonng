package day1215;

/**
 * this의 method형식 사용 :
 * 객체화 없이 클래스의 다른 생성자(Constructor)를 호출한다.
 * @author user
 *
 */
public class TestThisConstructor {
	
	
	public TestThisConstructor()
	{
		//this(12);
		System.out.println("기본생성자");
	}// TestThisConstructor
	
	
	public TestThisConstructor(int i)
	{
		this(); // 기본 생성자 생성자의 첫번째 줄에서만 시용할 수 있다.
		System.out.println("인수가 있는 생성자");
	}// TestThisConstructor
	
	
	
	
	public static void main(String[] args) {
		//객체화 : 
		//1. 클래스명 객체명(변수명) = new 생성자(); // 객체명으로 변수나 method를 호출할 때
		//2. new 생성자(); // 객체명으로 변수나 method를 호출할 필요가 없을 때
		new TestThisConstructor(20);
		
		
	}//main

}//class
