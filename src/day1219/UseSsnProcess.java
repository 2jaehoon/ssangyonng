package day1219;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

/**
 * ����� ����ϴ� Ŭ����
 * ssnProcsee�� �����ϴ� ����� ����ϰ�, �����ϴ� ��� �� ����� ���� �ִٸ�
 * ����� �����.
 * @author user
 *
 */
public class UseSsnProcess {

	public static void main(String[] args) {
		//1. �ֹι�ȣ�� �Է� �޾� �ν��Ͻ� ������ �����ϴ� �����ڸ� ���弼��.
		String ssn = "950101-1234567";
		SsnProcess sp = new SsnProcess(ssn);
		System.out.println(sp+ "��ü�� ���� �ֹι�ȣ " + sp.getSsn());
		String ssn2 = "950101-1234567";
		SsnProcess sp1 = new SsnProcess(ssn2);
		System.out.println(sp1+ "��ü�� ���� �ֹι�ȣ " + sp1.getSsn());
		//�̷��� �� �Ÿ� setter�� �ߺ��ȵǰ� �ض�
		System.out.println("�Էµ� �ֹι�ȣ : " + sp.getSsn());
		System.out.println(sp.lengthCheck());
		if(sp.lengthCheck()) {
			if(sp.dashCheck()) {
			System.out.println("-üũ");
			System.out.println("������� : " +sp.birth());
			System.out.println("���� : " +sp.age());
			System.out.println("���� : " +sp.gender());
			System.out.println("�� : " +sp.zodiac());
			
			
			
			
			
			}else {
				System.out.println("'-'�� ��ġ�� �ùٸ��� �ʽ��ϴ�.");
			}//end else
		}else{
			System.out.println("�ֹι�ȣ�� ���ڼ��� Ȯ�����ּ���.");
		}//end else
		

		
		
		
	
		
		
		

	}//main

}//class
