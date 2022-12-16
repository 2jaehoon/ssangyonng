package day1216;

/**
 * String 상수 (문자열 저장소)의 주소를 저장하는 데이터형 java.lang.String의 사용
 * @author user
 *
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식 : new를 사용하지 않음, String str = "문자열상수";
		String str = "ABcDE";
		
		
		//참조형 형식 : new를 사용 String str = new String("문자열상수");
		String str1 = new String("ABcDE");
		
		System.out.println("기본형 형식 == 비교 : " + (str == "ABcDE")); //같지
		System.out.println("참조형 형식 == 비교 : " + (str1 == "ABcDE")); //다르지 힙의 주소랑 비교를 하는 거니깐 문자열 주소랑
		
		
		System.out.println("기본형 형식 equals 비교 : " + (str.equals("ABcDE"))); //같지
		System.out.println("참조형 형식 equals 비교 : " + (str1.equals("ABcDE"))); //힙에 있는 주소와 문자열 주소랑 비교를 하니깐 같다.
		
		
	
		
		
		
		
	}//main

}//class
