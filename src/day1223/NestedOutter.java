package day1223;

/**
 * 중첩 클래스 : 안쪽 클래스를 static 변수처럼 사용할 때
 * @author user
 *
 */
public class NestedOutter {
	int i;
	static int j;
	
	public NestedOutter() {
		System.out.println("바깥클래스의 생성자");
	}//NestedOutter
	
	public void outInstanceMethod() {
		System.out.println("바깥 클래스의 인스턴스 method");
	}//outInstanceMethod
	
	public static void outStaticMethod() {
		System.out.println("바깥 클래스의 static method");
	}//outInstanceMethod
	
	//////////////////////////////Nested class 시작////////////////////////////////
	static class NestedInner{
		static int ni2;
		
		public static void inMethod() {
			System.out.println("NestedInner의 method");
			//스태틱은 인스턴스 영역보다 먼저 메모리에 진입을 한다.
			//바깥 클래스에 instance 변수나 method는 사용할 수 없다.
			outStaticMethod();
		}//inMethod
	}//NestedInner
	//////////////////////////////Nested class 끝////////////////////////////////
	
	public static void main(String[] args) {
		//바깥클래스에서 static 방식으로 안쪽클래스의 자원 사용
		NestedInner.inMethod();
	}//main

}//class
