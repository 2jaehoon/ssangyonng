package day1205;
/*
�پ��� ������ ���
�� - 10����
0�� - 8����
0X�� - 16����
*/

class Radix{
  public static void main(String[] args) {
		
		int num1=10;//10����    int�� 4byte�� ������ �޸𸮿� ����Ǵ� ���� 0000  0000   0000   1010�̿��߸� ��
		int num2=012;//8����
		int num3=0xa;//16����

		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
		//����� ������ �޶�� 2������ ����ǰ� 2������ ����Ǿ� 10������ ����� �����ش�.
		System.out.printf("%d %d %d\n",num1, num2, num3);

		//num2=09; 8������ 7������ ��밡��
		//��ȭ��ȣ ���� => �������� ��ȭ��ȣ�� ������ �� ����.
		//int tel=01012345678; //error �Ǵ� 10������ ����� ���´�.
		//System.out.println(tel);

		int i=300;
		//����� 1�� ������ ���. (1�տ� 0�� ����)
		System.out.println(i+"�� 2������ " + Integer.toBinaryString(i));  //Ŭ����.�޽��(�μ�) ��Ƽ����.��
		System.out.println(i+"�� 8������ " + Integer.toOctalString(i)); //Ŭ����.�޽��(�μ�)
		System.out.println(i+"�� 16������ " + Integer.toHexString(i)); //Ŭ����.�޽��(�μ�)

	}
}
