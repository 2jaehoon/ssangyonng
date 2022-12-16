package day1215;

//import java.util.Scanner;

/**
 * Ramen의 클래스를 사용하는 클래스
 * @author user
 *
 */
public class UseRamen {

	public static void main(String[] args) {
		//1. 객체 설정 (값 설정을 생성자에서 다함)
		Ramen sinramen = new Ramen("신라면",1,2,0);   ///이 변수들 힙에 저장되는 건지??
		Ramen nuguri = new Ramen("너구리",1,2,1);
		Ramen ansungtangmen = new Ramen("안성탕면",1,1,0);	
		
		//신라면

		System.out.println(sinramen.state());
		System.out.println(sinramen.state("불어터지다"));  ///이 변수들 힙에 저장되는 건지??
		
	
		//너구리
		
		System.out.println(nuguri.state());
		System.out.println(nuguri.state("불어터지다"));
		
		
		//안성탕면
		System.out.println(ansungtangmen.state());
		System.out.println(ansungtangmen.state("불어터지다"));
		
			
		
		
	
		

	}

}
