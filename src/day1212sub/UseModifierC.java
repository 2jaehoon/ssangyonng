package day1212sub;

import day1212.UseModifierA;

/**
 * ���� ��Ű��(day1212)�� �ٸ� Ŭ�������� ���� ����.
 * 
 * @author user
 *
 */
public class UseModifierC {
	// instance(member) variable >> ��üȭ
	public int a;
	protected int b;
	int c; // default
	private int d;

	public static void main(String[] args) {
		UseModifierA uma = new UseModifierA();
		//�ٸ� ��Ű���� �ٸ� Ŭ�������� public�� ����� �� �ִ�.
		System.out.println("public : "+ uma.a);
		//protected.default,private�� ����� �� ����.
//		System.out.println("protected : "+ uma.b);
//		System.out.println("default : "+ uma.c);
//		System.out.println("private : "+ uma.d); private error
		//���� ��Ű���� �ٸ� Ŭ���������� private�� ����� �� ����.

	}

}
