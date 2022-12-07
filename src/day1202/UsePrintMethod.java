package day1202;
/*
1. 소스코드 작성
*/

class UsePrintMethod {
	public static void main(String[] args) {
		/*System.out.print("출력 후 ");
		System.out.print("줄 변경 없음. ");
		System.out.print("Debug용도로 사용 ");
		System.out.println("출력 후 ");
		System.out.println("줄 변경 있음. ");
		System.out.println("Debug용도로 사용 ");*/
////////////////////////값(arguments) 에 대한 출력/////////////
		//정수 상수 : 
		
		System.out.println( 2022 );
		//실수 상수 :
		System.out.println( 2022.12 );
		//불린 상수 : 
		System.out.println( true );
		//문자 상수 : '로 묶여진 영문자 한 자, 숫자 한 자, 한글 한 자
		//'는 하나의 문자만 사용할 수 있다.
		System.out.println( 'A' );
		System.out.println( '1' );
		System.out.println( '가' );
		//System.out.println( 'abc' );
		//문자열 사수 : "로 묶여진 여러 글자들
		System.out.println( "오늘은 추운 금요일 입니다." );
		//연산 : 숫자는 연산의 결과가 출력
		System.out.println( 12+2 );
		//문자열에 + .연산을 사용하면 "붙임"의 의미
		System.out.println( 12+"2" );//122
		System.out.println( "12 + 2 = " + (12 + 2) );//14
		
		//


	}//main
}//class


//2. 파일저장 : 클래스명.java

//3. 컴파일 : javac 클래스명.java => ctrl + 1

//4. 실행 : java 바이트코드명 => ctrl + 2

