package day0110;

public class TestInstanceOf {

	public static void main(String[] args) {
		
		TestInstanceOf ti = new TestInstanceOf();
		//��ü�� �� Ŭ�����κ��� ��������°�? ��
		//instanceof �����ڴ� ��ü�� �������踦 �Ǵ��ϱ� ���� ������
		// ����
		//��ü�� instanceof Ŭ������ �Ǵ� �������̽���
		if(ti instanceof TestInstanceOf) {
			System.out.println(ti + "�� TestInstanceOf Ŭ�����κ��� ����");
		}else {
			System.out.println(ti + "�ٸ� Ŭ�����κ��� ����");
		}

	}//main

}//class
