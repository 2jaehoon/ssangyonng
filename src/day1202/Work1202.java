package day1202;
class Work1202 {
	public static void main(String[] args) {
		char initial1 = 'L';
		char initial2 = 'J';
		char initial3 = 'H';
		int birthyear = 1997;
		int age = 26;
		
		System.out.println("���1");
		System.out.println("�� �̸��� �������̰� �̴ϼ���" + initial1 + initial2 + initial3 +  "�Դϴ�.");
		System.out.println( initial1 +""+ initial2 +""+ initial3 );
		System.out.println("�¾ �� ��" + birthyear + "������");
		System.out.println("���̴� " + age + " ���Դϴ�.");

		System.out.println(" ");

		double leftEye = 0.3;
		double rightEye = 0.1;
		double lrEye = (leftEye + rightEye)/2;
			
		System.out.println("���2");
		System.out.println("�޴� �÷�" + leftEye + "���� �� �÷�" +  rightEye + "��Ƚ÷�" + lrEye + "�Դϴ�. ");
		System.out.println(" ");

		int busmoney = 3000;
		int twobusmoney = busmoney*2;
		int monthbusmoney = twobusmoney*20;
		System.out.println("���3");
		System.out.println("�� ����" + busmoney + "�� �պ� ����" + twobusmoney + "�Ѵ� 20�� ����� �ϸ�");
		System.out.println("�� ������ " + monthbusmoney + " �� �Դϴ�.");
	}
}
