package day1222;

/**
 * Person Ŭ������ ����ϴ� Ŭ����
 * @author user
 *
 */
public class UsePerson {

	public static void main(String[] args) {
		
		HongGilDong hgd = new HongGilDong();
		//�ڵ��� ���뼺 : �θ��� method ���
		hgd.setName("ȫ�浿");
		System.out.printf("�� %d  �� %d �� %d �̸� %s\n", hgd.getEye(), hgd.getNose(), hgd.getMouth(), hgd.getName());
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("�߲��� ����",8000));
		
		//�ڽŸ��� Ư¡
		System.out.println(hgd.fight(5)); //6>7 ȫ�浿�� �⺻������ 6�̱⿡ ��������
		System.out.println(hgd.fight(6)); //7>8
		System.out.println(hgd.fight(9)); //8>7 ���� ������ ����
		System.out.println(hgd.fight(7)); //���
		
		System.out.println("----------------------------------------------");
		Clark superman =  new Clark();
		//�ڵ��� ���뼺 : �θ�Ŭ������ �ڿ��� �ڽĿ��� ����ϴ� ��.
		superman.setName("Ŭ��");
		System.out.printf("�� %d  �� %d �� %d �̸� %s\n", superman.getEye(), superman.getNose(), superman.getMouth(), superman.getName());
		System.out.println(superman.eat());
		System.out.println(superman.eat("������ũ",10));
		
		//�ڽĸ��� Ư¡
		String stone = "¯��";
		System.out.println(stone + "�� ������ " + superman.power(stone) + "���۸� �Ŀ� : " + superman.power);
		stone = "���̾Ƹ��";
		System.out.println(stone + "�� ������ " + superman.power(stone)+ "���۸� �Ŀ� : " + superman.power);
		stone = "ũ���䳪��Ʈ";
		System.out.println(stone + "�� ������ " + superman.power(stone)+ "���۸� �Ŀ� : " + superman.power);
		//�������̽����� �����ϴ� method�� �����Ͽ� ���
		System.out.println(superman.getName() + "�� ������?" + superman.drivingForce());
		System.out.println(superman.getName() + "�� ���?" + superman.upwardForce());
		
		
		System.out.println("-----------------------------------------------------");
		
		//����
//		Jaehoon jaehoon = new Jaehoon();
//		jaehoon.setName("������");
//		System.out.printf("�� %d  �� %d �� %d �̸� %s\n", jaehoon.getEye(), jaehoon.getNose(), jaehoon.getMouth(), jaehoon.getName());
//		int effortScore = 30;
//		System.out.println("��������� " + effortScore + "�̸� " + jaehoon.effort(effortScore));
//		effortScore = 50;
//		System.out.println("��������� " + effortScore + "�̸� " + jaehoon.effort(effortScore));
//		effortScore = 70;
//		System.out.println("��������� " + effortScore + "�̸� " + jaehoon.effort(effortScore));
//		effortScore = jaehoon.effortScore;
//		System.out.println("��������� " + effortScore + "�̸� " + jaehoon.effort(effortScore));
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println(hgd.getName()+"�� �����ϴ� ���");
		for(String lang : hgd.language()) {
			System.out.print(lang + " ");
		}//end for
		System.out.println("");
		
		System.out.println(superman.getName()+"�� �����ϴ� ���");
		for(String lang : superman.language()) {
			System.out.print(lang + " ");
		}//end for
		
		
		

	}//main

}//class
