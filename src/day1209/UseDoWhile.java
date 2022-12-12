package day1209;

/**
 * do~while :
 * 최소 1번 수행 최대조건까지 수행.
 * @author user
 *
 */
public class UseDoWhile {

	public static void main(String[] args) {
		
		int  i =0;//초기값
		do {
			System.out.println("i =" + i);
			i++;
		} while (i <10);
		
		//do~while 구구단
		int dan = 2;
		i=1;
		do {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}while(i<10);
		
		//최소 1번 수행 최대 조건까지 수행
		 

		dan = 2;
		i=2022;
		do {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}while(i<10);
		
	}

}
