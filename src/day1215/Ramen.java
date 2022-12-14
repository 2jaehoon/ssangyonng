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
	public String pc = "-----PC에서는-----" , home = "-----집에서는------";
	
	/**
	 * 라면의 이름을 설정하는 method
	 * @param name 라면의 이름
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * 라면의 이름을 반환하는 method
	 * @return 라면의 이름
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * 면의 개수을 설정하는 method
	 * @param noodle 면의 개수
	 */
	public void setNoodle(int noodle) {
		this.noodle=noodle;
	}
	
	/**
	 * 면의 개수를 반환하는 method
	 * @return 면의 개수
	 */
	public int getNoodle() {
		return noodle;
	}
	
	/**
	 * 라면 스프의 개수를 설정하는 method
	 * @param powder 라면 스프의 개수
	 */
	public void setPowder(int powder) {
		this.powder=powder;
	}
	
	/**
	 * 라면 스프 개수를 반환하는 method
	 * @return 라면 스프의 개수
	 */
	public int getPowder() {
		return powder;
	}
	
	/**
	 * 다시마의 개수를 설정하는 method
	 * @param kelp 다시마의 개수
	 */
	public void setKelp(int kelp) {
		this.kelp=kelp;
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
	 * 집에서 라면을 먹는 행동 설정 method
	 * @return 집에서 라면 먹는 행동
	 */
	public String eat() {
		return  "나는 집에서 " + "면의 개수가 " + noodle + "이고 " +  
	" 라면 스프의 개수가 " + powder + "이고 " + "다시마 개수가 " + kelp + "인 " + name + "라면을 " + "먹는다.";
	}
	
	/**
	 * 밖에서 라면을 먹는 행동 설정 method
	 * @param place 라면을 사먹는 장소
	 * @param price 라면의 가격
	 * @return 밖에서 라면 먹는 행동
	 */
	public String eat(String place, int price) {
		return  "나는 " + place +" 에서 " + "가격이 " + price +  "면의 개수가 " + noodle + "이고 " +  
	" 라면 스프의 개수가 " + powder + "이고 " + "다시마 개수가 " + kelp + "인 " + name + "라면을 " + "먹는다.";
}
}
