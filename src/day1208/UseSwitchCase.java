package day1208;

/**
 * 모든 값을 비교하는 if
 * 
 * 일치하는 정수를 비교할 때 사용하는 switch case 문법) switch (변수명) { case 상수 : 변수값이 상수와 같을 때
 * 실행문장들; case 상수 : 변수값이 상수와 같을 때 실행문장들; case 상수 : 변수값이 상수와 같을 때 실행문장들;
 * 
 * 
 * 
 * default : 변수 값이 상수와 case에 준비된 상수와 같은 값이 없을 때 실행 문장..; }
 * 
 * @author user
 *
 */
public class UseSwitchCase {

	public static void main(String[] args) {
		int i = -32768; //byte, short, int는 입력가능, .long 은 입력 불가

		switch (i) {// switch 입력되는 변수는 byte, short, int, char JDK1.7부터는 String도 사용 가능)
		
		//case 상수는 입력되는 데이터형의 범위까지만 기술 가능하다.
		case 0:
			System.out.println("0 case 실행");
		case 1:
			System.out.println("1 case 실행");
		case 2:
			System.out.println("2 case 실행");
		case 3:
			System.out.println("3 case 실행");
		default:
			System.out.println("일치하는 case의 상수가 없을 때 실행.");

		}// end switch
		
		
		
		System.out.println("-------------------");
		char c = 65;
		switch ( c ) {
		//char형이 입력되면 case에 문자 또는 유니코드를 사용할 수 있다.
		case 'A': System.out.println("입력문자 A");
		case 'B': System.out.println("입력문자 B");
		case 67: System.out.println("입력문자 C");
		default : System.out.println("준비된 상수 없음");
		}//end switch
		System.out.println("-------------------");
		
		String str = "VB";
		switch( str ){ //JDK1.7 이상일때만 가능
		case  "Java" : System.out.println("완벽한 oop언어"); break;
		case  "C" : System.out.println("절차지향 프로그래밍"); 
		case  "C++" : System.out.println("C언어를 개선한 언어"); break; 
		case  "VB" : System.out.println("컴포넌트 프로그래밍"); break;
		default : System.out.println("준비된 언어가 없음.");
		}
		
		

	}

}
