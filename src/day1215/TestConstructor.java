package day1215;

/**
 * 생성자 연습
 * @author user
 *
 */
public class TestConstructor {
	
	/**
	 * 
	 */
	public TestConstructor() {
		System.out.println("기본 생성자");
		//test();  //method는 직접 호출 가능
		//new TestConstructor(12);  //생성자는 new로만 부를 수 있다. new 없으면 호출 x
	}//TestConstructor
	
	public TestConstructor(int i){
		System.out.println("인자 있는 생성자 " + i);
	}//TestConstructor
	
	public void test() {
		System.out.println("인스턴스 메소드");
	}//test
	
	
	public static void main(String[] args) {
		
		//객체화 : 클래스명 객체명 = new 클래스명==생성자();
		TestConstructor tc = new TestConstructor();
		//생성자가 호출되면 객체가 생성되었음.
		
		
		
		
		
	}//main

}//class
