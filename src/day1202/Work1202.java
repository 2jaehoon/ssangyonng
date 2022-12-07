package day1202;
class Work1202 {
	public static void main(String[] args) {
		char initial1 = 'L';
		char initial2 = 'J';
		char initial3 = 'H';
		int birthyear = 1997;
		int age = 26;
		
		System.out.println("출력1");
		System.out.println("내 이름은 이재훈이고 이니셜은" + initial1 + initial2 + initial3 +  "입니다.");
		System.out.println( initial1 +""+ initial2 +""+ initial3 );
		System.out.println("태어난 해 는" + birthyear + "년으로");
		System.out.println("나이는 " + age + " 살입니다.");

		System.out.println(" ");

		double leftEye = 0.3;
		double rightEye = 0.1;
		double lrEye = (leftEye + rightEye)/2;
			
		System.out.println("출력2");
		System.out.println("왼눈 시력" + leftEye + "오른 눈 시력" +  rightEye + "양안시력" + lrEye + "입니다. ");
		System.out.println(" ");

		int busmoney = 3000;
		int twobusmoney = busmoney*2;
		int monthbusmoney = twobusmoney*20;
		System.out.println("출력3");
		System.out.println("편도 차비" + busmoney + "원 왕복 차비" + twobusmoney + "한달 20일 출근을 하면");
		System.out.println("월 교통비는 " + monthbusmoney + " 원 입니다.");
	}
}
