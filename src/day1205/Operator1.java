package day1205;
/*
단항연산자 : 연산에 필요한 항이 하나인 연산자.

~, !,+, -, ++, --

사용법)
연산자 대상체(전위연산)
대상체 연산자(후위연산)

*/

class Operator1 {
	public static void main(String[] args) {
		
		int i = 12;
		int j = -12;
		
		System.out.println("~" + i + " = " + ~i); //~양수 : 부호변경 1감소
		System.out.println("~" + j + " = " + ~j); //~음수 : 부호변경 1감소

		boolean flag1 = true;
		boolean flag2 = false;

		System.out.println("!" + flag1 + " = " + !flag1); //true > false
		System.out.println("!" + flag2 + " = " + !flag2); //false > true

		System.out.println(!(12 > 5)); //!숫자 앞에 사용할 수 없다.

		//+ : 형식적 제공
		System.out.println("+" + i + " = " + +i); //+12
		System.out.println("-" + i + " = " + -i); //-12

		//- : 2의 보수 연산(부호 바꿈 연산) : 값은 그대로이고 부호만 변경
		System.out.println("-" + i + " = " + -i); //-12
		System.out.println("-" + j + " = " + -j); //12

		//++ 증가연산, --감소연산
		++i;//12 => 13
		i++;//13 => 14
		System.out.println("증가연산 후 i = " + i);

		--i; //14 => 13
		i--; //13 => 12
		System.out.println("감소연산 후 i = " + i);

		//대입 연산자와 함께 사용되면 전위와 후위가 다른값을 대입한다.
		int result = 0;
		//전위 : 내 것 먼저 (연산 후 대입)
		result = ++i;
		System.out.println("전위 연산후 result = " + result + ", i = " + i);
		result = 0;
		//후위 : 남의 것 먼저(대입 후 연산)
		result = i++;
		System.out.println("후위 연산후 result = " + result + ", i = " + i);

		//메소드에 할당 될 때도 같다.
		System.out.println("전위 : " + ++i); //14에서 15로 증가한 후 출력
		System.out.println("후위 : " + i++); //15를 먼저 출력한 후 16으로 증가
		System.out.println("i의 현재값 : " + i);

		

	}
}
