package day1222;

/**
 * �߻� Ŭ���� : 
 * 1. ���� ��üȭ �� �� ����. �ڽ�Ŭ������ ��üȭ �� ���� ��üȭ�� �ȴ�.
 * 2. ������ �������� ������ �߻�޼ҵ带 ������.
 * 
 * @author user
 *
 */
public abstract class AbstractSuper {
	int i;
	
	public AbstractSuper() {
		System.out.println("�߻� Ŭ������ ������");
	}//AbstractSuper
	
	

	public void methodA() {
		System.out.println("�Ϲ� �޼ҵ�");
	}
	
	//abstract method
	public abstract void methodB();
	public abstract String methodC(int i);
	
	
	
	public static void main(String[] args) {
		//�߻�Ŭ������ ���� ��üȭ �� �� ����.
		//�ڽ�Ŭ������ ���ؼ��� �����ϴ�.
//		AbstractSuper as = new AbstractSuper();
	}//main

}//class
