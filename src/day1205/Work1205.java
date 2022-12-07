package day1205;
class Work1205{
	public static final int MONTH_MONEY = 500000;
	public static final int MONTH = 20;
	//메쏘드 밖에 다가 상수는 설정해야 한다.!!
	public static void main(String[] args) {
		//1
		
		int busMoney = 3000;
		int lunchMoney = 6000;
		
		System.out.println("한달 용돈은 "+ Work1205.MONTH_MONEY + "원 하루 용돈은 " + Work1205.MONTH + "일 기준으로 " + Work1205.MONTH_MONEY/Work1205.MONTH + "입니다" );
		System.out.println("하루 사용 비용은 편도 교통비 " + busMoney + "원 왕복교통비 " + busMoney*2 + " 점심식대 " + lunchMoney + "원으로"   );
		System.out.println("총" + (busMoney*2+lunchMoney)+ "원 입니다.");
		System.out.println("");
		System.out.println("한달이 지나면 남은 금액은" + (Work1205.MONTH_MONEY - 20*(busMoney*2+lunchMoney))+ "원 입니다.");
		System.out.println("");
 
//2

		System.out.println("");
		int yearofBorn = 1997;
		System.out.println("태어난 해가 윤년이면 true 평년이면 false 나의 해는 윤년인가?" + (yearofBorn%4==0));



	
		
	}
}
