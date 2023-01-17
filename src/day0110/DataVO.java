package day0110;

import java.io.Serializable;

/**
 * 직렬화가 될 수 있도록 Serializable interface를 구현한다.
 * transient vs Serializable => transient가 우선한다.
 * @author user
 *
 */
public class DataVO implements Serializable{ //참조형 데이터형은 직렬화가 안된다.
	
	/**
	 * 이 번호는 2024년 01일까지만 유효합니다.
	 * 직렬화를 사용하면 인증서처럼 사용가능
	 */
	private static final long serialVersionUID = -1182022691095719310L;
	
	
	private  String name;  //직렬화가 된다.
	private transient double height; //기본형 데이터형은 직렬화가 된다.  //transient 직렬화가 되지 않도록 설정
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
