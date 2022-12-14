package day1214;

/**
 * 사람을 대상으로 구현한 클래스 명사적 특징 : 눈, 코, 입, 이름 동사적 특징 : 먹는 일
 * 
 * @author user
 *
 */

public class Person {

	private int eye, nose, mouth;
	private String name;

	/**
	 * 생성된 사람 객체의 눈 개수를 설정하는 일
	 * 
	 * @param eye 설정할 눈의 개수
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye

	/**
	 * 생성된 사람 객체의 눈 개수를 반환하는 일
	 * 
	 * @return 눈의 개수
	 */
	public int getEye() {
		return eye;
	}//getEye

	/**
	 * 생성된 사람 객체의 코 개수를 설정하는 일
	 * 
	 * @param nose 코의 수
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}//setNose

	/**
	 * 생성된 사람 객체의 코 개수를 반환하는 일
	 * 
	 * @return 코의 수
	 */
	public int getNose() {
		return nose;
	}//getNose

	/**
	 * 생성된 사람 객체에 설정된 입 개수를 설정하는 일
	 * @param mouth 입 개수
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setMouse
	
	/**
	 * 생성된 사람 객체에 설정된 입 개수를 반환하는 일
	 * @return 입 개수
	 */
	public int getMouth() {
		return mouth;
	}//getMonse
	
	
	/**
	 * 생성된 사람 객체에 이름을 설정하는 일
	 * @param name 사람 이름
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	
	/**
	 * 생성된 사람 객체에 이름을 반환하는 일
	 * @return 사람 이름
	 */
	public String getName() {
		return name;
	}//getName
	
	
	/**
	 * 생성된 사람 객체가 집에서 밥을 먹는 일
	 * @return 집 밥을 먹는 행동
	 */
	public String eat() {
		return name + "이 집에서 밥을 먹는다.";
	}//eat
	
	/**
	 * 생성된 사람 객체가 밖에서 밥을 먹는 일
	 * method overload
	 * @param menu 음식의 종류
	 * @param price 음식의 가격
	 * @return 밖에서 사먹는 행동
	 */
	public String eat(String menu, int price) {
		return name  + "이 식당에서 " + menu + "인 음식을 " + price + "원 내고 사먹는다.";
	}
	
	
	
	
	

}// class
