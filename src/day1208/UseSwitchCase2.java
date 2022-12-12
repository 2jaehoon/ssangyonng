package day1208;

import java.util.Calendar;

/**
 * switch ~ case에서 break 사용 <br>
 * break는 switch~case, for,while,do~while을 빠져나갈때 사용.
 * @author user
 *
 */
public class UseSwitchCase2 {
	//constant는 필드에만 정의 가능
//	public static final 데이터형 상수명 = 값;
	public static final int SUN = 0; 
	public static final int MON = 1; 
	public static final int TUE = 2; 
	public static final int GRADE_A_PLUS = 10; 
	public static final int GRADE_A = 9; 
	public static final int GRADE_B = 8; 
	public static final int GRADE_C = 7; 
	public static final int GRADE_D = 6; 
	public static final int MONKEY = 0;
	public static final int ROOSTER = 1;
	public static final int DOG = 2;	
	public static final int PIG = 3;
	public static final int MOUSE = 4;
	public static final int OX = 5;
	public static final int TIGER = 6;
	public static final int RABBIT = 7;
	public static final int DRAGON = 8;
	public static final int SNAKE = 9;
	public static final int HORSE = 10;
	public static final int GOAT = 11;

	

	public static void main(String[] args) {
		int i = 0;
		switch ( i ) {
		case 0: System.out.println("0케이스 실행");break; //switch~case를 빠져 나간다.
		case 1: System.out.println("1케이스 실행");
		case 2: System.out.println("2케이스 실행");
		case 3: System.out.println("3케이스 실행");break;
		default : System.out.println("일치하는 케이스 없음");
		}//end switch

		
		System.out.println("=============================");
		//switch~case의 가독성 향상.
		//case 0이면 일요일을 출력, case 1 월요일출력
		//case 3이면 화요일을 출력,
		//그외는 한주의 후반을 출력
	int dayOfWeek = 1;
	i = 0;
	
	switch( dayOfWeek ) {
	case UseSwitchCase2.SUN : System.out.println("일요일"); break;
	case UseSwitchCase2.MON : System.out.println("월요일"); break;
	case UseSwitchCase2.TUE : System.out.println("화요일"); break;
	default : System.out.println("주의 후반부");
	}
	
	int score = 70;
	char grade='\u0000'; // ' '값으로 유니코드값을 할당할 수 있다.
	System.out.println(grade);
	if(score<-1||score<101){	
			switch (score/10) {
		case GRADE_A_PLUS: 
		case GRADE_A: grade = 'A'; break;
		case GRADE_B: grade = 'B'; break;
		case GRADE_C: grade = 'C'; break;
		case GRADE_D: grade = 'D'; break;
		default : grade='F'	;
}//end switch
	System.out.println(score + "점은" + grade + "학점이다.");
	}
	System.out.println();
	int score2 = 90;
	char grade2=64; // ' '값으로 유니코드값을 할당할 수 있다.
	if(score2>-1&&score2<101){	
			switch (score2/10) {
		case GRADE_D: grade2++;
		case GRADE_C: grade2++;
		case GRADE_B: grade2++;
		case GRADE_A: 
		case GRADE_A_PLUS: grade2++; break;
		default : grade2='F'	;
}//end switch
	System.out.println(score2 + "점은" + grade2 + "학점이다.");
	}
	
	int year = 2022;
	System.out.print(year+"년은 ");
	switch(year%12) {
	case MONKEY : System.out.println("원숭이"); break;
	case ROOSTER :System.out.println("닭"); break;
	case DOG :System.out.println("개"); break;
	case PIG :System.out.println("돼지"); break;
	case MOUSE :System.out.println("쥐"); break;
	case OX :System.out.println("소"); break;
	case TIGER :System.out.println("호랑이"); break;
	case RABBIT  :System.out.println("토끼"); break;
	case DRAGON :System.out.println("용"); break;
	case SNAKE  :System.out.println("뱀"); break;
	case HORSE  :System.out.println("말"); break;
	case GOAT  :System.out.println("양"); break;

	}
	
	
	
	}
	}


