package day1209;

/**
 * while��� <br>
 * �ּ� 0�� ����, �ִ� ���Ǳ��� ����.
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
		
		
		//while ������
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
