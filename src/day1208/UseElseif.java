package day1208;

/**
 * 다중 if (else ~if)<br>
 * 연관된 여러 조건을 비교할 때 사용.
 * 문법)
 * if (조건식) {
 * 조건에 맞는 수행될 문장들
 * } else if( 조건식){
 * 조건에 맞는 수행될 문장들
 * } else if( 조건식){
 * 조건에 맞는 수행될 문장들
 * } else if( 조건식){
 * 조건에 맞는 수행될 문장들
 * } else {
 * 모든 조건에 맞지 않을 때 수행될 문장 들..
 * }
 * 
 *
 * @author user
 *
 */
public class UseElseif {

	public static void main(String[] args) {
		
		//정수의 유효성 판단. 0~40 과락. 41~59 다른 점수 참조.  61~100 합격.
		int score = Integer.parseInt(args[0]);
		System.out.println(score + "점" );
		
		if(score >-1 && score <40) {
			System.out.println("과락");
			
		}else if(score < 60){
			System.out.println("다른과목 참조");	
		}else if(score < 101){		
			System.out.println("합격");
		} else {
			System.out.println("점수 이탈");
		}//end else
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		int score2 = 1000;
		//score 변수의 입력된 값이 유효한지 유효성 검증하는 코드를 작성.
		//score 변수의 값이 0보다 작을 때 0보다 작아서 실패
		//score 변수의 값이 100보다 클 때 100보다 커서 실패
		//그렇지 않으면 "올바른 점수"를 출력
		if(score2 < 0) {
			System.out.println("0보다 작아서 실패");
		} else if( score2 > 100 ) {
			System.out.println("100보다 커서 실패");
		} else {
			System.out.println("올바른 점수");
		}
		
		

		
		
	}

}
