package day1222;

/**
 * 추상 클래스의 자식 클래스
 * 1. 부모 클래스가 가진 추상메소드를 반드시 Override해야한다.
 *     일반 메소드는 필요에 따라 Override한다.
 * @author user
 *
 */
public class AbstractSub extends AbstractSuper {
	
	public AbstractSub() {
		System.out.println("AbstractSub의 생성자");
	}
	
	
	@Override
	public void methodB() {
		System.out.println("메소드b의 오버라이드");
	}
	
	
	
	@Override
	public String methodC(int i) {
		String result = "메소드c의 오버라이드";
		return result;
	}

	
	public void methodCall() {
		this.methodB();
		//추상 메소드는 호출x
//		super.methodB(); //error
	}
	

	public static void main(String[] args) {
		//추상클래스는 직접 객체가 되지 않는다. 하지만 자식은 생성가능하다.
		AbstractSub as = new AbstractSub();//자식클래스를 객체화
		as.methodCall();

	}//main

}//class
