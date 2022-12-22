package day1221;

public class Parent {
	public int a;
	protected int b;
	int c;
	private int d;
	
	public Parent() {
//		this(100);
	 System.out.println("부모 클래스의 기본 생성자");
	}//
	
	public Parent(int i) {
		this();
		System.out.println("부모 클래스의 인자 생성자  : " + i);

	
	}
	
	public void parentMethod() {
		System.out.println("부모의 method a : " + a + " b  : " + b + " c : " + c + " d " + d);
	}//parentMethod

}
