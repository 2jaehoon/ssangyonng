package day1219;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

/**
 * 기능을 사용하는 클래스
 * ssnProcsee가 제공하는 기능을 사용하고, 제공하는 기능 중 출력할 일이 있다면
 * 출력을 만든다.
 * @author user
 *
 */
public class UseSsnProcess {

	public static void main(String[] args) {
		//1. 주민번호를 입력 받아 인스턴스 변수에 저장하는 생성자를 만드세요.
		String ssn = "950101-1234567";
		SsnProcess sp = new SsnProcess(ssn);
		System.out.println(sp+ "객체가 가진 주민번호 " + sp.getSsn());
		String ssn2 = "950101-1234567";
		SsnProcess sp1 = new SsnProcess(ssn2);
		System.out.println(sp1+ "객체가 가진 주민번호 " + sp1.getSsn());
		//이렇게 할 거면 setter로 중복안되게 해라
		System.out.println("입력된 주민번호 : " + sp.getSsn());
		System.out.println(sp.lengthCheck());
		if(sp.lengthCheck()) {
			if(sp.dashCheck()) {
			System.out.println("-체크");
			System.out.println("생년월일 : " +sp.birth());
			System.out.println("나이 : " +sp.age());
			System.out.println("성별 : " +sp.gender());
			System.out.println("띠 : " +sp.zodiac());
			
			
			
			
			
			}else {
				System.out.println("'-'의 위치가 올바르지 않습니다.");
			}//end else
		}else{
			System.out.println("주민번호의 글자수를 확인해주세요.");
		}//end else
		

		
		
		
	
		
		
		

	}//main

}//class
