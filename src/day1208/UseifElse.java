package day1208;

/**
 *  if~else<br>
 *  �� �� �ϳ��� �ڵ带 �����ؾ� �� ��,<br>
 *  ����)<br>
 *   if( ���ǽ� ){<br>
 *   ���ǿ� ���� �� ����� ���� ��..<br>
 *   } else {<br>
 *   ���ǿ� ���� ���� �� ����� ���� ��..<br>
 *   }
 * @author user
 *
 */
public class UseifElse {

	public static void main(String[] args) {
		
		//�Էµ� ���� Ȧ������ ¦������ �Ǻ��Ͽ� ���.
		int num = Integer.parseInt( args[0] );
		System.out.print(num + "��(��) ");
		if( num % 2 == 0) {
			System.out.println("¦��");
			
		} else {
			
			System.out.println( "Ȧ��");
		}//end else
		
		
		System.out.println();
		
		
		//args[1] ������ �Է¹޾� 0~100���̸� "��ȿ����"����ϰ� �׷��� ������ "�߸��� �Է�"�� ����ϴ� �ڵ带 �ۼ�
		int inputScore = Integer.parseInt(args[1]);
		System.out.print(inputScore + "���� ");
		if(inputScore>=0 && inputScore<=100) {
			System.out.println("��ȿ ����");
		} else {			
			System.out.println("�߸��� �Է�");
		}//end else
		
		
		System.out.println();
		System.out.println("-----------�ٸ� ����� ������ ��ȯ------");
		System.out.println();
		
		
		//args[2]�� �Էµ� ���� 0���� 100������ �� 0���� 40���̸� "����"�� �׷��� ������ "���� �ƴ�"
		//����ϴ� �ڵ带 �ۼ�, ������ ��ø����� ����.
		int inputScore2 = Integer.parseInt(args[2]);
		System.out.print(inputScore2 + "���� ");
		if(inputScore2>-1 && inputScore2<101) {
			//if(inputScore2>-1 && inputScore2<41) {   // >=�� �������̸� �ӵ����̰� ���� ���� �׷��� �񱳸� �ѹ��� �Ҽ� �ְ� �ϸ� ����.
				if( inputScore2<41) {   // inputScore2>-1�� �ݺ��ǹǷ� �������ִ°� �ڵ忡�� �� ����.
				System.out.println("����");
			} else {                  
				System.out.println("���� �ƴ�");
			}//end else  
		}//end if
		
		

	}

}
