package day1213;

/**
 * �ϳ��� Ŭ�������� ���� �̸��� method�� ���� �� �����ϴ� ��
 * @author user
 *
 */
public class TestOverload {
//Ŭ�������� ������ �޽��ۿ� ��� �Ұ����ϴ�.	


	
	
	
	/**
	 * ���� �ϳ� ����ϴ� ��
	 */
	public void printStar() {
		System.out.println("��");
	}//printStar
	
	/**
	 * �ԷµǴ� ������ŭ ���� ���
	 * Overload(Overloading)
	 * @param cnt ����� ���� ����
	 */
	public void printStar(int cnt) {
		for(int i = 0; i <cnt; i++)
		System.out.print("��");
	}//printStars
	
	

	public static void main(String[] args) {
		//1. ��üȭ
		TestOverload to = new TestOverload();
		//2.method ȣ��
		//�� �ϳ��� ����ϴ� method ȣ��
		to.printStar();
		//�� ���� ���� ����ϴ� method ȣ��
		to.printStar(5);
	
	}//main

}//class
