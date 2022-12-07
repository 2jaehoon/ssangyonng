package day1206;
/**
상수 : 변수를 상수처럼 사용(가독성 향상 값변경 불가)
클래스 필드에서 선언하고, 어디에서든 사용할 수 있다.
프로그램에서 기준값을 만들고 사용해야 할 때.
작성법)
public static final 데이터형 상수명 = 값;
*/

//constant는 작성위치가 결정되어 있다. 메쏘드 안에서 쓰면 에러.
class Constant {
	public static final int MAX_SCORE=100;
	public static final int MIN_SCORE=0;
	public static void main(String[] args) {
		//public static final int MAX_SCORE=100;      //error
		//클래스명 없이 상수를 바로 사용
		System.out.println("최고점 : "+MAX_SCORE);
		//클래스명 명시하여 상수 사용
		System.out.println("최저점 : "+Constant.MIN_SCORE);
		
		//Constant.MAX_SCORE=99; // 선언한 라인이 아니면 값 할당 할 수 없다.
		int myScore=88; 
		
		System.out.println("획득점수 : " + myScore + "점 최고점수 : " + Constant.MAX_SCORE + 
			"점, 획득점수와 최고 점수의 차 : " + (Constant.MAX_SCORE - myScore)+ "점"); 
		
	
	}//Constant
}//Class
