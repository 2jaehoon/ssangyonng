package day1223;



/**
 * mathŬ������ ���
 * @author user
 *
 */
public class UseMath {
	
	public UseMath() {
		
		//�����ڰ� �����Ƿ� ��üȭ �� �� ����(������ private)
//		Math m = new Math();
		int i = -12;
		double d = -12.23;
		System.out.println(Math.abs(i));
		System.out.println(Math.abs(d) );
		
		d=12.5;
		System.out.println(Math.round(d));
		d=12.45;
		System.out.println(Math.round(d));
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		
		d=Math.random();
		System.out.println("�߻��� ���� : " + d);
		System.out.println("���� ���� : " + d*5);
		System.out.println("���� ���� �Ҽ��� ���� : " + (int)(d*5));
		
		//1~10���� �� �� �ϳ��� ���
		System.out.println((int)(d*10)+1);
		//���ĺ� �빮�� a~z�� �ϳ��� ���
		System.out.println((char)((int)(d*26)+65));
		
	}//UseMath

	public static void main(String[] args) {
		new UseMath();
		
	
		
	}//main

}//class
