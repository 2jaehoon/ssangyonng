package day1223;

/**
 * �ڽ�Ŭ�������� �θ�Ŭ������ Ȯ�� => ���
 * �ڽĿ��� �θ��� ������ ���� (�ڽ����� �����Ͽ� �θ� ������ �� �ִ�.)
 * @author user
 *
 */
public class Child extends Parent{
	
@Override
	public void test() {
		System.out.println("�θ������ϴ� ���");
	}

//final�� �޼ҵ�� �������̵尡 ���� �ʴ´�.
//public  final void testMethod() {
//	System.out.println("�θ� �״�� ����ؾ��ϴ� ���");
//}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.test(); //�������̵�� �޼ҵ尡 ȣ��
		child.testMethod();//�θ�Ŭ������ �޼ҵ尡 ȣ��
	}

}
