package day1201;     //이클립스는 패키지 단위로 정해지기 때문에 무조건 패키지로 사용
//여러 패키지를 적용할 떄는 드래그해 src에 넣고 다시 패키지에 붙이고 yes to all적용
//1. Source Code 작성
public class Hello{  //클래스에 퍼블릭을 붙히기!!!!!!!!!!!!!!!!!!!!메인으로 사용할꺼면? 세모표시 삭제
	//Java Application 단독으로 실행될 수 있는 프로그램을 작성할 때 main method정의 
	public static void main(String[] args){

		System.out.println("안녕 Java !");
		System.out.println("오늘은 12월 1일입니다. ");
	}//main
}//class
//Il1 0O

//2. 저장 : 클래스명.java  Hello.java

//3. 컴파일 : 소스코드가 보이는 경로에서 javac Hello.java

//4. 실행 : bytecode를 가지고 있는 가장 외부패키지가 보이는 경로에서 java Hello