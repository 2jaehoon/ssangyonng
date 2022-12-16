package day1215;

/**
 * 라면을 대상으로 한 클래스 <br>
 * 명사적 특징 : 이름, 면의 개수, 스프 개수, 다시마 개수<br>
 * 동사적 특징 : 먹는 일
 * @author user
 *
 */
public class Ramen {
	private String name;
	private int noodle, powder, kelp;

	public Ramen() {
		//기본생성자에서는 자신이 생각하는 라면으로 기본 값을 설정해보세요
		this("신라면",1,2,0);
	}
	
	public Ramen(String name, int noodle, int powder, int kelp) {
		this.name = name;
		this.noodle = noodle;
		this.powder = powder;
		this.kelp = kelp;
	}
	
	/**
	 * 라면의 이름을 반환하는 method
	 * @return 라면의 이름
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 면의 개수를 반환하는 method
	 * @return 면의 개수
	 */
	public int getNoodle() {
		return noodle;
	}
	
	/**
	 * 라면 스프 개수를 반환하는 method
	 * @return 라면 스프의 개수
	 */
	public int getPowder() {
		return powder;
	}

	/**
	 * 다시마의 개수를 반환하는 method
	 * @return 다시마의 개수
	 */
	public int getKelp() {
		return kelp;
	}
	
	/**
	 * overloading
	 * 라면의 상태 꼬들꼬들 설정 method
	 * @return 집에서 라면 먹는 행동
	 */
	// method는 기능입니다. 라면이 제공하는 기능으로 추상화를 해서 구현해야하는데
	//라면 이 스스로를 먹을 수 는 없잖아요?
	//라면이 제공하는 기능 : 라면의 상태, 꼬들꼬들, 불어터짐?
	public String state() {
		return   "면의 개수가 " + noodle + "개이고" +  
	" 라면 스프의 개수가 " + powder + "개이고 \n" + "다시마 개수가 " + kelp + "개인 " + name + " 라면이 " + "꼬들꼬들하다.";
	}
	
	/**
	 * 라면의 상태 불어터짐 method
	 * @param place 
	 * @param price 
	 * @return 
	 */
	public String state(String state) {
		return  "면의 개수가 " + noodle + "개이고" +  
	" 라면 스프의 개수가 " + powder + "개이고 \n" + "다시마 개수가 " + kelp + "개인 " + name + " 라면이 " +state;
}
}
