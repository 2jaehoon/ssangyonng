package day1208;

/**
 * ���� if�� ���.<br>
 * ���ǿ� ���� ������ �ڵ带 �����ؾ� �� ��.<br>
 * ����) if(���ǽ�){ <br>
 * 					���ǿ� ���� �� ������ �����.... <br>
 * 				}
 * @author user
 *
 */
public class Useif {

	public static void main(String[] args) {
		
		//�Է��� ���� ���� �� ���ϱ�
		int num = Integer.parseInt(args[0]); //�ʼ��ڵ�
		
		//������ ����� 
//		�ڵ�� �ݵ�� ����� ������ �������� ������ 
		if(num < 0) {   
		num = -num;  //���ǿ� ���� ������ ����Ǵ� ������ �ڵ�
		}//end if
		
		System.out.println("�Է°� : " + args[0] + ", ���밪 : " + num);  //�ʼ��ڵ�
		
		
		//���ڿ��� equals�� �������� ���� �� �ִ�.
		System.out.println(args[1].equals("java"));
//		System.out.println(args[1]<10); //���ڿ��� ��Һ񱳰� �ȵȴ�.
		System.out.println(args[1].equals("�ڹ�"));
		
		//args[2]�� �Է°��� "java" �Ǵ� "�ڹ�"�϶��� "console�� �Ϻ��� OOP���.WriteOneRunAnywhere, �ڵ����� �����Ǵ� �޸�" 
		//�� ���
		if(args[2].equals("java")||args[2].equals("�ڹ�")) {
			
			
		
			 System.out.println( "console�� �Ϻ��� OOP���.WriteOneRunAnywhere, �ڵ����� �����Ǵ� �޸�" );
		}
		
		//args[0]�� ���� Ȧ�� ���� ¦�� ���� �Ǻ��Ͽ� ����ϴ� �ڵ带 �ۼ��غ�����.
		System.out.print(num + "��(��) ");
		if(num %2 == 0) {
			System.out.println("¦��");
		}//end if
		if(num %2 == 1) {
			System.out.println("Ȧ��");
		}//end if
		
		
		
	}//main

}//class
