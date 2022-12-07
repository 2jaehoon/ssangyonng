package day1206;
import java.util.Scanner;
class Work1206 {

	public static void main(String[] args) {
		/*기본형 데이터형 8개
		char byte short int long float double boolean
		*/

		/*
		api문서 보는법
		패키지 선택하고 클래스 선택 후 필드나 메소드를 보면 됨 ㅇㅇ
		*/
		
		//char
		System.out.println("1번 문제 기본형 데이터형 8개 최대값 최소값");
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		//byte
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		//short
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		//int
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		//long
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		//float
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		//double
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		//boolean
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);






//2. 변수를 사용하여 년도를 저장하고 윤년인지 판단하는 코드.
//(4년마다 한번 윤년이지만 100년이면서 400년이면  윤년에서 제외) 
//Scanner scanner = new Scanner(System.in);
//int year = scanner.nextInt();
System.out.println();
System.out.println("2번 문제 윤년이 맞나 안 맞나");
int year = 2022;
System.out.println(year + "년은 " + (  ((year%4==0)&&((year%100==0)||(year%400!=0)))? "윤년입니다":"윤년이 아닙니다")   );





	}
}
