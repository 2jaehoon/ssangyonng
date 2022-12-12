package day1212;

/**
 * static
 * 클래스가 실행되면 하나의 변수가 method영역에 올라가고, 모든 객체가 하나의 변수를
 * 사용하는 변수
 * @author user
 *
 */
public class UseStaticVariable {
	
	int i;//instance variable => 객체화 후 객체명으로 사용
	static int j; //static variable => 객체화 없이 클래스명으로 바로 사용.

	public static void main(String[] args) {
		//객체화 : 클래스명 객체명 = new 클래스명();
		UseStaticVariable usv = new UseStaticVariable();
		UseStaticVariable usv2 = new UseStaticVariable();
		usv.i=2022;
		usv2.i=2023;
		//인스턴스 변수는 객체마다 각각 사용하는 변수.
		System.out.println("usv 객체의 i : " + usv.i);
		System.out.println("usv2 객체의 i : " + usv2.i);
		//static 변수는 특정 객체에 속해있는 변수가 아니므로 객체명.변수명으로 
		//사용하는 것은 적합하지 않는다.
		//class명.변수로 사용해야 한다.
		System.out.println("usv 스테틱 변수의 j : " + UseStaticVariable.j);
		
		
		
		
	}//main

}//class
