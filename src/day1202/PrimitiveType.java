package day1202;
class PrimitiveType {
	public static void main(String[] args) {
		System.out.println("----정수형---------------------");
		byte a = 10; //-2의 7승~2의 7승-1
		short b = 20; //
		int c = 30;
		long d = 40;
	

		System.out.println("byte : " + a + " short : " + b + " int : " + c + " long : " + d);

		//e변수를 선언하고 24억을 할당해 보세요
		long e = 2_400_000_000L;        //long e = 2_400_000_000; 우측 값은 인트 리터럴 적용되므로 long 값 범위로 쓰려면 L추가 4byte > 8byte
		System.out.printf("%d\n",e);
		System.out.println("형명시 L :" + e);

		int ab = '안';
		System.out.printf("%d\n", ab);

		System.out.println("--------문자형---------------");
		char f = 'A';//유니코드 값이 할당
		char g = 57; //유니코드값 직접 할당
		System.out.println("char : " + f + ",  " + g); //유니코드값에 해당하는 문자 출력


		System.out.println("--------실수형---------------");
		float h = 2022.12f;//실수 리터럴에서 float에는 f 필수 8>4byte로 바뀜
		double i = 2022.12;//실수 리터럴 기본은 더블형과 같은 8byte 형명시 생략 가능
		double j = 2022.12d;


		System.out.println("float : " +h + ", double : " + j );
		System.out.println("--------불린형---------------");
		boolean k = true;
		boolean l = false;
		//boolean형은 true,false밖에 못옴 ㅋ
		System.out.println("boolean :" + k + ", " + l);

	

  }
}
