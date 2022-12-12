package day1212;

/**
 * instance variable
 * Ŭ������ ��ü�� �����Ͽ� ��ü�� ����� ������ ����ϴ� ���.
 * ����) Ŭ������ ��ü�� = new Ŭ������();
 * @author user
 *
 */
public class UseInstanceVariable {
	//non static field
	int  i;//instance variable => ��ü�� ������ �� ����� �� �ִ� ����
	int  j;//instance variable
	

	public static void main(String[] args) {
		//class�� static ������ ���� ���� ����ȴ�.
		//i=12;//static ���������� instance ������ ���� ȣ���� �� ����.
//		 ����) Ŭ������ ��ü�� = new Ŭ������();
		
		//��üȭ : instance ������ ����ϱ� ���� heap �޸𸮿� �÷����� ����.
		UseInstanceVariable uiv = new UseInstanceVariable();
		System.out.println("heap�� ������ uiv �ּ� : " + uiv);
		
		//instantiate 
		UseInstanceVariable uiv2 = new UseInstanceVariable();
		System.out.println("heap�� ������ uiv2 �ּ� : " + uiv2);
		
		
		//instantiate variable�� ��ü�� ���ؼ� ����� �� �ִ�.
		//��ü���� ���� �̸��� �ν��Ͻ� ������ ������ �ִ�.
		uiv.i=2022;
		uiv.j=12;
		
		uiv2.i=2023;
		uiv2.j=1;
		System.out.println(" uiv instance variable i : " + uiv.i);
		System.out.println(" uiv instance variable j : " + uiv.j);
		System.out.println(" uiv2 instance variable i : " + uiv2.i);
		System.out.println(" uiv2 instance variable j : " + uiv2.j);
	}//main

}//class
