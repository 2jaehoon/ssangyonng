package day1212;

/**
 * instance method�� static method
 * @author user
 *
 */
public class TestMethod {
	public void instanceMethod() {
		System.out.println("��ü�� ���� ������ ����Ͽ� ������ ó���ϴ� method => ��üȭ ����");
	}//instanceMethod
	public static void staticMethod() {
		System.out.println("�Էµ� �����θ� ����ó���ϴ� method => ��üȭ�� �ʿ� ����");
	}//staticMethod

	public static void main(String[] args) {
		//static ������ main method���� intstanceMethod�� ���� ȣ�� �Ұ���.
		//instanceMethod();
		System.out.println("----------------------instance method---------------------------------");
		//1. ��üȭ
		TestMethod tm = new TestMethod();
		//2. ȣ��
		tm.instanceMethod();
		
		
		System.out.println("----------------------static method---------------------------------");
		TestMethod.staticMethod();
//		tm.staticMethod() //static method�� Ư����ü�� ���� instance���� ���� ����ϴ� method��
		//�ƴϹǷ� ��ü������ ȣ������ �ʴ´�.

	}//main

}//class
