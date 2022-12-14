package day1214;

/**
 * 마카펜 클래스를 객체로 사용하는 클래스<br>
 * @author user
 *
 */
public class UseMarker {

	/**
	 * Java Application : 다독으로 실행할 수 있는 프로그램
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args);
		//1.마카펜 클래스로 객체 생성
		Marker black = new Marker();
		//생성된 마카펜 객체가 가지고 있는 변수에 값을 설정.
		//black.cap=1;//private 직접 접근 불가 > setter method
//		black.setCap(100);
		//2. 생성된 객체에 값 설정
		black.setCap(100);
		black.setBody(2);
		black.setColor("검은색");
		//3.동사적인 특징을 구현한 method 호출 => 객체가 제공하는 일을 사용.
		System.out.printf("%s, 뚜껑 %d개, 몸체 %d개, 색깔 %s\n","생성된 마카펜 객체의 설정값", black.getCap(), black.getBody(), black.getColor());
		
		//3.동사적인 특징을 구현한 method 호출 => 객체가 제공하는 일을 사용.
		System.out.println(black.write("안녕하세요?"));
		
		// 빨간색 마카펜 객체를 생성하고 "안녕 자바" 써보세요.
		//1.객체 생성
		Marker red = new Marker();
//		2. 값 할당
		red.setCap(2);
		red.setBody(1);
		red.setColor("빨간색");
//      3.객체사용.
		System.out.println(red.write("안녕 자바"));
		
		
	}//main

}//class
