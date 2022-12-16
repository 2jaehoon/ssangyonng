package day1215;

/**
 * 
 * @author user
 *
 */
public class TestThisKeyword {
	
	private int i;
	//this�� ������� �ʰ� set i�� �Էµ� ���� heap�� �ִ� i�� ����   �� ��ü �ϳ��� �� ���� �Ǵµ� ��������
	public void set(int i, TestThisKeyword ttk) {
		ttk.i = i;
		System.out.println("set�� ���� ttk" + ttk);
		System.out.println("set�� this " + this);
		System.out.println("set method �� i " + i);
		
		//System.out.println("seti method���� i = " + i);
	}//set
	
	/**
	 * stack�� �����Ǵ� ������� heap�� �����Ǵ� �������� ���� ��
	 * stack�� �ִ� ������ ����ϰ� �Ǵµ� �� �� heap�� �ִ� ������ ����ϱ� ����
	 * this.���������� ����Ѵ�.
	 * @param i
	 */
	public void useThis(int i) {
		this.i=i; //���ð� ���� �������� ���� �� �����ϱ� ���ؼ� ���
		System.out.println("useThis�� ȣ���� ��ü�� �ּ� : " + this);
	}
	
	
	
	

	public static void main(String[] args) {
		TestThisKeyword ttk = new TestThisKeyword();
		TestThisKeyword ttk1 = new TestThisKeyword();
	//	System.out.println(this);  //static ������ ��ü�� �����Ǳ� ���� ȣ��Ǳ� ������ this�� ����� �� ����.
		System.out.println("ttk��ü�� �ּ� : "+ ttk);
		System.out.println("ttk1��ü�� �ּ� : "+ ttk1);
		//ttk.set(2022, ttk);
		System.out.println("ttk��ü�� i���� : " + ttk.i);
		ttk.useThis(100);
		ttk1.useThis(800);

	}//main

}//class
