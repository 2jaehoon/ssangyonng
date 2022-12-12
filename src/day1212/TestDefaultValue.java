package day1212;

/**
 * instance variable�� �⺻ ��
 * (static variable�� ������ ���� �Ҵ� ��.)
 * @author user
 *
 */
public class TestDefaultValue {
	//�⺻�� �������� (��)
	public int a;
	char b;
	double c;
	boolean d;
	//������ �������� (�ּ�)
	TestDefaultValue tdv;
	String str;
	int [] arr;

	public static void main(String[] args) {
		//��üȭ�� �ؾ� ���� ������(instance variable)�� ��� ����
		//����) Ŭ������ ��ü�� = new Ŭ������();
		
		TestDefaultValue defaultValue = new TestDefaultValue();
		//�ν��Ͻ� ������ heap�� �ö󰡰�, ������ �⺻ ������ ���� �����ȴ�.
		System.out.println("-----------�⺻��------------");
		System.out.println("������ : " + defaultValue.a); //0
		System.out.println("������ : " + defaultValue.b); //\u0000
		System.out.println("�Ǽ��� : " + defaultValue.c); //0.0
		System.out.println("�Ҹ��� : " + defaultValue.d);//false
		System.out.println("-----------������------------");
		//null - ������ ���������� heap�� �ּҸ� ������ ����(��ü�� �������� �ʾ���)
		System.out.println("class : " + defaultValue.tdv); //null
		System.out.println("String : " + defaultValue.str); //null
		System.out.println("array : " + defaultValue.arr); //null

		
		
		
		
	}//main

}//class
