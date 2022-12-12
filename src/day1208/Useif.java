package day1208;

/**
 * 단일 if의 사용.<br>
 * 조건에 맞을 때에만 코드를 실행해야 할 때.<br>
 * 문법) if(조건식){ <br>
 * 					조건에 맞을 때 수행할 문장들.... <br>
 * 				}
 * @author user
 *
 */
public class Useif {

	public static void main(String[] args) {
		
		//입력한 값의 절대 값 구하기
		int num = Integer.parseInt(args[0]); //필수코드
		
		//음수면 양수로 
//		코드는 반드시 실행과 선택적 실행으로 나눠짐 
		if(num < 0) {   
		num = -num;  //조건에 맞을 때에만 실행되는 선택적 코드
		}//end if
		
		System.out.println("입력값 : " + args[0] + ", 절대값 : " + num);  //필수코드
		
		
		//문자열은 equals로 같은지만 비교할 수 있다.
		System.out.println(args[1].equals("java"));
//		System.out.println(args[1]<10); //문자열은 대소비교가 안된다.
		System.out.println(args[1].equals("자바"));
		
		//args[2]에 입력값이 "java" 또는 "자바"일때만 "console에 완벽한 OOP언어.WriteOneRunAnywhere, 자동으로 관리되는 메모리" 
		//를 출력
		if(args[2].equals("java")||args[2].equals("자바")) {
			
			
		
			 System.out.println( "console에 완벽한 OOP언어.WriteOneRunAnywhere, 자동으로 관리되는 메모리" );
		}
		
		//args[0]의 값이 홀수 인지 짝수 인지 판별하여 출력하는 코드를 작성해보세요.
		System.out.print(num + "은(는) ");
		if(num %2 == 0) {
			System.out.println("짝수");
		}//end if
		if(num %2 == 1) {
			System.out.println("홀수");
		}//end if
		
		
		
	}//main

}//class
