package day1209;

public class InfiniteLoop {

	public static void main(String[] args) {
		//for��
		for( ; ;) {
			System.out.println("���� ����");
			break; //for ���� ���� Ż��
		}//end for
		//���� ���� �Ʒ��� �ڵ���� erroró���� �ȴ�.
		
		
		//�����ϴ� ���� ����ϴ� ���� ����
		for(int i =0;  ; i++) {
			System.out.println("���� ���� " + i);
			if ( i == 30) {
			break; //for ���� ���� Ż��
			}
		}//end for
		
		
		
		
		//////////while ���ѷ��� //////////////////
	 while(true) {
		 System.out.println("while ���� ����");
		 break;
	 }//end while
	 
	 do {
		 System.out.println("do while ���� ����");
		 break;
	 }while(true);
		
		
		
		
	}//main

}//class
