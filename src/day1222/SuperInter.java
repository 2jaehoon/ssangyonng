package day1222;

/**
 * 구현 클래스가 반드시 구현해야할 일의 목록만 정의
 * @author user
 *
 */
public interface SuperInter {
//	int i; 변수를 작성할 수 없다.
	public static final int MAX = 10;
	
//	public SuperInter() { //생성자를 가질 수 없다 = > 객체화를 할 수 없다.
//	} 
//	public void test() {//일반 메소드를 가질 수 없다 => 일을 구현하여 제공할 수 없다.
//	}
	
	//abstract 사용
	public abstract void methodA();
	//abstract 사용x
	public void methodB();
	
	/**
	 * default method를 사용하면 jdk1.8부터 인터페이스에서도 구현된 기능을 제공할 수 있다.
	 * @return
	 */
	public default String msg() {
		String result = "오늘은 목요일 입니다.";
		return result;
	}//msg
	
	
	
	
	
}//interface
