package day1228;

/**
 * interface는 부모 인터페이스를 여러개 가질 수 있다.
 * @author user
 *
 */
public interface InterC extends InterA, InterB {
	//부모 interface의 abstract method는 자식 interface에서 구현할 필요가 없다.
	//InterC를 구현하는 자식 클래스에서는 모든 부모들의 abstract method를 Override해야 한다.
	public String MethodC(int i);

}
