package day0106;

/**
 * ����� ���� ���� ó�� Ŭ����
 * �����ϴ� ������ ����Ͽ� ����ó�� Ŭ������ �ۼ�
 * @author user
 *
 */
@SuppressWarnings("serial")
public class TobaccoException extends Exception {
	
	public TobaccoException() {
		super("���� �ǰ��� �طӽ��ϴ�");
	}//TobaccoException
	
	public TobaccoException(String msg) {
		super(msg);
	}//TobaccoException
	

}//class
