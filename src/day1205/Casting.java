package day1205;
/*
강제형변환
개발자가 원하는 데이터형으로 일시적인 변환을 수행하는 것





*/



class Casting{
	public static void main(String[] args) {
		byte num1 = 10;
		byte num2 = 20;
		byte result  = 0;

		result = (byte)(num1 + num2);

		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

		char c = 'A';
		System.out.println("문자 "+c+"의 유니코드값 "+(int)c);
		int i = 97;
		System.out.println("유니코드 "+i+"의 문자 값 "+(char)i);


		//값손실 발생
		float f = 2022.12f;
		i=(int)f;
		System.out.println("값 손실 원본 : "+ f+ ", 강제형변환한 값 : " +i);


		double d=5.5555555555555;
		f=(float)d;
		System.out.println("값 손실 원본 : "+ d+ ", 강제형변환한 값 : " +f);


		//boolean은 다른 형으로는 강제형변환 되지 못한다.
		boolean b = true;
		System.out.println((boolean)b); //error는 발생x 효과x
		
		//기본형은 참조형으로 강제형변환되지 못한다.

		
		//String str = (String)i; //기본형을 참조형으로 Casting
		String str = "2022";
		//i=(int)str; //참조형(String)을 기본형(int)로 Casting

	}
}
