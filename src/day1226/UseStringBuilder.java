package day1226;

/**
 * 긴 문자열을 다루는 클래스
 * @author user
 *
 */
public class UseStringBuilder {
	public void useStringBuffer() {
		//1. 생성)
		StringBuffer sb = new StringBuffer(); //1. 기본생성자
		//2. 기능 사용)
		//값 추가
		sb.append("안녕하세요?");
		sb.append(2022);
		System.out.println(sb);//객체를 출력했는데 주소가 아닌 문자열이 출력
		//Object에 있는 toString()을 StringBuilder에서 Override 했기 떄문에
		System.out.println("6번째 문자 : " + sb.charAt(6));

		//값 삽입) 삽인되는 값을 문자열로 처리한다.
		sb.insert(6, "반장 김경태 ").insert(17, "년 입니다.");
		System.out.println(sb);
		
		//값 삭제 delete(시작 인덱스, 끝인덱스+1);
		sb.delete(13, 24).delete(6, 12);
		System.out.println(sb);
		
		//값 뒤집기 reverse
		sb.reverse();
		sb.reverse();
		System.out.println(sb);
		
	}//useStringBuffer
	public void useStringBuilder() {
		//1. 생성)
		StringBuilder sb = new StringBuilder(); //1. 기본생성자
		//2. 기능 사용)
		//값 추가
		sb.append("안녕하세요?");
		sb.append(2022);
		System.out.println(sb);//객체를 출력했는데 주소가 아닌 문자열이 출력
		//Object에 있는 toString()을 StringBuilder에서 Override 했기 떄문에
		System.out.println("6번째 문자 : " + sb.charAt(6));

		//값 삽입) 삽인되는 값을 문자열로 처리한다.
		sb.insert(6, "반장 김경태 ").insert(17, "년 입니다.");
		System.out.println(sb);
		
		//값 삭제 delete(시작 인덱스, 끝인덱스+1);
		sb.delete(13, 24).delete(6, 12);
		System.out.println(sb);
		
		//값 뒤집기 reverse
		sb.reverse();
		sb.reverse();
		System.out.println(sb);
		
	}//useStringBuilder

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		System.out.println("useStringBuffer---------------------------------------------------");
		usb.useStringBuffer();
		System.out.println("useStringBuilder---------------------------------------------------");
		usb.useStringBuilder();
		
		
	}//main

}//class
