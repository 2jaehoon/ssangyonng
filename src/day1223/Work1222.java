package day1223;

import day1221.Clark;

public class Work1222 {
	
	/**
	 * �Էµ� Fly�� �����ϴ� ����� ����� �� �ִ�.
	 * @param f
	 */
	public void method(Fly f) {//�����ϴ� => ��, ���� �� �޾��ٰ� 
		System.out.println(f);//clark�̰ų� flyImpl�ȴ�. f�� �پ��ϰ� ���
		System.out.println(f.drivingForce());
		System.out.println(f.upwardForce());
	}//method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Work1222().method(new FlyImpl());
		Clark clark = new Clark(); //Fly ���� => �ڽ����� ����.
		FlyImpl flyImpl = new FlyImpl(); //Fly ���� => �ڽ����� ����.
		
		Work1222 work = new Work1222();
	
		work.method(clark);
		work.method(flyImpl);
		
		
		
		
	}

}
