package day1209;

/**
 * while사용 <br>
 * 최소 0번 수행, 최대 조건까지 수행.
 * @author user
 *
 */
public class UseWhile {

	public static void main(String[] args) {
		
		int i =0;
		while( i< 10) {
			System.out.println("i = " + i);
			i++;
		}//end while
		
		
		//while 구구단
	  i = 2;
	 while(i<10) {
			 int j = 1;
			while(j<10) {
				System.out.println(i + "*" + j + " = " + i*j );
				j++;
			}
			i++;
		}
			

	}

}
