package day1221;

/**
 * �ڽ� Ŭ���� : �θ� �����ϴ� �������� ���
 * 
 * @author user
 *
 */
public class Child extends Parent {
	public int a; //�θ�� ���� �̸��� ������ ����
	public int mz; //�ڽĿ��� �����ϴ� ����
	
	
	public Child() {
//		this(20);
		super(100);
		System.out.println("�ڽ�Ŭ������ �⺻ ������");
	}// Child
	
	public Child(int i) {
		this();
		System.out.println("�ڽ�Ŭ������ ���� ������ + " + i);
	}
	public void printA() {
		//�ν��Ͻ� �޼ҵ忡���� �������� �޼ҵ带 ����ϸ� �𽺰� �����Ǿ��ִ�.
		a=14;
		System.out.println("�ڽ� a : " + a);
		//�θ�Ŭ������ ���� �̸��� ������ ��� super
		super.a=43;//�𽺸� ���۷� �����ϸ� �θ� ��ü �����ּҷ� �̵��Ǿ� �θ� ��ü ������ ���
		System.out.println("�θ� a : " +super.a);
//		System.out.println(super); //�θ��� �����ּ��� ���۴� ����� �� ����.
		this.b=2022;
		super.b=12;
	//this�δ� �ڽ��� ����, �θ��� ���� ��� ��� ����
		//super�δ� �θ��� ������ ��� �����ϴ�.
		
		
	}
	//�ν��Ͻ� �޼ҵ忡�� �� this�� ��� �ִ�. ���� ���� �ּҸ� �𽺰� �ƴ� �θ�� ���� ã�� �� �ְ� super�� �����ϸ� ��
	public static void main(String[] args) {

		Child c = new Child();
		//�ڵ��� ���뼺 : �θ�Ŭ������ �ڿ�(����, method)�� �ڽ� Ŭ�������� �ڽ��� ��ó�� ����ϴ� ��
		c.a=1;
		c.b=10;
		c.c=1;
		System.out.println("�ڵ��� ���뼺 a" + c.a + " b : " + c.b + " c : " + c.c);
		c.parentMethod();
		System.out.println("-------------------------------");
		//���� �̸��� ���� �θ�� �ڽ� �ڽ��� ������ �ڽ� ���� ���� this�� �ڽ� �ּҸ� ���� �������� ����
		//�θ� Ŭ������ ����ſ����� �θ� �ּ� super ����ؾ��� 
		c.printA();
	}//main


}//class
