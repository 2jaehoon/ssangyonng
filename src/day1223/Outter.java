package day1223;

/**
 * ���� Ŭ������ �ν��Ͻ� ����ó�� ����� ��
 * @author user
 *
 */
public class Outter {
	
	int i;
	
	public Outter() {
		System.out.println("�ٱ�Ŭ������ ������");
	}//Outter

	public void outMethod() {
		System.out.println("�ٱ� Ŭ������ �޼ҵ� i " + i);
	//�ٱ�Ŭ���������� ���� Ŭ������ �ڿ��� ���� ����� �� ����.
//		inMethod();
	}//outMethod
	
	
	/////////////////////////////////////////////Inner class ����////////////////////////////////////////////////////////////
	public class Inner{
		int j;
		
		public Inner() {
			System.out.println("���� Ŭ������ ������");
		}//Inner
		
		public void inMethod() {
			System.out.println("���� Ŭ������ �޼ҵ�");
			//����Ŭ���������� �ٱ� Ŭ������ �ڿ��� ������� ����� �� �ִ�.
			i=2022;
			System.out.println("�ٱ�Ŭ������ ���� : " + i);
			outMethod();
		}//inMethod
		
	}//class
	
	/////////////////////////////////////////////Inner class ��////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		//1. �ٱ�Ŭ������ ��üȭ
		Outter out = new Outter();
//		out.inMethod();//ȣ��Ұ�
		out.outMethod();
		
	System.out.println("---------------------------------------------------------");
		//2. ����Ŭ������ ��üȭ
		//�ٱ�Ŭ������.����Ŭ������ ��ü�� = �ٱ�Ŭ������ü��.new ����Ŭ������ ������();
		Outter.Inner in = out.new Inner();
		in.inMethod();
		
		
		
		
		
		
		
		
	}//main

}//class
