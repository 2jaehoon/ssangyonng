package day1212;

/**
 * 같은 패키지(day1212)의 다른 클래스에서 접근 범위.
 * 
 * @author user
 *
 */
public class UseModifierB {
	// instance(member) variable >> 객체화
	public int a;
	protected int b;
	int c; // default
	private int d;

	public static void main(String[] args) {
		UseModifierA uma = new UseModifierA();
		System.out.println("public : "+ uma.a);
		System.out.println("protected : "+ uma.b);
		System.out.println("default : "+ uma.c);
//		System.out.println("private : "+ uma.d); private error
		//같은 패키지의 다른 클래스에서는 private를 사용할 수 없다.

	}

}
