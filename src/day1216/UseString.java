package day1216;

/**
 * String ��� (���ڿ� �����)�� �ּҸ� �����ϴ� �������� java.lang.String�� ���
 * @author user
 *
 */
public class UseString {

	public static void main(String[] args) {
		//�⺻�� ���� : new�� ������� ����, String str = "���ڿ����";
		String str = "ABcDE";
		
		
		//������ ���� : new�� ��� String str = new String("���ڿ����");
		String str1 = new String("ABcDE");
		
		System.out.println("�⺻�� ���� == �� : " + (str == "ABcDE")); //����
		System.out.println("������ ���� == �� : " + (str1 == "ABcDE")); //�ٸ��� ���� �ּҶ� �񱳸� �ϴ� �Ŵϱ� ���ڿ� �ּҶ�
		
		
		System.out.println("�⺻�� ���� equals �� : " + (str.equals("ABcDE"))); //����
		System.out.println("������ ���� equals �� : " + (str1.equals("ABcDE"))); //���� �ִ� �ּҿ� ���ڿ� �ּҶ� �񱳸� �ϴϱ� ����.
		
		
	
		
		
		
		
	}//main

}//class
