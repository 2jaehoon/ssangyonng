package day1208;

/**
 *  if~else<br>
 *  둘 중 하나의 코드를 실행해야 할 때,<br>
 *  문법)<br>
 *   if( 조건식 ){<br>
 *   조건에 맞을 때 수행될 문장 들..<br>
 *   } else {<br>
 *   조건에 맞지 않을 때 수행될 문장 들..<br>
 *   }
 * @author user
 *
 */
public class UseifElse {

	public static void main(String[] args) {
		
		//입력된 수가 홀수인지 짝수인지 판별하여 출력.
		int num = Integer.parseInt( args[0] );
		System.out.print(num + "은(는) ");
		if( num % 2 == 0) {
			System.out.println("짝수");
			
		} else {
			
			System.out.println( "홀수");
		}//end else
		
		
		System.out.println();
		
		
		//args[1] 점수를 입력받아 0~100사이면 "유효점수"출력하고 그렇지 않으면 "잘못된 입력"를 출력하는 코드를 작성
		int inputScore = Integer.parseInt(args[1]);
		System.out.print(inputScore + "점은 ");
		if(inputScore>=0 && inputScore<=100) {
			System.out.println("유효 점수");
		} else {			
			System.out.println("잘못된 입력");
		}//end else
		
		
		System.out.println();
		System.out.println("-----------다른 사람의 점수로 변환------");
		System.out.println();
		
		
		//args[2]로 입력된 값이 0에서 100사이일 때 0에서 40사이면 "과락"을 그렇지 않으면 "과락 아님"
		//출력하는 코드를 작성, 이프는 중첩사용이 가능.
		int inputScore2 = Integer.parseInt(args[2]);
		System.out.print(inputScore2 + "점은 ");
		if(inputScore2>-1 && inputScore2<101) {
			//if(inputScore2>-1 && inputScore2<41) {   // >=가 여러번이면 속도차이가 많이 난다 그래서 비교를 한번만 할수 있게 하면 좋다.
				if( inputScore2<41) {   // inputScore2>-1가 반복되므로 삭제해주는게 코드에서 더 좋다.
				System.out.println("과락");
			} else {                  
				System.out.println("과락 아님");
			}//end else  
		}//end if
		
		

	}

}
