package day1212;

/**
 * static
 * Ŭ������ ����Ǹ� �ϳ��� ������ method������ �ö󰡰�, ��� ��ü�� �ϳ��� ������
 * ����ϴ� ����
 * @author user
 *
 */
public class UseStaticVariable {
	
	int i;//instance variable => ��üȭ �� ��ü������ ���
	static int j; //static variable => ��üȭ ���� Ŭ���������� �ٷ� ���.

	public static void main(String[] args) {
		//��üȭ : Ŭ������ ��ü�� = new Ŭ������();
		UseStaticVariable usv = new UseStaticVariable();
		UseStaticVariable usv2 = new UseStaticVariable();
		usv.i=2022;
		usv2.i=2023;
		//�ν��Ͻ� ������ ��ü���� ���� ����ϴ� ����.
		System.out.println("usv ��ü�� i : " + usv.i);
		System.out.println("usv2 ��ü�� i : " + usv2.i);
		//static ������ Ư�� ��ü�� �����ִ� ������ �ƴϹǷ� ��ü��.���������� 
		//����ϴ� ���� �������� �ʴ´�.
		//class��.������ ����ؾ� �Ѵ�.
		System.out.println("usv ����ƽ ������ j : " + UseStaticVariable.j);
		
		
		
		
	}//main

}//class
