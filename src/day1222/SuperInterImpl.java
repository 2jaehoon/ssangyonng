package day1222;

/**
 * �������̽��� �����ϴ� Ŭ����
 * �������̽��� abstract �޼ҵ�� �ݵ�� �����ؾ� �Ѵ�.
 * @author user
 *
 */
public class SuperInterImpl implements SuperInter{
	
	

	public static void main(String[] args) {
		//interface�� �����ڰ� �������� �����Ƿ� ��üȭ �� �� ����.
//		SuperInter si = new SuperInter();
	
		//interface�� ����Ŭ������ �ּҸ� ������ �� �ִ�.
		SuperInter si = new SuperInterImpl();
		//�������̽��� �߻�޼ҵ带 ȣ���ϸ� Override�� �޼ҵ尡 ȣ��ȴ�.
		si.methodA();//
		si.methodB();//
		System.out.println("interface�� default method : " + si.msg());
	}//main

	@Override
	public void methodA() {
		System.out.println("SuperInterImplŬ������ ������ �޼ҵ�a");
	}//�޼ҵ�a

	@Override
	public void methodB() {		
		System.out.println("SuperInterImplŬ������ ������ �޼ҵ�b");
	}//�޼ҵ�b

}//class
