package day1220;

/**
 * \ �������� �����͸� ������ �� �ִ� Ŭ������ ���� VO(Value Object) : ���� ������ �������� �����ϴ� ��ü
 * 
 * @author user
 *
 */
public class DataVO {
	private String name;
	private String addr;
	private int age;

	// �⺻ ������
	public DataVO() {

	}

	// ���� �ִ� ������
	public DataVO(String name, String addr, int age) {
		this.name=name;
		this.addr=addr;
		this.age=age;
	}

	// getter method
	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public int getAge() {
		return age;
	}

	// setter method
	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
