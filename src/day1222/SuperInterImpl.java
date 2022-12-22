package day1222;

/**
 * 인터페이스를 구현하는 클래스
 * 인터페이스의 abstract 메소드는 반드시 구현해야 한다.
 * @author user
 *
 */
public class SuperInterImpl implements SuperInter{
	
	

	public static void main(String[] args) {
		//interface는 생성자가 존재하지 않으므로 객체화 할 수 없다.
//		SuperInter si = new SuperInter();
	
		//interface는 구현클래스의 주소를 저장할 수 있다.
		SuperInter si = new SuperInterImpl();
		//인터페이스의 추상메소드를 호출하면 Override한 메소드가 호출된다.
		si.methodA();//
		si.methodB();//
		System.out.println("interface에 default method : " + si.msg());
	}//main

	@Override
	public void methodA() {
		System.out.println("SuperInterImpl클래스가 구현한 메소드a");
	}//메소드a

	@Override
	public void methodB() {		
		System.out.println("SuperInterImpl클래스가 구현한 메소드b");
	}//메소드b

}//class
