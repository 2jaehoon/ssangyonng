package day1215;

//import java.util.Scanner;

/**
 * Ramen�� Ŭ������ ����ϴ� Ŭ����
 * @author user
 *
 */
public class UseRamen {

	public static void main(String[] args) {
		//1. ��ü ���� (�� ������ �����ڿ��� ����)
		Ramen sinramen = new Ramen("�Ŷ��",1,2,0);   ///�� ������ ���� ����Ǵ� ����??
		Ramen nuguri = new Ramen("�ʱ���",1,2,1);
		Ramen ansungtangmen = new Ramen("�ȼ�����",1,1,0);	
		
		//�Ŷ��

		System.out.println(sinramen.state());
		System.out.println(sinramen.state("�Ҿ�������"));  ///�� ������ ���� ����Ǵ� ����??
		
	
		//�ʱ���
		
		System.out.println(nuguri.state());
		System.out.println(nuguri.state("�Ҿ�������"));
		
		
		//�ȼ�����
		System.out.println(ansungtangmen.state());
		System.out.println(ansungtangmen.state("�Ҿ�������"));
		
			
		
		
	
		

	}

}
