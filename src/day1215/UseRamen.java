package day1215;

import java.util.Scanner;

/**
 * Ramen의 클래스를 사용하는 클래스
 * @author user
 *
 */
public class UseRamen {

	public static void main(String[] args) {
		//1. 객체 설정
		Ramen sinramen = new Ramen();
		Ramen nuguri = new Ramen();
		Ramen ansungtangmen = new Ramen();
		
		//2. 값 설정
		
		//신라면
		sinramen.setKelp(0);
		sinramen.setName("신라면");
		sinramen.setNoodle(1);
		sinramen.setPowder(2);
		//너구리
		nuguri.setKelp(1);
		nuguri.setName("너구리");
		nuguri.setNoodle(1);
		nuguri.setPowder(2);
		//안성탕면
		ansungtangmen.setKelp(0);
		ansungtangmen.setName("안성탕면");
		ansungtangmen.setNoodle(1);
		ansungtangmen.setPowder(1);
		
		//3. 기능 사용
		System.out.print("1번 신라면   2번 너구리   3번 안성탕면 번호를 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		//1 신라면
		//2 너구리
		//3 안성탕면
		switch(num){
		//신라면
		case 1:
		System.out.println(sinramen.home);
		System.out.println(sinramen.eat());
		System.out.println(sinramen.pc);
		System.out.println(sinramen.eat("PC방", 2500));
		break;
		//너구리
		case 2:
		System.out.println(nuguri.home);
		System.out.println(nuguri.eat());
		System.out.println(nuguri.pc);
		System.out.println(nuguri.eat("PC방", 2800));
		break;
		//안성탕면
		case 3:
		System.out.println(ansungtangmen.home);
		System.out.println(ansungtangmen.eat());
		System.out.println(ansungtangmen.pc);
		System.out.println(ansungtangmen.eat("PC방", 2400));
		break;
		default :
			System.out.println("라면의 종류가 틀립니다. 다시 번호를 눌러주세요");
		}
		
		
	
		

	}

}
