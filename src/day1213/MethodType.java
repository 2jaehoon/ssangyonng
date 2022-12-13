package day1213;

/**
 * method�� 4���� ����.<br>
 * @author user
 *
 */
public class MethodType {
	
	/**
	 * ���� ��(��ȯ�� ����, �Ű����� ���� ��)<br>
	 * �׻� ���� ���� �����Ѵ�.
	 */
	public void typeA() {
		System.out.println("������");
	}//typeA
	
	
	/**
	 * ���� ��. (��ȯ�� ����, �Ű����� �ִ� ��)<br>
	 * �Ű������� �ִ� method�� ȣ���� �� �Ű������� ����, �����Ϳ� �´� ���� �����Ͽ� ȣ��
	 * @param i �ԷµǴ� ��
	 */
	public void typeB(int i) {
		System.out.println("���� �� i = "+ i);
	}//typeB
	
	/**
	 * ���� ��(��ȯ�� �ְ�, �Ű����� ���� ��)<br>
	 * ������ ����ϴ� method�� ���� ������ �ٿ� ��ȯ���� ������ ������ ���� ����
	 * ��ȯ�ϴ� return�� �ݵ�� ��� �Ǿ���Ѵ�.
	 * @return
	 */
	public int typeC() {
		
		
		return 2022; //return �������� ��� x
	}
	
	/**
	 * ���� ��(��ȯ�� �ְ� �Ű����� �ִ� ��)<br>
	 * ������ ����ϴ� method�� ���� ������ �ٿ� ��ȯ���� ������ ������ ���� ����
	 * ��ȯ�ϴ� return�� �ݵ�� ��� �Ǿ���Ѵ�.
	 * @param d �������� �Է°�
	 * @return ���������� ó���� ���
	 */
	public int typeD(double d) {
		
		return (int)d; //d�� ��ȯ���̶� �޶� error
	}

	public static void main(String[] args) {
		//��üȭ : Ŭ������ ��ü�� = new Ŭ������();    //���ؿ� �ּҰ� ���� ���� �ּҿ� �´� �� ��
		MethodType mt = new MethodType();
		//�������� �����ϴ� method�� ȣ�� : ��ü��.method��();
		for(int i =0; i<10; i++)
		mt.typeA();
		
		//�������� �����ϴ� method ȣ�� : ��ü��.method��(��)
		for(int i =0; i<10; i++)
		mt.typeB(i);
		
		//////////////////������ ����ϴ� method///////////////////////////////////////////////////////
		System.out.println("������ ��� : " +mt.typeC());
		//���� �Ҵ�.
		int i = mt.typeC();
		System.out.println("�������� ���� ���� ��� : " + i);
		//���갡��
		System.out.println(mt.typeC() + 1);
		
		//������
		System.out.println("���� �� ��� : "+ mt.typeD(12.13));
		i=mt.typeD(12.13);
		System.out.println("�������� ���� ���� ��� : " + i);
		//���� ����
		System.out.println(mt.typeD(12.16)*10);
		
		
		
	}//main

}//class
