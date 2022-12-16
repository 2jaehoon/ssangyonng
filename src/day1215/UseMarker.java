package day1215;

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
		//1.마카펜 클래스로 객체 생성, 기본 생성자로 객체가 생성될 때 할당 되어야 할 값이 들어간다.
		Marker black = new Marker();
		//2. 생성자로 이미 값 설정 했음
		//3.동사적인 특징을 구현한 method 호출 => 객체가 제공하는 일을 사용.
		System.out.printf("%s, 뚜껑 %d개, 몸체 %d개, 색깔 %s\n","생성된 마카펜 객체의 설정값", black.getCap(), black.getBody(), black.getColor());
		
		//3.동사적인 특징을 구현한 method 호출 => 객체가 제공하는 일을 사용.
		System.out.println(black.write("안녕하세요?"));
		
		// 빨간색 마카펜 객체를 생성하고 "안녕 자바" 써보세요.
		//오버로딩
		//1.객체 생성 
		Marker red = new Marker(1,1,"파란색");
		//2.생성자로 이미 값 설정했음 
//      3.객체사용. : getter method
		System.out.println(red.write("안녕 자바"));
		
		
	}//main

}//class
