package day1222;

/**
 * Person 클래스를 사용하는 클래스
 * @author user
 *
 */
public class UsePerson {

	public static void main(String[] args) {
		
		HongGilDong hgd = new HongGilDong();
		//코드의 재사용성 : 부모의 method 사용
		hgd.setName("홍길동");
		System.out.printf("눈 %d  코 %d 입 %d 이름 %s\n", hgd.getEye(), hgd.getNose(), hgd.getMouth(), hgd.getName());
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("뜨끈한 국밥",8000));
		
		//자신만의 특징
		System.out.println(hgd.fight(5)); //6>7 홍길동의 기본레벨은 6이기에 레벨업함
		System.out.println(hgd.fight(6)); //7>8
		System.out.println(hgd.fight(9)); //8>7 져서 레벨이 깎임
		System.out.println(hgd.fight(7)); //비김
		
		System.out.println("----------------------------------------------");
		Clark superman =  new Clark();
		//코드의 재사용성 : 부모클래스의 자원을 자식에서 사용하는 것.
		superman.setName("클락");
		System.out.printf("눈 %d  코 %d 입 %d 이름 %s\n", superman.getEye(), superman.getNose(), superman.getMouth(), superman.getName());
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크",10));
		
		//자식만의 특징
		String stone = "짱돌";
		System.out.println(stone + "을 던지면 " + superman.power(stone) + "슈퍼맨 파워 : " + superman.power);
		stone = "다이아몬드";
		System.out.println(stone + "을 던지면 " + superman.power(stone)+ "슈퍼맨 파워 : " + superman.power);
		stone = "크립토나이트";
		System.out.println(stone + "을 던지면 " + superman.power(stone)+ "슈퍼맨 파워 : " + superman.power);
		//인터페이스에서 제공하는 method를 구현하여 사용
		System.out.println(superman.getName() + "의 추진력?" + superman.drivingForce());
		System.out.println(superman.getName() + "의 양력?" + superman.upwardForce());
		
		
		System.out.println("-----------------------------------------------------");
		
		//재훈
//		Jaehoon jaehoon = new Jaehoon();
//		jaehoon.setName("이재훈");
//		System.out.printf("눈 %d  코 %d 입 %d 이름 %s\n", jaehoon.getEye(), jaehoon.getNose(), jaehoon.getMouth(), jaehoon.getName());
//		int effortScore = 30;
//		System.out.println("노력점수가 " + effortScore + "이면 " + jaehoon.effort(effortScore));
//		effortScore = 50;
//		System.out.println("노력점수가 " + effortScore + "이면 " + jaehoon.effort(effortScore));
//		effortScore = 70;
//		System.out.println("노력점수가 " + effortScore + "이면 " + jaehoon.effort(effortScore));
//		effortScore = jaehoon.effortScore;
//		System.out.println("노력점수가 " + effortScore + "이면 " + jaehoon.effort(effortScore));
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println(hgd.getName()+"이 구사하는 언어");
		for(String lang : hgd.language()) {
			System.out.print(lang + " ");
		}//end for
		System.out.println("");
		
		System.out.println(superman.getName()+"이 구사하는 언어");
		for(String lang : superman.language()) {
			System.out.print(lang + " ");
		}//end for
		
		
		

	}//main

}//class
