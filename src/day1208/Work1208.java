package day1208;

public class Work1208 {
	public static final int HOME_BUS = 0;
	public static final int BUS = 1;
	public static final int SUBWAY = 2;

	public static void main(String[] args) {
		int ticket = 2; //Ż ���� Ƽ�� 0 �������� 1 ���� 2 ����ö
		int money = 0;  // �� �ʱ�ȭ
		int km =14;  //�Է°� Ű�μ�
		String ride = ""; //�������
		int i; //���� �� �ʱ�ȭ
		
		switch (ticket) {
		case HOME_BUS:
			money = 800;
			ride = "��������";
			System.out.println("��������� �⺻����� " + money  + "�Դϴ�.");
			System.out.println("�Է��Ͻ� ���� ���� " + ride + "�̰�, �̵��Ÿ���" + km + " km�Դϴ�.");
			if (km>10) {
				for(i=0; i<km-10;i++) {
					money = money +100;
				}
			}
		System.out.println("�����"  + money  +  "��, �պ���� " +  money*2 +  "�� �Ѵ� 20�� �����̿� �� �̿����� " + money*40 + "���Դϴ�.");
			break;
		case BUS:
			money = 1250;
			ride = "����";
			System.out.println("��������� �⺻����� " + money  + "�Դϴ�.");
			System.out.println("�Է��Ͻ� ���� ���� " + ride  + "�̰�, �̵��Ÿ���" + km + " km�Դϴ�.");
			if (km>10) {
				for(i=0; i<km-10;i++) {
					money= money +100;
				}
			}
			System.out.println("�����"  +  money +  "��, �պ���� " +  money*2 +  "�� �Ѵ� 20�� �����̿� �� �̿����� " +money*40 + "���Դϴ�.");
			break;
		case SUBWAY:
			money = 1300;
			ride = "����ö";
			System.out.println("��������� �⺻����� " + money  + "�Դϴ�.");
			System.out.println("�Է��Ͻ� ���� ���� " + ride  + "�̰�, �̵��Ÿ���" + km + " km�Դϴ�.");
			if (km>10) {
				for(i=0; i<km-10;i++) {
					money= money +100;
				}
			}
			System.out.println("�����"  +  money +  "��, �պ���� " +  money*2 +  "�� �Ѵ� 20�� �����̿� �� �̿����� " +money*40+ "���Դϴ�.");
			break;
			default : 
		}

	}

}
