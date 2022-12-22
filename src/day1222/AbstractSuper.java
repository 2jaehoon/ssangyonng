package day1222;

/**
 * 추상 클래스 : 
 * 1. 직접 객체화 될 수 없다. 자식클래스가 객체화 될 때는 객체화가 된다.
 * 2. 구현의 강제성을 가지는 추상메소드를 가진다.
 * 
 * @author user
 *
 */
public abstract class AbstractSuper {
	int i;
	
	public AbstractSuper() {
		System.out.println("추상 클래스의 생성자");
	}//AbstractSuper
	
	

	public void methodA() {
		System.out.println("일반 메소드");
	}
	
	//abstract method
	public abstract void methodB();
	public abstract String methodC(int i);
	
	
	
	public static void main(String[] args) {
		//추상클래스는 직접 객체화 될 수 없다.
		//자식클래스를 통해서만 가능하다.
//		AbstractSuper as = new AbstractSuper();
	}//main

}//class
