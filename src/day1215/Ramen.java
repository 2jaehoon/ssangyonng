package day1215;

/**
 * ����� ������� �� Ŭ���� <br>
 * ����� Ư¡ : �̸�, ���� ����, ���� ����, �ٽø� ����<br>
 * ������ Ư¡ : �Դ� ��
 * @author user
 *
 */
public class Ramen {
	private String name;
	private int noodle, powder, kelp;
	public String pc = "-----PC������-----" , home = "-----��������------";
	
	/**
	 * ����� �̸��� �����ϴ� method
	 * @param name ����� �̸�
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * ����� �̸��� ��ȯ�ϴ� method
	 * @return ����� �̸�
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * ���� ������ �����ϴ� method
	 * @param noodle ���� ����
	 */
	public void setNoodle(int noodle) {
		this.noodle=noodle;
	}
	
	/**
	 * ���� ������ ��ȯ�ϴ� method
	 * @return ���� ����
	 */
	public int getNoodle() {
		return noodle;
	}
	
	/**
	 * ��� ������ ������ �����ϴ� method
	 * @param powder ��� ������ ����
	 */
	public void setPowder(int powder) {
		this.powder=powder;
	}
	
	/**
	 * ��� ���� ������ ��ȯ�ϴ� method
	 * @return ��� ������ ����
	 */
	public int getPowder() {
		return powder;
	}
	
	/**
	 * �ٽø��� ������ �����ϴ� method
	 * @param kelp �ٽø��� ����
	 */
	public void setKelp(int kelp) {
		this.kelp=kelp;
	}
	
	/**
	 * �ٽø��� ������ ��ȯ�ϴ� method
	 * @return �ٽø��� ����
	 */
	public int getKelp() {
		return kelp;
	}
	
	/**
	 * overloading
	 * ������ ����� �Դ� �ൿ ���� method
	 * @return ������ ��� �Դ� �ൿ
	 */
	public String eat() {
		return  "���� ������ " + "���� ������ " + noodle + "�̰� " +  
	" ��� ������ ������ " + powder + "�̰� " + "�ٽø� ������ " + kelp + "�� " + name + "����� " + "�Դ´�.";
	}
	
	/**
	 * �ۿ��� ����� �Դ� �ൿ ���� method
	 * @param place ����� ��Դ� ���
	 * @param price ����� ����
	 * @return �ۿ��� ��� �Դ� �ൿ
	 */
	public String eat(String place, int price) {
		return  "���� " + place +" ���� " + "������ " + price +  "���� ������ " + noodle + "�̰� " +  
	" ��� ������ ������ " + powder + "�̰� " + "�ٽø� ������ " + kelp + "�� " + name + "����� " + "�Դ´�.";
}
}
