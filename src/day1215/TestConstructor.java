package day1215;

/**
 * ������ ����
 * @author user
 *
 */
public class TestConstructor {
	
	/**
	 * 
	 */
	public TestConstructor() {
		System.out.println("�⺻ ������");
		//test();  //method�� ���� ȣ�� ����
		//new TestConstructor(12);  //�����ڴ� new�θ� �θ� �� �ִ�. new ������ ȣ�� x
	}//TestConstructor
	
	public TestConstructor(int i){
		System.out.println("���� �ִ� ������ " + i);
	}//TestConstructor
	
	public void test() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}//test
	
	
	public static void main(String[] args) {
		
		//��üȭ : Ŭ������ ��ü�� = new Ŭ������==������();
		TestConstructor tc = new TestConstructor();
		//�����ڰ� ȣ��Ǹ� ��ü�� �����Ǿ���.
		
		
		
		
		
	}//main

}//class
