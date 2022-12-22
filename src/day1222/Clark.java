package day1222;

/**
 * 눈, 코, 입, 먹는 일은 Person클래스에서 사용 힘이 쎈 자신만의 특징 구현.
 * 날기위한 업무는 Fly interface에서 구현(종류가 다른 일을 할 수 있다.)
 * 힘이 쏀 자신만의 특징 구현
 * final 클래스는 상속을 할 수 없는 클래스로 사용하는 클래스에서는 제공되는 기능의 변경하지
 * 못하고 그대로 사용만 할 수 있는 상태가 된다.
 * @author user final
 */
public final class Clark extends Person implements Fly{
	public int power;

	/**
	 * 클락의 기본 생성자 힘, 일반인 3, 헬창 5, 클락 8을 가진다.
	 */
	public Clark() {
		power = 8;
	}// Clark

	@Override
	public String[] language() {
		String[] lang = "영어, 외계어".split(",");
		return lang;
	}

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

	
	
	
	@Override
	public String eat(String menu, int price) {
		String result = getName() + "이 레스토랑에서 " + menu + "인 음식을 " + price +  "$ 내고 사먹는다.";
		
		return result;
	}
	
	@Override
	public String eat() {
		String result = getName() + "이 집에서 빵을 먹는다.";
		
		return result;
	}

	@Override
	public String drivingForce() {
		String result = "무릎을 꿇어서 추진력?";
		return result;
	}

	@Override
	public String upwardForce() {
		String result = "망토";
		return result;
	}
	
	
	
}//class