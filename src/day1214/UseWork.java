package day1214;

/**
 * Work를 사용하는 클래스
 * 
 * @author user
 *
 */
public class UseWork {

	public static void main(String[] args) {
		// 1. Work의 객체를 생성
		Work work = new Work();
		// 2. 나이를 외부설정 => 문제 : 나이와 나이의 제한이 따로 논다.
		work.age = 200;
		//나이에 대한 제약을 설정할 수 있다.=> 과연 몇 번이나 만들어야 할까?
		if (work.age > 100) {
			work.age = 100;
		}
		// 3.제공하는 기능 사용
		work.useAge();
		///////////새로운 객체 ////////////////////////////
		Work work1 = new Work();
		//클래스 외부에서 값을 변경하면
		work1.age = 80;
		//새로운 객체가 생성될 때마다 유효성 검증을 수행해야 한다. !!!!!!!!!!!!중복코드 오지게 발생
		if (work1.age > 100) {
			work1.age = 100;
		}
		
		work1.useAge();
		
		////////////////Work2 사용 => setter method를 사용한 값 설정/////////
		//1. 객체 생성
		Work2 w2 = new Work2();
		//2. setter method를 사용하여 값 설정
		w2.setAge(10); //유효성 검증에 해당되지 않는 값
		w2.useAge();//출력의 형식이 고정되어 있다.
		w2.setAge(110); //유효성 검증에 해당하는 값
		w2.useAge();
		
		//3. getter method를 사용한 값 받기
		// 다양한 형식으로 출력할 수 있다.
		System.out.println("설정된 나이는 : " + w2.getAge() + "세 입니다.");
		System.out.println("<b>" + w2.getAge() + "</b>");
		
	}// main

}// class
