package day0110;

import java.io.Serializable;

/**
 * ����ȭ�� �� �� �ֵ��� Serializable interface�� �����Ѵ�.
 * transient vs Serializable => transient�� �켱�Ѵ�.
 * @author user
 *
 */
public class DataVO implements Serializable{ //������ ���������� ����ȭ�� �ȵȴ�.
	
	/**
	 * �� ��ȣ�� 2024�� 01�ϱ����� ��ȿ�մϴ�.
	 * ����ȭ�� ����ϸ� ������ó�� ��밡��
	 */
	private static final long serialVersionUID = -1182022691095719310L;
	
	
	private  String name;  //����ȭ�� �ȴ�.
	private transient double height; //�⺻�� ���������� ����ȭ�� �ȴ�.  //transient ����ȭ�� ���� �ʵ��� ����
	private double weight;
	
	
	

	public DataVO() {
		
	}
	
	
	@Override
	public String toString() {
		return "DataVO [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public DataVO(String name, double height, double weight) {
	this.name = name;
	this.height = height;
	this.weight = weight;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	

}
