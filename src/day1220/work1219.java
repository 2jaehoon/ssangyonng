package day1220;

/**
 * ���� 1. �Ʒ��� ���� ���� ������ �迭�� �����ϼ���. �����, ��Թ�, �躸��, ��ΰ�, ������, ������, ����ȣ, ����ȣ
 * 
 * ��� �̸� ��� ��� �达�� �ο� �� ��� �̸��� "��"�� ����ִ� ������� ���
 * 
 * 
 * 2. �Ʒ��� ���� ���� ������ �迭�� �����ϼ��� 10, 67, 93, 49, 99, 86, 88
 * ���� ���� ����ϰ�
 * �ְ��� ���, �������� ���
 * 
 * @author user
 *
 */
public class work1219 {

	public work1219() {
		String[] name = { "�����", "��Թ�", "�躸��", "��ΰ�", "������", "������", "����ȣ", "����ȣ" };

		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();

		System.out.print("\"��\"�� ������ �ִ� �̸� : ");
		for (int i = 0; i < name.length; i++) {
			if (name[i].contains("��")) {
				System.out.print(name[i] + " ");
			}
		}
		System.out.println("\n-----------------------------------------------------------");
		
		int[] number = {10, 67, 93, 49, 99, 86, 88};
		int max = number[0];
		int min = number[0];
		for(int i = 0; i<number.length; i++) {
			System.out.print(number[i] + " ");
			if(max<number[i]) {
				max=number[i];
			}else if(min>number[i]) {				
				min=number[i];
			}
		}
		System.out.println();
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);
		
		
	}

	public static void main(String[] args) {
		new work1219();
	}// main

}// class
