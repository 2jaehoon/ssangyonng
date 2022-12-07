package day1205;
class Promotion {
	public static void main(String[] args) {
		//int의 하위 데이터형이 연산되면 결과가 int로 나온다.
		byte num1 = 10;
		byte num2 = 20;
		//byte result = 0;  //byte의 연산결과가 int로 발생하기 떄문에 byte에 저장할 수가 없다.
		int result = 0;

		result = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + result);

		char c = 'A';//65
		char d = 'B';//66
		System.out.println(c + "+" + d + "=" + (c+d));

	}
}
