package day1221;

/**
 * 눈, 코, 입, 먹는 일은 Person클래스에서 사용 힘이 쎈 자신만의 특징 구현.
 * 
 * @author user final
 */
public class Clark extends Person {
	public int power;

	/**
	 * 클락의 기본 생성자 힘, 일반인 3, 헬창 5, 클락 8을 가진다.
	 */
	public Clark() {
		power = 8;
	}// Clark

	public String power(String stone) {
		String result = "";
		
		if(stone.equals("다이아몬드")) {
			result = "감사합니다. ^ㅇ^ ";
			power = 10;
		}else if(stone.equals("크립토나이트")) {
			result = "힘 빠져 ~(_0_)~";
			power = 0;
		}else {
			result = "기분 나쁨 ㅡㅡ++";
			power=12;
		}//end else
		return result;
	}// power
	
	//자식만의 특징

	
	
	public String eat() {
		String result = "";
		
		return result;
	}
	
	public String eat(String menu, int price) {
		String result = "";
		
		return result;
	}
	
	
	
	
}//class