package day1227;

import java.util.Random;

/**
 * ����
 * 
 * @author user
 *
 */
public class UseRandom {
	public UseRandom() {
		//1.����
		Random r = new Random();//random
		Random r1 = new Random(r.nextLong());//seed random
		//2.���
		//������ ����
		int i=r.nextInt();//int �����߻� -2143483648~2143483647
		System.out.println("�߻��� ���� : " + i);
		System.out.println("���� ���� : " + (i % 10));
		System.out.println("��� ���� ���� : " + Math.abs(i % 10));
		
		i=r.nextInt( 10 ); 
		System.out.println("nextInt Overload�� �޼ҵ� : " + i);
		
		//�Ǽ��� ����
		float f = r.nextFloat();
		double d = r.nextDouble();
		double d1 = r.nextDouble(10);
		System.out.println("float : " + f);
		System.out.println("double : " + (int)(d*10));
		System.out.println("d1 : " + (int)d1);
		
		//�Ҹ� ����
		boolean b = r.nextBoolean();
		System.out.println(b);
		
	}//UseRandom

	public static void main(String[] args) {
		new UseRandom();
	}// main

}// class
