package day1202;
/*
	class 클래스명{
	클래스명 : 클래스 안에서 하는 일을 알 수 있도록 영어 단어로 설정.
	-UseLocalVariable : Camelcase(낙타체) - 단어의 첫 문자마다 대문자로 작성하는 방법.
	-Uselocalvariable : pascalcase(파스칼체) - 단어의 첫 문자만 대문자로 작성하고 나머지는 소문자로 작성하는 방법. 

}

지역 변수의 사용법.
메소드안에서 선언하고, 메소드 내부에서만 사용하는 변수
자동초기화가 되지 않는다.(초기화 되지 않은 변수는 사용 error)
메소드가 호출되면 메모리에 로드되고 메소드 호출이 끝나면 메모리에서 언로드된다.
(메소드가 호출될 때마다 계속 만들어진다.)
*/

class UseLocalVariable{
	public static void main(String[] args) {
		//1. 선언 >데이터형 변수명;
		int i;
		//2. 값할당 >변수명=값;
		i=12;
		//3. 사용(초기화나 값할당x >>error) >출력, 재할당, 연산
		System.out.println(i);

		//2. 값할당> 값 할당을 여러번 할 수 있다.(이전값xㅡ 새로운 값)
		i=2022;
		System.out.println(i);
		//동일영역에서는 같은 이름의 변수를 하나만 선언할 수 있다.


		//////////변수의 초기화//////////
		//선언하면서 값을 할당하는 것.
		//문법 ) 데이터형 변수명 = 초기값;
		int j = 0;
		System.out.println(j);

		//자바는 16bit 언어이므로 이름에 한글을 넣어서 작성할 수 있다. => 저세상
		int 오늘의일자 = 2;
		System.out.println(오늘의일자);


		//////////변수의 가독성//////////////////////////
		System.out.println(100-86); //실행은 되나 가독성 0
		int MaxScore=100;//최고점
		int MyScore=86;//내점수
		System.out.println(MaxScore-MyScore);//최고점에서 내점수를 뺀 코드
		//변수이름은 a,b xxxxxxxxxxxxx
		//변수 첫글자는 소문자로
		//1.올해를 저장하는 변수를 만들고 올해를 할당한다.
		int currentYear = 2022;
		//2.나이를 저장하는 변수를 선언하고 자신의 나이를 할당한다.
		int currentAge = 26;
		//3.태어난 해를 저장하는 변수를 선언하고 올해에서 나이를 빼고 +1의 연산을 수행한 결과를 할당한다.\
		int yearOfBorn = currentYear - currentAge + 1;
		//4.태어난 해를 출력
		System.out.println(yearOfBorn);

	}//main
}//class
