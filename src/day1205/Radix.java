package day1205;
/*
다양한 진수의 사용
수 - 10진수
0수 - 8진수
0X수 - 16진수
*/

class Radix{
  public static void main(String[] args) {
		
		int num1=10;//10진수    int는 4byte기 떄문에 메모리에 저장되는 값이 0000  0000   0000   1010이여야만 함
		int num2=012;//8진수
		int num3=0xa;//16진수

		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
		//사용한 진수가 달라고 2진수로 저장되고 2진수로 연산되어 10진수로 결과를 내어준다.
		System.out.printf("%d %d %d\n",num1, num2, num3);

		//num2=09; 8진수는 7까지만 사용가능
		//전화번호 저장 => 정수형은 전화번호를 저장할 수 없다.
		//int tel=01012345678; //error 또는 10진수로 결과가 나온다.
		//System.out.println(tel);

		int i=300;
		//출력은 1을 만나면 출력. (1앞에 0은 생략)
		System.out.println(i+"를 2진수로 " + Integer.toBinaryString(i));  //클래스.메쏘드(인수) 인티저ㅇ.ㅇ
		System.out.println(i+"를 8진수로 " + Integer.toOctalString(i)); //클래스.메쏘드(인수)
		System.out.println(i+"를 16진수로 " + Integer.toHexString(i)); //클래스.메쏘드(인수)

	}
}
