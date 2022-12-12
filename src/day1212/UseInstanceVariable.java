package day1212;

/**
 * instance variable
 * 클래스로 객체를 생성하여 객체에 저장된 변수를 사용하는 방법.
 * 문법) 클래스명 객체명 = new 클래스명();
 * @author user
 *
 */
public class UseInstanceVariable {
	//non static field
	int  i;//instance variable => 객체가 생성된 후 사용할 수 있는 변수
	int  j;//instance variable
	

	public static void main(String[] args) {
		//class에 static 영역이 가장 먼저 실행된다.
		//i=12;//static 영역에서는 instance 변수를 직접 호출할 수 없다.
//		 문법) 클래스명 객체명 = new 클래스명();
		
		//객체화 : instance 변수를 사용하기 위해 heap 메모리에 올려놓는 과정.
		UseInstanceVariable uiv = new UseInstanceVariable();
		System.out.println("heap에 생성된 uiv 주소 : " + uiv);
		
		//instantiate 
		UseInstanceVariable uiv2 = new UseInstanceVariable();
		System.out.println("heap에 생성된 uiv2 주소 : " + uiv2);
		
		
		//instantiate variable는 객체를 통해서 사용할 수 있다.
		//객체마다 같은 이름의 인스턴스 변수를 가지고 있다.
		uiv.i=2022;
		uiv.j=12;
		
		uiv2.i=2023;
		uiv2.j=1;
		System.out.println(" uiv instance variable i : " + uiv.i);
		System.out.println(" uiv instance variable j : " + uiv.j);
		System.out.println(" uiv2 instance variable i : " + uiv2.i);
		System.out.println(" uiv2 instance variable j : " + uiv2.j);
	}//main

}//class
