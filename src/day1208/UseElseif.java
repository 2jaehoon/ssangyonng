package day1208;

/**
 * ���� if (else ~if)<br>
 * ������ ���� ������ ���� �� ���.
 * ����)
 * if (���ǽ�) {
 * ���ǿ� �´� ����� �����
 * } else if( ���ǽ�){
 * ���ǿ� �´� ����� �����
 * } else if( ���ǽ�){
 * ���ǿ� �´� ����� �����
 * } else if( ���ǽ�){
 * ���ǿ� �´� ����� �����
 * } else {
 * ��� ���ǿ� ���� ���� �� ����� ���� ��..
 * }
 * 
 *
 * @author user
 *
 */
public class UseElseif {

	public static void main(String[] args) {
		
		//������ ��ȿ�� �Ǵ�. 0~40 ����. 41~59 �ٸ� ���� ����.  61~100 �հ�.
		int score = Integer.parseInt(args[0]);
		System.out.println(score + "��" );
		
		if(score >-1 && score <40) {
			System.out.println("����");
			
		}else if(score < 60){
			System.out.println("�ٸ����� ����");	
		}else if(score < 101){		
			System.out.println("�հ�");
		} else {
			System.out.println("���� ��Ż");
		}//end else
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		int score2 = 1000;
		//score ������ �Էµ� ���� ��ȿ���� ��ȿ�� �����ϴ� �ڵ带 �ۼ�.
		//score ������ ���� 0���� ���� �� 0���� �۾Ƽ� ����
		//score ������ ���� 100���� Ŭ �� 100���� Ŀ�� ����
		//�׷��� ������ "�ùٸ� ����"�� ���
		if(score2 < 0) {
			System.out.println("0���� �۾Ƽ� ����");
		} else if( score2 > 100 ) {
			System.out.println("100���� Ŀ�� ����");
		} else {
			System.out.println("�ùٸ� ����");
		}
		
		

		
		
	}

}
