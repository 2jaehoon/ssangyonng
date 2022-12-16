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

	public Ramen() {
		//�⺻�����ڿ����� �ڽ��� �����ϴ� ������� �⺻ ���� �����غ�����
		this("�Ŷ��",1,2,0);
	}
	
	public Ramen(String name, int noodle, int powder, int kelp) {
		this.name = name;
		this.noodle = noodle;
		this.powder = powder;
		this.kelp = kelp;
	}
	
	/**
	 * ����� �̸��� ��ȯ�ϴ� method
	 * @return ����� �̸�
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ���� ������ ��ȯ�ϴ� method
	 * @return ���� ����
	 */
	public int getNoodle() {
		return noodle;
	}
	
	/**
	 * ��� ���� ������ ��ȯ�ϴ� method
	 * @return ��� ������ ����
	 */
	public int getPowder() {
		return powder;
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
	 * ����� ���� ���鲿�� ���� method
	 * @return ������ ��� �Դ� �ൿ
	 */
	// method�� ����Դϴ�. ����� �����ϴ� ������� �߻�ȭ�� �ؼ� �����ؾ��ϴµ�
	//��� �� �����θ� ���� �� �� ���ݾƿ�?
	//����� �����ϴ� ��� : ����� ����, ���鲿��, �Ҿ�����?
	public String state() {
		return   "���� ������ " + noodle + "���̰�" +  
	" ��� ������ ������ " + powder + "���̰� \n" + "�ٽø� ������ " + kelp + "���� " + name + " ����� " + "���鲿���ϴ�.";
	}
	
	/**
	 * ����� ���� �Ҿ����� method
	 * @param place 
	 * @param price 
	 * @return 
	 */
	public String state(String state) {
		return  "���� ������ " + noodle + "���̰�" +  
	" ��� ������ ������ " + powder + "���̰� \n" + "�ٽø� ������ " + kelp + "���� " + name + " ����� " +state;
}
}
