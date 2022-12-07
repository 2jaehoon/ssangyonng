package day1206;
/**
삼항(조건 연산자)
 연산식 ? 항1 : 항2
*/


class Operator6 {
	public static void main(String[] args) {
		int i=-10;
		System.out.println(i+"는(은) " + (i > 0 ?"양수":"음수"));
		
		i=13;
		//i값이 홀수인지 짝수인지를 출력하는 코드 작성
		System.out.println(i%2!=0?"홀수":"짝수");

		char c = 'C';//a
		//c변수에 할당된 값이 대문자일 때에는 "대문자 알파벳" 그렇지 않으면 "대문자가 아닙니다."출력
		System.out.println((c>='A'&&c<='Z')?"대문자 알파벳":"대문자가 아닙니다.");
		System.out.println((c>64&&c<91)?"대문자 알파벳":"대문자가 아닙니다.");
		i=50;
		//i가 0~100 사이면 유효점수를 그렇지 않으면 무효점수를 출력
		System.out.println((i>=0&&c<=100)?"유효점수":"무효점수");
	
	

	
	}
}
