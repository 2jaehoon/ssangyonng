package day1208;

public class Work1208 {
	public static final int HOME_BUS = 0;
	public static final int BUS = 1;
	public static final int SUBWAY = 2;

	public static void main(String[] args) {
		int ticket = 2; //탈 것의 티켓 0 마을버스 1 버스 2 지하철
		int money = 0;  // 돈 초기화
		int km =14;  //입력값 키로수
		String ride = ""; //교통수단
		int i; //포문 값 초기화
		
		switch (ticket) {
		case HOME_BUS:
			money = 800;
			ride = "마을버스";
			System.out.println("교통수단의 기본요금은 " + money  + "입니다.");
			System.out.println("입력하신 교통 수단 " + ride + "이고, 이동거리는" + km + " km입니다.");
			if (km>10) {
				for(i=0; i<km-10;i++) {
					money = money +100;
				}
			}
		System.out.println("편도요금"  + money  +  "원, 왕복요금 " +  money*2 +  "원 한달 20일 기준이용 총 이용요금은 " + money*40 + "원입니다.");
			break;
		case BUS:
			money = 1250;
			ride = "버스";
			System.out.println("교통수단의 기본요금은 " + money  + "입니다.");
			System.out.println("입력하신 교통 수단 " + ride  + "이고, 이동거리는" + km + " km입니다.");
			if (km>10) {
				for(i=0; i<km-10;i++) {
					money= money +100;
				}
			}
			System.out.println("편도요금"  +  money +  "원, 왕복요금 " +  money*2 +  "원 한달 20일 기준이용 총 이용요금은 " +money*40 + "원입니다.");
			break;
		case SUBWAY:
			money = 1300;
			ride = "지하철";
			System.out.println("교통수단의 기본요금은 " + money  + "입니다.");
			System.out.println("입력하신 교통 수단 " + ride  + "이고, 이동거리는" + km + " km입니다.");
			if (km>10) {
				for(i=0; i<km-10;i++) {
					money= money +100;
				}
			}
			System.out.println("편도요금"  +  money +  "원, 왕복요금 " +  money*2 +  "원 한달 20일 기준이용 총 이용요금은 " +money*40+ "원입니다.");
			break;
			default : 
		}

	}

}
