package day1209;

/**
 * 
 * @author user
 *
 */
public class UseFor {

	public static void main(String[] args) {
		for(int i = 0; i < 10 ; i++) {
		System.out.println("�ȳ��ϼ���" + i);
		}//end for 
		
		
		//1~100���� 1�� �����ϸ�, �����ϴ� �� ������ ����ϴ� for�� �ۼ�
		for(int j = 1; j <=100; j ++) {
			System.out.print(j + " ");
		}//end for
		System.out.println();
		
		
		//0~100���� 1�� �����ϴ� for, ����� Ȧ���� ���
		int cnt =0; //for���� �ݺ� Ƚ���� ���� ����
		
		//for(int k = 0; k <=100; k++) {
			for(int k = 0; k <=100; k+=1) {
			cnt++;
			if(k%2!=0) {
				System.out.print("Ȧ�� : " + k);
			}//end if
		}//end for
		System.out.println();
		System.out.println();
		System.out.println(cnt + "�� �ݺ�");
		
		int cnt2 = 0;
		//1���� ���� 100���� �ݺ��ϴ� for, Ȧ���� ���
		for(int q = 1; q<101; q+=2) {
			if(q%2!=0) {
				System.out.print(" Ȧ�� " + q);
			}//end if
			cnt2++;
		}//end for
		System.out.println();
		System.out.println();
		System.out.println(cnt2 + "�� �ݺ�");
		
		//1~100���� ���� ���
		int sum = 0; //�������� �����ϱ� ���� ����
		for(int i = 1; i<101; i++) {
			sum += i;
		}//end for
		System.out.println("1~100���� �� : " + sum);
		
		//1~9���� 1�� �����ϴ� ���� ����ϴ� for
		for(int i =1; i<10; i++) {
			System.out.println("5 * " + i + " = " + 5 *i);
		}//end for
		
		//main method�� arguments�� ���� �Է¹޾� �������� �����϶���
		//������ �������� ���.
		System.out.println();
		int dan = Integer.parseInt(args[0]);//�Է°��� �ް�
		if (dan > 1 && dan < 10) { //�������� ���� �� ����
		for(int i=1 ;i<10;i++) { //�ݺ������� �������� ó��
			System.out.println(dan + " * " + i + " = " + dan*i );
		}//end for
		}//end if
		
		
		//for����Ͽ� ����빮�ڸ� ��� ���
/*		for(int i = 65; i<91; i++) {
			System.out.print(" " + (char)i);
		}//end for          */
		
		//char�� �����ڵ带 ������ ������ �ݺ����� ����� �� �ִ�.
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(" " + i);
		}//end for
		System.out.println();
		
		//100���� 1���� 1�� �����ϴ� for��
		for(int i=100; i>0; i--) {
			System.out.print(" " + i);
		}
		System.out.println();
		//�ҹ��� z���� a���� ����ϴ� for��
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
		
		//�������� �ʱⰪ�� ������ ����
		for(char up = 'A', lo='a';up<='Z';up++,lo++) {
			System.out.print(up+"("+lo+") ");
		}//end for
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
