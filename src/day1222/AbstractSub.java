package day1222;

/**
 * �߻� Ŭ������ �ڽ� Ŭ����
 * 1. �θ� Ŭ������ ���� �߻�޼ҵ带 �ݵ�� Override�ؾ��Ѵ�.
 *     �Ϲ� �޼ҵ�� �ʿ信 ���� Override�Ѵ�.
 * @author user
 *
 */
public class AbstractSub extends AbstractSuper {
	
	public AbstractSub() {
		System.out.println("AbstractSub�� ������");
	}
	
	
	@Override
	public void methodB() {
		System.out.println("�޼ҵ�b�� �������̵�");
	}
	
	
	
	@Override
	public String methodC(int i) {
		String result = "�޼ҵ�c�� �������̵�";
		return result;
	}

	
	public void methodCall() {
		this.methodB();
		//�߻� �޼ҵ�� ȣ��x
//		super.methodB(); //error
	}
	

	public static void main(String[] args) {
		//�߻�Ŭ������ ���� ��ü�� ���� �ʴ´�. ������ �ڽ��� ���������ϴ�.
		AbstractSub as = new AbstractSub();//�ڽ�Ŭ������ ��üȭ
		as.methodCall();

	}//main

}//class
