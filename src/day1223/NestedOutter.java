package day1223;

/**
 * ��ø Ŭ���� : ���� Ŭ������ static ����ó�� ����� ��
 * @author user
 *
 */
public class NestedOutter {
	int i;
	static int j;
	
	public NestedOutter() {
		System.out.println("�ٱ�Ŭ������ ������");
	}//NestedOutter
	
	public void outInstanceMethod() {
		System.out.println("�ٱ� Ŭ������ �ν��Ͻ� method");
	}//outInstanceMethod
	
	public static void outStaticMethod() {
		System.out.println("�ٱ� Ŭ������ static method");
	}//outInstanceMethod
	
	//////////////////////////////Nested class ����////////////////////////////////
	static class NestedInner{
		static int ni2;
		
		public static void inMethod() {
			System.out.println("NestedInner�� method");
			//����ƽ�� �ν��Ͻ� �������� ���� �޸𸮿� ������ �Ѵ�.
			//�ٱ� Ŭ������ instance ������ method�� ����� �� ����.
			outStaticMethod();
		}//inMethod
	}//NestedInner
	//////////////////////////////Nested class ��////////////////////////////////
	
	public static void main(String[] args) {
		//�ٱ�Ŭ�������� static ������� ����Ŭ������ �ڿ� ���
		NestedInner.inMethod();
	}//main

}//class
