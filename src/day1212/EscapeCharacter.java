package day1212;

/**
 * 특수문자의 사용
 * \문자 의 형식으로 사용하는 기능을 가진 문자들.
 * 
 * @author user
 *
 */
public class EscapeCharacter {

	public static void main(String[] args) {
		
		//콘솔에 안녕하세요?를 한 번 출력
		System.out.println("안녕하세요?");
		System.out.println("'안녕하세요?'");
		System.out.println("\"안녕하세요?\""); //"는 문자열의 시작과 끝을 표현하는 기호 \"를 사용하면 "가 문자로 나옴
		System.out.println("안녕\t하세요?");
		System.out.println("안녕\r하세요?");//Windows는 \r이나 \n 동일 동작수행
		System.out.println("안녕\n하세요?");//Linux는 \n만 존재
		System.out.println("안녕'하'세요");
		System.out.println("안녕\'하\'세요");
		//특수문자는 정해진 문자 이외의 문자를 사용하면 error
		//widows에서 자바 경로를 e:\dev\env.bat로 설정하였다.
		System.out.println("widows에서 자바 경로를 e:\\dev\\env.bat로 설정하였다."); //경로표현할 떄는 /가 적절
		
		
		
	}

}
