package day1222;

/**
 * ���� Ŭ������ �ݵ�� �����ؾ��� ���� ��ϸ� ����
 * @author user
 *
 */
public interface SuperInter {
//	int i; ������ �ۼ��� �� ����.
	public static final int MAX = 10;
	
//	public SuperInter() { //�����ڸ� ���� �� ���� = > ��üȭ�� �� �� ����.
//	} 
//	public void test() {//�Ϲ� �޼ҵ带 ���� �� ���� => ���� �����Ͽ� ������ �� ����.
//	}
	
	//abstract ���
	public abstract void methodA();
	//abstract ���x
	public void methodB();
	
	/**
	 * default method�� ����ϸ� jdk1.8���� �������̽������� ������ ����� ������ �� �ִ�.
	 * @return
	 */
	public default String msg() {
		String result = "������ ����� �Դϴ�.";
		return result;
	}//msg
	
	
	
	
	
}//interface
