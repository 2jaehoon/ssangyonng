package day1212sub;

import day1212.UseModifierA;

/**
 * �ٸ� ��Ű��(day1212)�� �ڽ�Ŭ�������� ���� ����.
 * 
 * @author user
 *
 */
public class UseModifierD extends UseModifierA{
	// instance(member) variable >> ��üȭ


	public static void main(String[] args) {
		//��Ӱ����϶����� �ڽ�Ŭ������ ��ü�� ������ �� �ִ�.
		UseModifierD umd = new UseModifierD();
		//public protected ������ �� �ְ�
		System.out.println("public : " + umd.a);
		System.out.println("protected : " + umd.b);
		//default, private�� ������ �� ����.
//		System.out.println("default : " + umd.c);
//		System.out.println("private : " + umd.d);
		
	


	}

}
