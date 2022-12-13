package day1213;

/**
 * 하나의 클래스에서 같은 이름의 method를 여러 개 정의하는 것
 * @author user
 *
 */
public class TestOverload {
//클래스에선 변수와 메쏘드밖에 사용 불가능하다.	


	
	
	
	/**
	 * ☆을 하나 출력하는 일
	 */
	public void printStar() {
		System.out.println("☆");
	}//printStar
	
	/**
	 * 입력되는 개수만큼 ★을 출력
	 * Overload(Overloading)
	 * @param cnt 출력할 별의 개수
	 */
	public void printStar(int cnt) {
		for(int i = 0; i <cnt; i++)
		System.out.print("★");
	}//printStars
	
	

	public static void main(String[] args) {
		//1. 객체화
		TestOverload to = new TestOverload();
		//2.method 호출
		//별 하나를 출력하는 method 호출
		to.printStar();
		//별 여러 개를 출력하는 method 호출
		to.printStar(5);
	
	}//main

}//class
