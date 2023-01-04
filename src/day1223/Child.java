package day1223;

/**
 * 자식클래스에서 부모클래스를 확장 => 상속
 * 자식에는 부모의 정보가 존재 (자식으로 생성하여 부모에 저장할 수 있다.)
 * @author user
 *
 */
public class Child extends Parent{
	
@Override
	public void test() {
		System.out.println("부모제공하는 기능");
	}

//final인 메소드는 오버라이드가 되지 않는다.
//public  final void testMethod() {
//	System.out.println("부모 그대로 사용해야하는 기능");
//}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.test(); //오버라이드된 메소드가 호출
		child.testMethod();//부모클래스의 메소드가 호출
	}

}
