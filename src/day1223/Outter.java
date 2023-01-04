package day1223;

/**
 * 안쪽 클래스를 인스턴스 변수처럼 사용할 때
 * @author user
 *
 */
public class Outter {
	
	int i;
	
	public Outter() {
		System.out.println("바깥클래스의 생성자");
	}//Outter

	public void outMethod() {
		System.out.println("바깥 클래스의 메소드 i " + i);
	//바깥클래스에서는 안쪽 클래스의 자원을 직접 사용할 수 없다.
//		inMethod();
	}//outMethod
	
	
	/////////////////////////////////////////////Inner class 시작////////////////////////////////////////////////////////////
	public class Inner{
		int j;
		
		public Inner() {
			System.out.println("안쪽 클래스의 생성자");
		}//Inner
		
		public void inMethod() {
			System.out.println("안쪽 클래스의 메소드");
			//안쪽클래스에서는 바깥 클래스의 자원을 마음대로 사용할 수 있다.
			i=2022;
			System.out.println("바깥클래스의 변수 : " + i);
			outMethod();
		}//inMethod
		
	}//class
	
	/////////////////////////////////////////////Inner class 끝////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		//1. 바깥클래스의 객체화
		Outter out = new Outter();
//		out.inMethod();//호출불가
		out.outMethod();
		
	System.out.println("---------------------------------------------------------");
		//2. 안쪽클래스의 객체화
		//바깥클래스명.안쪽클래스명 객체명 = 바깥클래스객체명.new 안쪽클래스의 생성자();
		Outter.Inner in = out.new Inner();
		in.inMethod();
		
		
		
		
		
		
		
		
	}//main

}//class
