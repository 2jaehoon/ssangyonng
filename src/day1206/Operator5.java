package day1206;
/**
논리연산자
일반논리
&& (AND) :전항과 후항이 모두 참이면 참을 반환
|| (OR) : 전항과 후항이 모두 거짓이면 거짓 반환
비트논리
& : 상위비트와 하위비트 모두 1인경우 1내림
| : 상위비트와 하위비트 모두 0인경우 0내림
^ : 상위비트와 하위비트 둘중 하나만 1인경우 1내림
*/
class Operator5{
	public static void main(String[] args) {
		System.out.println(12 > 6 &&  12 < 2022);//두 관계연산자를 묶어서 처리
		System.out.println(12 > 6 ||  12 < 2022);//or로 두 관계연산자를 묶어서 처리

		boolean flag1=true,flag2=false,flag3=true, flag4=false;
		System.out.println("--------------and--------------------------");
		System.out.println(flag1+" && " + flag3 + " = " + (flag1 && flag3));
		System.out.println(flag1+" && " + flag2 + " = " + (flag1 && flag2));
		System.out.println(flag2+" && " + flag1 + " = " + (flag2 && flag1));
		System.out.println(flag2+" && " + flag4 + " = " + (flag2 && flag4));

		System.out.println("--------------or--------------------------");
		System.out.println(flag1+" || " + flag3 + " = " + (flag1 || flag3));
		System.out.println(flag1+" || " + flag2 + " = " + (flag1 || flag2));
		System.out.println(flag2+" || " + flag1 + " = " + (flag2 || flag1));
		System.out.println(flag2+" || " + flag4 + " = " + (flag2 || flag4));



		flag1=false;
		flag2=false;
		flag3=false;

		flag3= (flag1= 3 <2) && (flag2=5<6);//전항이 f이면 후항을 연산하지 않는다.
		System.out.println(flag1 + " && " + flag2 + " = " + flag3);



		//1.int i변수를 선언하고 임의의 수 할당
		//2. i변수가 1~100사이면 true를 출력하고 그렇지 않다면 false 출력

		int i =101;
		System.out.println(i>=1 && i<=100);

		//////////////////비트논리대입///////////////////////////
		System.out.println("비트논리대입----------------------------------------------");

		i=26;
		int j=0xf; //15
		System.out.println(i + "& " + j + "=" + (i&j));

		i=30;
		j=25;
		System.out.println(i + " | " + j + "=" + (i|j));
		//11110 | 11001  > 11111

		i=12;
		j=9;
		System.out.println(i + " ^ " + j + "=" + (i^j));
		//1100 ^ 1001 > 0101



	}
}
