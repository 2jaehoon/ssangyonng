package day1215;

/**
 * this�� method���� ��� :
 * ��üȭ ���� Ŭ������ �ٸ� ������(Constructor)�� ȣ���Ѵ�.
 * @author user
 *
 */
public class TestThisConstructor {
	
	
	public TestThisConstructor()
	{
		//this(12);
		System.out.println("�⺻������");
	}// TestThisConstructor
	
	
	public TestThisConstructor(int i)
	{
		this(); // �⺻ ������ �������� ù��° �ٿ����� �ÿ��� �� �ִ�.
		System.out.println("�μ��� �ִ� ������");
	}// TestThisConstructor
	
	
	
	
	public static void main(String[] args) {
		//��üȭ : 
		//1. Ŭ������ ��ü��(������) = new ������(); // ��ü������ ������ method�� ȣ���� ��
		//2. new ������(); // ��ü������ ������ method�� ȣ���� �ʿ䰡 ���� ��
		new TestThisConstructor(20);
		
		
	}//main

}//class
