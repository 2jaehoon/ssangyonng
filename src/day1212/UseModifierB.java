package day1212;

/**
 * ���� ��Ű��(day1212)�� �ٸ� Ŭ�������� ���� ����.
 * 
 * @author user
 *
 */
public class UseModifierB {
	// instance(member) variable >> ��üȭ
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
		//���� ��Ű���� �ٸ� Ŭ���������� private�� ����� �� ����.

	}

}