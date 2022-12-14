package day1214;

/**
 * getter method, setter method가 도입된 클래스
 * 
 * 값 설정과 유효성 검증이 묶여있는 클래스
 * @author user
 *
 */
public class Work2 {

	private int age;
	
	/**
	 * 이 method를 통해서만 값을 설정할 수 있도록 만든다.
	 * 
	 * public void set변수명(설정할 변수){
	 * this.변수명 = 매개변수;
	 * }
	 * 사람의 나이는 100살을 초과할 수 없고. 100살이 초과된 나이가 입력되면
	 * 100살로 재설정한다.
	 * @param age 설정할 나이
	 */
	public void setAge(int age) {
		if(age > 100) {
			age = 100;
		}//end if
		this.age = age;
	}//setAge
	
	/**
	 * getter method : 객체가 가진 값(instance variable)을 반환하는 일
	 * @return member 변수에 설정된 값
	 */
	public int getAge() {
		return age;
	}
	
	
	
	
	/**
	 * 값에 대한 출력 => 항상 고정된 형식으로만 출력 => 사용자가 원하는 형태로 출력할 수 없다.
	 */
	public void useAge() {
		System.out.println(age + "살");
	}//useAge

	public static void main(String[] args) {
	
		
	}

}
