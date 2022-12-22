package day1221;

/**
 * 자식 클래스 : 부모가 제공하는 공통기능을 사용
 * 
 * @author user
 *
 */
public class Child extends Parent {
	public int a; //부모와 같은 이름의 변수가 존재
	public int mz; //자식에만 존재하는 변수
	
	
	public Child() {
//		this(20);
		super(100);
		System.out.println("자식클래스의 기본 생성자");
	}// Child
	
	public Child(int i) {
		this();
		System.out.println("자식클래스의 인자 생성자 + " + i);
	}
	public void printA() {
		//인스턴스 메소드에서는 ㅂㄴ수나 메소드를 사용하면 디스가 생략되어있다.
		a=14;
		System.out.println("자식 a : " + a);
		//부모클래스의 같은 이름의 변수를 사용 super
		super.a=43;//디스를 슈퍼로 변경하면 부모 객체 시작주소로 이동되어 부모 객체 변수를 사용
		System.out.println("부모 a : " +super.a);
//		System.out.println(super); //부모의 시작주소인 슈퍼는 출력할 수 없다.
		this.b=2022;
		super.b=12;
	//this로는 자식의 변수, 부모의 변수 모두 사용 가능
		//super로는 부모의 변수만 사용 가능하다.
		
		
	}
	//인스턴스 메소드에는 다 this가 담겨 있다. 힙의 시작 주소를 디스가 아닌 부모로 부터 찾을 수 있게 super로 지정하면 됨
	public static void main(String[] args) {

		Child c = new Child();
		//코드의 재사용성 : 부모클래스의 자원(변수, method)을 자식 클래스에서 자신의 것처럼 사용하는 것
		c.a=1;
		c.b=10;
		c.c=1;
		System.out.println("코드의 재사용성 a" + c.a + " b : " + c.b + " c : " + c.c);
		c.parentMethod();
		System.out.println("-------------------------------");
		//같은 이름의 변수 부모와 자식 자식이 있으면 자식 먼저 적용 this로 자신 주소를 먼저 가져오기 때문
		//부모 클래스를 가쟈ㅕ오려면 부모 주소 super 사용해야함 
		c.printA();
	}//main


}//class
