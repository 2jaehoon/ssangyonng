package day1212sub;

import day1212.UseModifierA;

/**
 * 다른 패키지(day1212)의 자식클래스에서 접근 범위.
 * 
 * @author user
 *
 */
public class UseModifierD extends UseModifierA{
	// instance(member) variable >> 객체화


	public static void main(String[] args) {
		//상속관계일때에는 자식클래스로 객체를 생성할 수 있다.
		UseModifierD umd = new UseModifierD();
		//public protected 접근할 수 있고
		System.out.println("public : " + umd.a);
		System.out.println("protected : " + umd.b);
		//default, private는 접근할 수 없다.
//		System.out.println("default : " + umd.c);
//		System.out.println("private : " + umd.d);
		
	


	}

}
