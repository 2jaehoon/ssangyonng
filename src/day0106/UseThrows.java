package day0106;

/**
 * �޼��忡�� ���ܸ� ���� => ȣ���� ������ ���ܸ� ó��
 * (���ܹ߻��ڵ�� ����ó���ڵ带 �и��� �� �ִ�.
 * @author user
 *
 */
public class UseThrows {
	
	public void test(String className)throws ClassNotFoundException {
		System.out.println("�ε� ��");
		
		Class.forName(className);
		
		System.out.println("�ε� ��");
	}//test

	public static void main(String[] args) {
		UseThrows ut = new UseThrows();
		try {
			ut.test("day0106.UseThrows");
			System.out.println("Ŭ���� �ε� ���� ���� �ڵ�");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ε� ���� ���� �ڵ�");
			e.printStackTrace();
		}

	}

}
