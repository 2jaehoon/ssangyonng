package day1209;

/**
 * 
 * @author user
 *
 */
public class UseFor {

	public static void main(String[] args) {
		for(int i = 0; i < 10 ; i++) {
		System.out.println("안녕하세요" + i);
		}//end for 
		
		
		//1~100까지 1씩 증가하며, 증가하는 수 옆으로 출력하는 for문 작성
		for(int j = 1; j <=100; j ++) {
			System.out.print(j + " ");
		}//end for
		System.out.println();
		
		
		//0~100까지 1씩 증가하는 for, 출력은 홀수만 출력
		int cnt =0; //for문의 반복 횟수를 저장 변수
		
		//for(int k = 0; k <=100; k++) {
			for(int k = 0; k <=100; k+=1) {
			cnt++;
			if(k%2!=0) {
				System.out.print("홀수 : " + k);
			}//end if
		}//end for
		System.out.println();
		System.out.println();
		System.out.println(cnt + "번 반복");
		
		int cnt2 = 0;
		//1에서 부터 100까지 반복하는 for, 홀수만 출력
		for(int q = 1; q<101; q+=2) {
			if(q%2!=0) {
				System.out.print(" 홀수 " + q);
			}//end if
			cnt2++;
		}//end for
		System.out.println();
		System.out.println();
		System.out.println(cnt2 + "번 반복");
		
		//1~100까지 합을 출력
		int sum = 0; //누적합을 저장하기 위한 변수
		for(int i = 1; i<101; i++) {
			sum += i;
		}//end for
		System.out.println("1~100까지 합 : " + sum);
		
		//1~9까지 1씩 증가하는 값을 출력하는 for
		for(int i =1; i<10; i++) {
			System.out.println("5 * " + i + " = " + 5 *i);
		}//end for
		
		//main method의 arguments로 단을 입력받아 구구단의 범위일때민
		//단으로 구구단을 출력.
		System.out.println();
		int dan = Integer.parseInt(args[0]);//입력값을 받가
		if (dan > 1 && dan < 10) { //구구단의 범위 일 때만
		for(int i=1 ;i<10;i++) { //반복문으로 구구단을 처리
			System.out.println(dan + " * " + i + " = " + dan*i );
		}//end for
		}//end if
		
		
		//for사용하여 영어대문자만 모두 출력
/*		for(int i = 65; i<91; i++) {
			System.out.print(" " + (char)i);
		}//end for          */
		
		//char는 유니코드를 가지기 때문에 반복문에 사용할 수 있다.
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(" " + i);
		}//end for
		System.out.println();
		
		//100부터 1까지 1씩 감소하는 for문
		for(int i=100; i>0; i--) {
			System.out.print(" " + i);
		}
		System.out.println();
		//소문자 z부터 a까지 출력하는 for문
		for(int i =122; i>96 ; i--) {
			System.out.print(" " + (char) i);
		}
		System.out.println();
		
//		for(int i=65; i<123; i++ ) {
//			if(i<97||i<123)
//			System.out.print(" " +(char) i);
//		}
		
		System.out.println();
		
		char lowerCase = 'a';
		for(char i = 65; i<91; i ++) {
			System.out.print( " " + (char)(i+32) + " " + i );
			//System.out.println(lowerCase++);
		}
		System.out.println();
		
		//여러개의 초기값을 가지는 포문
		for(char up = 'A', lo='a';up<='Z';up++,lo++) {
			System.out.print(up+"("+lo+") ");
		}//end for
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
