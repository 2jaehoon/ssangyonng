package day1213;

/**
 * V.A가 도입된 console 출력 method
 * 출력문자와 출력되는 값은 갯수와 데이터형이 같아야 한다.
 * @author user
 *
 */
public class UsePrintf {

	public static void main(String[] args) {
		
		//정수 출력
		System.out.printf("[%d][%7d][%-5d]\n", 2022, 2023,102);
		for(int i=100; i<1200; i+=100) {
			System.out.printf("[%-6d]\n", i);
		}
		
		//실수 출력
		System.out.printf("[%f][%.3f][%8.2f][%-7.1f]\n\n", 12.345,12.34567891, 12.345667, 12.345);
		
		//문자 출력
		System.out.printf("[%c][%4c][%-4c]\n\n",'A','B','C');
		
		//문자열 출력
		System.out.printf("[%s][%7s][%-7s]\n\n","안녕하세요","Java","자바");
		
		System.out.printf("오늘은 %d년 %d월 %d일 오늘의 날씨는 %s\n\n", 2022, 12, 13, "흐리고 눈");
		
		

	}//main

}//class
