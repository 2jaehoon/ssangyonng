package day1212sub;

import day1212.UseModifierA;

/**
 * 같은 패키지(day1212)의 다른 클래스에서 접근 범위.
 * 
 * @author user
 *
 */
public class UseModifierC {
	// instance(member) variable >> 객체화
	public int a;
	protected int b;
	int c; // default
	private int d;

	public static void main(String[] args) {
		UseModifierA uma = new UseModifierA();
		//다른 패키지의 다른 클래스에선 public만 사용할 수 있다.
		System.out.println("public : "+ uma.a);
		//protected.default,private은 사용할 수 없다.
//		System.out.println("protected : "+ uma.b);
//		System.out.println("default : "+ uma.c);
//		System.out.println("private : "+ uma.d); private error
		//같은 패키지의 다른 클래스에서는 private를 사용할 수 없다.

	}

}
