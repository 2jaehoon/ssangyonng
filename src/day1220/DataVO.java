package day1220;

/**
 * \ 여러개의 데이터를 저장할 수 있는 클래스를 생성 VO(Value Object) : 값을 저장할 목적으로 생성하는 객체
 * 
 * @author user
 *
 */
public class DataVO {
	private String name;
	private String addr;
	private int age;

	// 기본 생성자
	public DataVO() {

	}

	// 인자 있는 생성자
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
