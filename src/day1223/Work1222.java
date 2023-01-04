package day1223;

import day1221.Clark;

public class Work1222 {
	
	/**
	 * 입력된 Fly가 제공하는 기능을 사용할 수 있다.
	 * @param f
	 */
	public void method(Fly f) {//관대하다 => 너, 쟤든 다 받아줄게 
		System.out.println(f);//clark이거나 flyImpl된다. f가 다양하게 사용
		System.out.println(f.drivingForce());
		System.out.println(f.upwardForce());
	}//method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Work1222().method(new FlyImpl());
		Clark clark = new Clark(); //Fly 구현 => 자식으로 본다.
		FlyImpl flyImpl = new FlyImpl(); //Fly 구현 => 자식으로 본다.
		
		Work1222 work = new Work1222();
	
		work.method(clark);
		work.method(flyImpl);
		
		
		
		
	}

}
