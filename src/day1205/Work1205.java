package day1205;
class Work1205{
	public static final int MONTH_MONEY = 500000;
	public static final int MONTH = 20;
	//�޽�� �ۿ� �ٰ� ����� �����ؾ� �Ѵ�.!!
	public static void main(String[] args) {
		//1
		
		int busMoney = 3000;
		int lunchMoney = 6000;
		
		System.out.println("�Ѵ� �뵷�� "+ Work1205.MONTH_MONEY + "�� �Ϸ� �뵷�� " + Work1205.MONTH + "�� �������� " + Work1205.MONTH_MONEY/Work1205.MONTH + "�Դϴ�" );
		System.out.println("�Ϸ� ��� ����� �� ����� " + busMoney + "�� �պ������ " + busMoney*2 + " ���ɽĴ� " + lunchMoney + "������"   );
		System.out.println("��" + (busMoney*2+lunchMoney)+ "�� �Դϴ�.");
		System.out.println("");
		System.out.println("�Ѵ��� ������ ���� �ݾ���" + (Work1205.MONTH_MONEY - 20*(busMoney*2+lunchMoney))+ "�� �Դϴ�.");
		System.out.println("");
 
//2

		System.out.println("");
		int yearofBorn = 1997;
		System.out.println("�¾ �ذ� �����̸� true ����̸� false ���� �ش� �����ΰ�?" + (yearofBorn%4==0));



	
		
	}
}
