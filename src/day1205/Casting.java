package day1205;
/*
��������ȯ
�����ڰ� ���ϴ� ������������ �Ͻ����� ��ȯ�� �����ϴ� ��





*/



class Casting{
	public static void main(String[] args) {
		byte num1 = 10;
		byte num2 = 20;
		byte result  = 0;

		result = (byte)(num1 + num2);

		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

		char c = 'A';
		System.out.println("���� "+c+"�� �����ڵ尪 "+(int)c);
		int i = 97;
		System.out.println("�����ڵ� "+i+"�� ���� �� "+(char)i);


		//���ս� �߻�
		float f = 2022.12f;
		i=(int)f;
		System.out.println("�� �ս� ���� : "+ f+ ", ��������ȯ�� �� : " +i);


		double d=5.5555555555555;
		f=(float)d;
		System.out.println("�� �ս� ���� : "+ d+ ", ��������ȯ�� �� : " +f);


		//boolean�� �ٸ� �����δ� ��������ȯ ���� ���Ѵ�.
		boolean b = true;
		System.out.println((boolean)b); //error�� �߻�x ȿ��x
		
		//�⺻���� ���������� ��������ȯ���� ���Ѵ�.

		
		//String str = (String)i; //�⺻���� ���������� Casting
		String str = "2022";
		//i=(int)str; //������(String)�� �⺻��(int)�� Casting

	}
}
