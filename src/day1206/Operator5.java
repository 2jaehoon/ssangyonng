package day1206;
/**
��������
�Ϲݳ�
&& (AND) :���װ� ������ ��� ���̸� ���� ��ȯ
|| (OR) : ���װ� ������ ��� �����̸� ���� ��ȯ
��Ʈ��
& : ������Ʈ�� ������Ʈ ��� 1�ΰ�� 1����
| : ������Ʈ�� ������Ʈ ��� 0�ΰ�� 0����
^ : ������Ʈ�� ������Ʈ ���� �ϳ��� 1�ΰ�� 1����
*/
class Operator5{
	public static void main(String[] args) {
		System.out.println(12 > 6 &&  12 < 2022);//�� ���迬���ڸ� ��� ó��
		System.out.println(12 > 6 ||  12 < 2022);//or�� �� ���迬���ڸ� ��� ó��

		boolean flag1=true,flag2=false,flag3=true, flag4=false;
		System.out.println("--------------and--------------------------");
		System.out.println(flag1+" && " + flag3 + " = " + (flag1 && flag3));
		System.out.println(flag1+" && " + flag2 + " = " + (flag1 && flag2));
		System.out.println(flag2+" && " + flag1 + " = " + (flag2 && flag1));
		System.out.println(flag2+" && " + flag4 + " = " + (flag2 && flag4));

		System.out.println("--------------or--------------------------");
		System.out.println(flag1+" || " + flag3 + " = " + (flag1 || flag3));
		System.out.println(flag1+" || " + flag2 + " = " + (flag1 || flag2));
		System.out.println(flag2+" || " + flag1 + " = " + (flag2 || flag1));
		System.out.println(flag2+" || " + flag4 + " = " + (flag2 || flag4));



		flag1=false;
		flag2=false;
		flag3=false;

		flag3= (flag1= 3 <2) && (flag2=5<6);//������ f�̸� ������ �������� �ʴ´�.
		System.out.println(flag1 + " && " + flag2 + " = " + flag3);



		//1.int i������ �����ϰ� ������ �� �Ҵ�
		//2. i������ 1~100���̸� true�� ����ϰ� �׷��� �ʴٸ� false ���

		int i =101;
		System.out.println(i>=1 && i<=100);

		//////////////////��Ʈ������///////////////////////////
		System.out.println("��Ʈ������----------------------------------------------");

		i=26;
		int j=0xf; //15
		System.out.println(i + "& " + j + "=" + (i&j));

		i=30;
		j=25;
		System.out.println(i + " | " + j + "=" + (i|j));
		//11110 | 11001  > 11111

		i=12;
		j=9;
		System.out.println(i + " ^ " + j + "=" + (i^j));
		//1100 ^ 1001 > 0101



	}
}
