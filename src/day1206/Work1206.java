package day1206;
import java.util.Scanner;
class Work1206 {

	public static void main(String[] args) {
		/*�⺻�� �������� 8��
		char byte short int long float double boolean
		*/

		/*
		api���� ���¹�
		��Ű�� �����ϰ� Ŭ���� ���� �� �ʵ峪 �޼ҵ带 ���� �� ����
		*/
		
		//char
		System.out.println("1�� ���� �⺻�� �������� 8�� �ִ밪 �ּҰ�");
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		//byte
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		//short
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		//int
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		//long
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		//float
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		//double
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		//boolean
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);






//2. ������ ����Ͽ� �⵵�� �����ϰ� �������� �Ǵ��ϴ� �ڵ�.
//(4�⸶�� �ѹ� ���������� 100���̸鼭 400���̸�  ���⿡�� ����) 
//Scanner scanner = new Scanner(System.in);
//int year = scanner.nextInt();
System.out.println();
System.out.println("2�� ���� ������ �³� �� �³�");
int year = 2022;
System.out.println(year + "���� " + (  ((year%4==0)&&((year%100==0)||(year%400!=0)))? "�����Դϴ�":"������ �ƴմϴ�")   );





	}
}
