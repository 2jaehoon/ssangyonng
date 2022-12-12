package day1209;

public class InfiniteLoop {

	public static void main(String[] args) {
		//for문
		for( ; ;) {
			System.out.println("무한 루프");
			break; //for 무한 루프 탈출
		}//end for
		//무한 루프 아래의 코드들은 error처리가 된다.
		
		
		//증가하는 수를 사용하는 무한 루프
		for(int i =0;  ; i++) {
			System.out.println("무한 루프 " + i);
			if ( i == 30) {
			break; //for 무한 루프 탈출
			}
		}//end for
		
		
		
		
		//////////while 무한루프 //////////////////
	 while(true) {
		 System.out.println("while 무한 루프");
		 break;
	 }//end while
	 
	 do {
		 System.out.println("do while 무한 루프");
		 break;
	 }while(true);
		
		
		
		
	}//main

}//class
