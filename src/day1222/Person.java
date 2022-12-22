package day1222;

/**
 * ����� ������� ������ Ŭ���� ����� Ư¡ : ��, ��, ��, �̸� ������ Ư¡ : �Դ� ��
 * 
 * @author user
 *
 */

/**
 * @author user
 *
 */
/**
 * @author user
 *
 */
/**
 * @author user
 *
 */
public abstract class Person {

	private int eye, nose, mouth;
	private String name;

	
	/**
	 * �⺻ ������
	 * �����ü�� ������ �� ��2��, ��1��, �� 1���� ��ü�� ����
	 */
	public Person() {
		this(2,1,1);
	}
	
	
	/**
	 * ���� �ִ� ������
	 * �����ε��� ������
	 * �� 2��, �� 1��, �� 1���� �ƴ� ��� ��ü�� ������ �� ���
	 * @param eye ������ ���� ��
	 * @param nose ������ ���� ��
	 * @param mouth ������ ���� ��
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
	}
	
	
	
	
	
	
	/**
	 * ������ ��� ��ü�� �� ������ �����ϴ� ��
	 * 
	 * @param eye ������ ���� ����
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye

	/**
	 * ������ ��� ��ü�� �� ������ ��ȯ�ϴ� ��
	 * 
	 * @return ���� ����
	 */
	public int getEye() {
		return eye;
	}//getEye

	/**
	 * ������ ��� ��ü�� �� ������ �����ϴ� ��
	 * 
	 * @param nose ���� ��
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}//setNose

	/**
	 * ������ ��� ��ü�� �� ������ ��ȯ�ϴ� ��
	 * 
	 * @return ���� ��
	 */
	public int getNose() {
		return nose;
	}//getNose

	/**
	 * ������ ��� ��ü�� ������ �� ������ �����ϴ� ��
	 * @param mouth �� ����
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setMouse
	
	/**
	 * ������ ��� ��ü�� ������ �� ������ ��ȯ�ϴ� ��
	 * @return �� ����
	 */
	public int getMouth() {
		return mouth;
	}//getMonse
	
	
	/**
	 * ������ ��� ��ü�� �̸��� �����ϴ� ��
	 * @param name ��� �̸�
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	
	/**
	 * ������ ��� ��ü�� �̸��� ��ȯ�ϴ� ��
	 * @return ��� �̸�
	 */
	public String getName() {
		return name;
	}//getName
	
	
	/**
	 * ������ ��� ��ü�� ������ ���� �Դ� ��
	 * @return �� ���� �Դ� �ൿ
	 */
	public abstract String eat() ;
	
	/**
	 * ������ ��� ��ü�� �ۿ��� ���� �Դ� ��
	 * method overload
	 * @param menu ������ ����
	 * @param price ������ ����
	 * @return �ۿ��� ��Դ� �ൿ
	 */
	public abstract String eat(String menu, int price);
	
	/**
	 * ��� ��ü�� ������ �� �ִ� ����
	 * @return ���
	 */
	public abstract String[] language();
	

}// class
