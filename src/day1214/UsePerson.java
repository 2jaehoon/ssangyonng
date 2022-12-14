package day1214;

/**
 * Person 클래스를 사용하는 클래스
 * @author user
 *
 */
public class UsePerson {

	public static void main(String[] args) {
		//1. 객체화
		Person ogong = new Person();
		//2. 값 설정
		ogong.setEye(2);
		ogong.setMouth(1);
		ogong.setName("손오공");
		ogong.setNose(1);
		//3. 기능 사용
		System.out.println(ogong.eat());
		System.out.println(ogong.eat("국밥", 9000));
		
		
		//자신 이름의 객체를 생성하고, 좋아하는 음식을 먹어보세요.
		//1. 객체 생성
		Person jaehoon = new Person();
		//2. 값 설정
		jaehoon.setEye(2);
		jaehoon.setMouth(1);
		jaehoon.setName("이재훈");
		jaehoon.setNose(1);
		//3. 기능 사용
		System.out.println(jaehoon.eat());
		System.out.println(jaehoon.eat("치킨", 18000));

	}//main

}//class
