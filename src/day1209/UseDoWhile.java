package day1209;

/**
 * do~while :
 * �ּ� 1�� ���� �ִ����Ǳ��� ����.
 * @author user
 *
 */
public class UseDoWhile {

	public static void main(String[] args) {
		
		int  i =0;//�ʱⰪ
		do {
			System.out.println("i =" + i);
			i++;
		} while (i <10);
		
		//do~while ������
		int dan = 2;
		i=1;
		do {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}while(i<10);
		
		//�ּ� 1�� ���� �ִ� ���Ǳ��� ����
		 

		dan = 2;
		i=2022;
		do {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}while(i<10);
		
	}

}
