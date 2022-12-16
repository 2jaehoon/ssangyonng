package day1215;

/**
 * 
 * @author user
 *
 */
public class TestThisKeyword {
	
	private int i;
	//this를 사용하지 않고 set i에 입력된 값은 heap에 있는 i로 설정   아 객체 하나를 더 쓰면 되는데 ㅆㅃㅋㅋ
	public void set(int i, TestThisKeyword ttk) {
		ttk.i = i;
		System.out.println("set가 받은 ttk" + ttk);
		System.out.println("set의 this " + this);
		System.out.println("set method 안 i " + i);
		
		//System.out.println("seti method에서 i = " + i);
	}//set
	
	/**
	 * stack에 생성되는 변수명과 heap에 생성되는 변수명이 같을 때
	 * stack에 있는 변수를 사용하게 되는데 이 떄 heap에 있는 변수를 사용하기 위해
	 * this.변수명으로 사용한다.
	 * @param i
	 */
	public void useThis(int i) {
		this.i=i; //스택과 힙의 변수명이 같을 떄 구분하기 위해서 사용
		System.out.println("useThis를 호출한 객체의 주소 : " + this);
	}
	
	
	
	

	public static void main(String[] args) {
		TestThisKeyword ttk = new TestThisKeyword();
		TestThisKeyword ttk1 = new TestThisKeyword();
	//	System.out.println(this);  //static 영역은 객체가 생성되기 전에 호출되기 떄문에 this를 사용할 수 없다.
		System.out.println("ttk객체의 주소 : "+ ttk);
		System.out.println("ttk1객체의 주소 : "+ ttk1);
		//ttk.set(2022, ttk);
		System.out.println("ttk객체의 i변수 : " + ttk.i);
		ttk.useThis(100);
		ttk1.useThis(800);

	}//main

}//class
