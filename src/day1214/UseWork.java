package day1214;

/**
 * Work�� ����ϴ� Ŭ����
 * 
 * @author user
 *
 */
public class UseWork {

	public static void main(String[] args) {
		// 1. Work�� ��ü�� ����
		Work work = new Work();
		// 2. ���̸� �ܺμ��� => ���� : ���̿� ������ ������ ���� ���.
		work.age = 200;
		//���̿� ���� ������ ������ �� �ִ�.=> ���� �� ���̳� ������ �ұ�?
		if (work.age > 100) {
			work.age = 100;
		}
		// 3.�����ϴ� ��� ���
		work.useAge();
		///////////���ο� ��ü ////////////////////////////
		Work work1 = new Work();
		//Ŭ���� �ܺο��� ���� �����ϸ�
		work1.age = 80;
		//���ο� ��ü�� ������ ������ ��ȿ�� ������ �����ؾ� �Ѵ�. !!!!!!!!!!!!�ߺ��ڵ� ������ �߻�
		if (work1.age > 100) {
			work1.age = 100;
		}
		
		work1.useAge();
		
		////////////////Work2 ��� => setter method�� ����� �� ����/////////
		//1. ��ü ����
		Work2 w2 = new Work2();
		//2. setter method�� ����Ͽ� �� ����
		w2.setAge(10); //��ȿ�� ������ �ش���� �ʴ� ��
		w2.useAge();//����� ������ �����Ǿ� �ִ�.
		w2.setAge(110); //��ȿ�� ������ �ش��ϴ� ��
		w2.useAge();
		
		//3. getter method�� ����� �� �ޱ�
		// �پ��� �������� ����� �� �ִ�.
		System.out.println("������ ���̴� : " + w2.getAge() + "�� �Դϴ�.");
		System.out.println("<b>" + w2.getAge() + "</b>");
		
	}// main

}// class
