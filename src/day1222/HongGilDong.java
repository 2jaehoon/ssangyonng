package day1222;

/**
 * 사람의 공통 특징은 Person클래스에서 사용하고(코드의 재사용성) 홍길동 class는 자신만의 특징인 
 * 싸움하는 일을 구현한다.
 * @author user
 *
 */
public class HongGilDong extends Person {

	private int level;
	
	
	/**
	 * 홍길동의 기본 생성자
	 * 싸움의 레벨을 6으로 설정
	 * 싸움고수 10의 레벨을 가짐, 일반인은 3정도 가진다.
	 */
	public HongGilDong() {
		level=6;
		
	}//HongGilDong
	
	public String fight(int level) {
		String result = "";
		if(this.level>level) {//이김
			result = "이겼다. s('. ^)V";
			this.level++;
			if(this.level>10) {
				this.level=10;
			}//end if
		}else if(this.level<level) {//짐
			result = "졌다 ㅠㅠㅠㅠ";
			this.level--;
			if(this.level<1) {
				this.level=1;
			}
		}else {//비김
			result = "ㅡㅡ+";
		}//end elsㄷ	
		return result;
	}//fight
	
	public int getLevel() {
		return level;
	}
	
	@Override
	public String[] language() {
		String[] lang = {"한국어", "만주어", "수어"};
		
		return lang;
	}

	public String eat() {
		String result = getName() + "이 집에서 밥을 먹는다";
		
		return result;
	}
	
	@Override
	public String eat(String menu, int p) {
		//부모클래스의 getName 메소드를 사용한다.
		return getName() + "이 주막에서 " + menu + " 인 음식을 " + p + " 푼 내고 사먹는다.";
	}
	
	
	
}//class
