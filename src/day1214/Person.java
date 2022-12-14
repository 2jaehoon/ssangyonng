package day1214;

/**
 * ����� ������� ������ Ŭ���� ����� Ư¡ : ��, ��, ��, �̸� ������ Ư¡ : �Դ� ��
 * 
 * @author user
 *
 */

public class Person {

	private int eye, nose, mouth;
	private String name;

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
	public String eat() {
		return name + "�� ������ ���� �Դ´�.";
	}//eat
	
	/**
	 * ������ ��� ��ü�� �ۿ��� ���� �Դ� ��
	 * method overload
	 * @param menu ������ ����
	 * @param price ������ ����
	 * @return �ۿ��� ��Դ� �ൿ
	 */
	public String eat(String menu, int price) {
		return name  + "�� �Ĵ翡�� " + menu + "�� ������ " + price + "�� ���� ��Դ´�.";
	}
	
	
	
	
	

}// class
