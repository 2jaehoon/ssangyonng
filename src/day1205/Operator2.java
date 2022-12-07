package day1205;
/*
산술연산자
+, -, *, /, %
*/




class Operator2 {
	public static void main(String[] args) {
		
	int i = 11;
	int j = 3;
	double d = 3;//3.0으로 들어간다.

	//정수 / 정수 = 정수 > casting하여 처리
	System.out.println(i + " / " + j + " = " + (double)i / j);

	//정수 / 실수 = 실수
	System.out.println(i+ " / " + d + " = " + i / d);


	// % - 나눈 나머지 얻기 (큰 수를 몇가지의 작은 수로 만들 때 사용)
	// 큰수 % 발생할 수 = 발생할 수 안에서 값이 나온다.
	i=166;
	System.out.println(i+"%2"+"="+i%2); //0,1만 나옴
	System.out.println(i+"%4"+"="+i%4); //0,1,2,3만 나옴

	//자신이 태어난 해를 변수로 선언하고, 태어난 해를 할당.
	//태어난 해를 12가지의 수 중 하나로 나올 수 있게 코드를 작성해보세요.0~11
	int yearofBorn = 1997;
	System.out.println(yearofBorn+"%12"+"="+yearofBorn%12);
	//0 원숭 1 닭 2 개 3 돼지 4 쥐 5 소 6 호랑 7 토끼 8 용 9 뱀  10 말 11 양





	}
}
