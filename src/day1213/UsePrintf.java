package day1213;

/**
 * V.A�� ���Ե� console ��� method
 * ��¹��ڿ� ��µǴ� ���� ������ ���������� ���ƾ� �Ѵ�.
 * @author user
 *
 */
public class UsePrintf {

	public static void main(String[] args) {
		
		//���� ���
		System.out.printf("[%d][%7d][%-5d]\n", 2022, 2023,102);
		for(int i=100; i<1200; i+=100) {
			System.out.printf("[%-6d]\n", i);
		}
		
		//�Ǽ� ���
		System.out.printf("[%f][%.3f][%8.2f][%-7.1f]\n\n", 12.345,12.34567891, 12.345667, 12.345);
		
		//���� ���
		System.out.printf("[%c][%4c][%-4c]\n\n",'A','B','C');
		
		//���ڿ� ���
		System.out.printf("[%s][%7s][%-7s]\n\n","�ȳ��ϼ���","Java","�ڹ�");
		
		System.out.printf("������ %d�� %d�� %d�� ������ ������ %s\n\n", 2022, 12, 13, "�帮�� ��");
		
		

	}//main

}//class
