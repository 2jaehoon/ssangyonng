package day1221;

public class Parent {
	public int a;
	protected int b;
	int c;
	private int d;
	
	public Parent() {
//		this(100);
	 System.out.println("�θ� Ŭ������ �⺻ ������");
	}//
	
	public Parent(int i) {
		this();
		System.out.println("�θ� Ŭ������ ���� ������  : " + i);

	
	}
	
	public void parentMethod() {
		System.out.println("�θ��� method a : " + a + " b  : " + b + " c : " + c + " d " + d);
	}//parentMethod

}
