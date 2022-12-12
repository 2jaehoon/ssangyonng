package day1209;

/**
 * 다중 for 사용
 * 
 * @author user
 *
 */
public class UseFor2 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.println("===============");
			for (int j = 0; j < 5; j++) {
				System.out.println("i = " + i + " j = " + j);
			} // end for
			System.out.println("===============");

		} // end for

		// 다중 포문을 사용한 구구단 전단 출력.
		int dan, i;
		for (dan = 2; dan < 10; dan++) {
			System.out.println();
			System.out.println(dan + "단");
			System.out.println();
			for (i = 1; i < 10; i++) {
				System.out.println(dan + " X " + i + " = " + dan * i);
			}

		}

		int dan2, j;
		for (dan2 = 1; dan2 < 10; dan2++) {

			for (j = 2; j < 10; j++) {
				System.out.print(j + " X " + dan2 + " = " + dan2 * j + " ");
			}
			System.out.println();
		}

		// 0 1 0 2 0 3 0 4
		// 1 2 1 3 1 4
		// 2 3 2 4
		// 3 4

		for (i = 0; i < 4; i++) {
			for (j = i + 1; j < 5; j++) {
				System.out.print(i + " " + j + " ");
			} // end for
			System.out.println();
		} // end for

		// 아래의 숫자가 출력되도록 다중 for문을 작성해보세요
//		0  0  
//		1  0  1  1
//		2  0  2  1  2  2
//		3  0  3  1  3  2  3  3
		for (i = 0; i < 4; i++) {
			for (j = 0; j < i+1; j++) {
				System.out.print(i + " " + j + " ");
			}//end for
			System.out.println();
		}//end for
		
		
		
		//1 1 1 1 1
		//1 0 0 0 1
		//1 0 0 0 1
		//1 0 0 0 1
		//1 1 1 1 1
		for(i=0;i<5; i++) { //행
			for(j=0;j<5;j++) { //열
				if(i==0 || i==4 || j == 0 || j==4 ) {
					System.out.print("1");
				}else {
				System.out.print(0);	
			}
		
			}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}// main

}// class
