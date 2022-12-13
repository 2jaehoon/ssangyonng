package day1213;

/**
 * method의 4가지 형태.<br>
 * @author user
 *
 */
public class MethodType {
	
	/**
	 * 고정 일(반환형 없고, 매개변수 없는 형)<br>
	 * 항상 같은 일을 수행한다.
	 */
	public void typeA() {
		System.out.println("고정일");
	}//typeA
	
	
	/**
	 * 가변 일. (반환형 없고, 매개변수 있는 형)<br>
	 * 매개변수가 있는 method는 호출할 때 매개변수의 개수, 데이터에 맞는 값에 주의하여 호출
	 * @param i 입력되는 값
	 */
	public void typeB(int i) {
		System.out.println("가변 일 i = "+ i);
	}//typeB
	
	/**
	 * 고정 값(반환형 있고, 매개변수 없는 형)<br>
	 * 값으로 사용하는 method는 가장 마지막 줄에 반환형과 동일한 데이터 형의 값을
	 * 반환하는 return이 반드시 기술 되어야한다.
	 * @return
	 */
	public int typeC() {
		
		
		return 2022; //return 다음으로 사용 x
	}
	
	/**
	 * 가변 값(반환형 있고 매개변수 있는 형)<br>
	 * 값으로 사용하는 method는 가장 마지막 줄에 반환형과 동일한 데이터 형의 값을
	 * 반환하는 return이 반드시 기술 되어야한다.
	 * @param d 더블형의 입력값
	 * @return 정수형으로 처리된 결과
	 */
	public int typeD(double d) {
		
		return (int)d; //d는 반환형이랑 달라서 error
	}

	public static void main(String[] args) {
		//객체화 : 클래스명 객체명 = new 클래스명();    //스텍에 주소가 설정 힙에 주소에 맞는 값 들어감
		MethodType mt = new MethodType();
		//고정일을 수행하는 method를 호출 : 객체명.method명();
		for(int i =0; i<10; i++)
		mt.typeA();
		
		//가변일을 수행하는 method 호출 : 객체명.method명(값)
		for(int i =0; i<10; i++)
		mt.typeB(i);
		
		//////////////////값으로 사용하는 method///////////////////////////////////////////////////////
		System.out.println("고정값 출력 : " +mt.typeC());
		//변수 할당.
		int i = mt.typeC();
		System.out.println("고정값을 변수 저장 출력 : " + i);
		//연산가능
		System.out.println(mt.typeC() + 1);
		
		//가변값
		System.out.println("가변 값 출력 : "+ mt.typeD(12.13));
		i=mt.typeD(12.13);
		System.out.println("가변값을 변수 저장 출력 : " + i);
		//연산 가능
		System.out.println(mt.typeD(12.16)*10);
		
		
		
	}//main

}//class
