package day1205;
/*
���׿����� : ���꿡 �ʿ��� ���� �ϳ��� ������.

~, !,+, -, ++, --

����)
������ ���ü(��������)
���ü ������(��������)

*/

class Operator1 {
	public static void main(String[] args) {
		
		int i = 12;
		int j = -12;
		
		System.out.println("~" + i + " = " + ~i); //~��� : ��ȣ���� 1����
		System.out.println("~" + j + " = " + ~j); //~���� : ��ȣ���� 1����

		boolean flag1 = true;
		boolean flag2 = false;

		System.out.println("!" + flag1 + " = " + !flag1); //true > false
		System.out.println("!" + flag2 + " = " + !flag2); //false > true

		System.out.println(!(12 > 5)); //!���� �տ� ����� �� ����.

		//+ : ������ ����
		System.out.println("+" + i + " = " + +i); //+12
		System.out.println("-" + i + " = " + -i); //-12

		//- : 2�� ���� ����(��ȣ �ٲ� ����) : ���� �״���̰� ��ȣ�� ����
		System.out.println("-" + i + " = " + -i); //-12
		System.out.println("-" + j + " = " + -j); //12

		//++ ��������, --���ҿ���
		++i;//12 => 13
		i++;//13 => 14
		System.out.println("�������� �� i = " + i);

		--i; //14 => 13
		i--; //13 => 12
		System.out.println("���ҿ��� �� i = " + i);

		//���� �����ڿ� �Բ� ���Ǹ� ������ ������ �ٸ����� �����Ѵ�.
		int result = 0;
		//���� : �� �� ���� (���� �� ����)
		result = ++i;
		System.out.println("���� ������ result = " + result + ", i = " + i);
		result = 0;
		//���� : ���� �� ����(���� �� ����)
		result = i++;
		System.out.println("���� ������ result = " + result + ", i = " + i);

		//�޼ҵ忡 �Ҵ� �� ���� ����.
		System.out.println("���� : " + ++i); //14���� 15�� ������ �� ���
		System.out.println("���� : " + i++); //15�� ���� ����� �� 16���� ����
		System.out.println("i�� ���簪 : " + i);

		

	}
}
