package day1215;

import java.util.Scanner;

/**
 * Ramen�� Ŭ������ ����ϴ� Ŭ����
 * @author user
 *
 */
public class UseRamen {

	public static void main(String[] args) {
		//1. ��ü ����
		Ramen sinramen = new Ramen();
		Ramen nuguri = new Ramen();
		Ramen ansungtangmen = new Ramen();
		
		//2. �� ����
		
		//�Ŷ��
		sinramen.setKelp(0);
		sinramen.setName("�Ŷ��");
		sinramen.setNoodle(1);
		sinramen.setPowder(2);
		//�ʱ���
		nuguri.setKelp(1);
		nuguri.setName("�ʱ���");
		nuguri.setNoodle(1);
		nuguri.setPowder(2);
		//�ȼ�����
		ansungtangmen.setKelp(0);
		ansungtangmen.setName("�ȼ�����");
		ansungtangmen.setNoodle(1);
		ansungtangmen.setPowder(1);
		
		//3. ��� ���
		System.out.print("1�� �Ŷ��   2�� �ʱ���   3�� �ȼ����� ��ȣ�� �Է��ϼ���>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		//1 �Ŷ��
		//2 �ʱ���
		//3 �ȼ�����
		switch(num){
		//�Ŷ��
		case 1:
		System.out.println(sinramen.home);
		System.out.println(sinramen.eat());
		System.out.println(sinramen.pc);
		System.out.println(sinramen.eat("PC��", 2500));
		break;
		//�ʱ���
		case 2:
		System.out.println(nuguri.home);
		System.out.println(nuguri.eat());
		System.out.println(nuguri.pc);
		System.out.println(nuguri.eat("PC��", 2800));
		break;
		//�ȼ�����
		case 3:
		System.out.println(ansungtangmen.home);
		System.out.println(ansungtangmen.eat());
		System.out.println(ansungtangmen.pc);
		System.out.println(ansungtangmen.eat("PC��", 2400));
		break;
		default :
			System.out.println("����� ������ Ʋ���ϴ�. �ٽ� ��ȣ�� �����ּ���");
		}
		
		
	
		

	}

}
