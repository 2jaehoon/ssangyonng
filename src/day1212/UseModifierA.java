package day1212;

/**
 * 접근 지정자의 접근 범위.
 * 
 * @author user
 *
 */
public class UseModifierA {
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
		System.out.println("private : "+ uma.d);

	}

}
