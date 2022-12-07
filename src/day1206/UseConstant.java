package day1206;
/*
다른 클래스에 존재하는 상수를 사용.
상수를 가진 클래스명.상수명
*/


class UseConstant {
	public static void main(String[] args) {
		System.out.println("최고점 : " + Constant.MAX_SCORE);
		System.out.println("최저점 : " + Constant.MIN_SCORE);
		System.out.println("최저점 : " + Integer.MAX_VALUE);
	}
}
