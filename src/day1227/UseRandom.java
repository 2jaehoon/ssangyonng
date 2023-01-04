package day1227;

import java.util.Random;

/**
 * 난수
 * 
 * @author user
 *
 */
public class UseRandom {
	public UseRandom() {
		//1.생성
		Random r = new Random();//random
		Random r1 = new Random(r.nextLong());//seed random
		//2.사용
		//정수의 난수
		int i=r.nextInt();//int 난수발생 -2143483648~2143483647
		System.out.println("발생한 난수 : " + i);
		System.out.println("범위 난수 : " + (i % 10));
		System.out.println("양수 범위 난수 : " + Math.abs(i % 10));
		
		i=r.nextInt( 10 ); 
		System.out.println("nextInt Overload된 메소드 : " + i);
		
		//실수의 난수
		float f = r.nextFloat();
		double d = r.nextDouble();
		double d1 = r.nextDouble(10);
		System.out.println("float : " + f);
		System.out.println("double : " + (int)(d*10));
		System.out.println("d1 : " + (int)d1);
		
		//불린 난수
		boolean b = r.nextBoolean();
		System.out.println(b);
		
	}//UseRandom

	public static void main(String[] args) {
		new UseRandom();
	}// main

}// class
