package day1223;



/**
 * math클래스의 사용
 * @author user
 *
 */
public class UseMath {
	
	public UseMath() {
		
		//생성자가 없으므로 객체화 할 수 없다(생성자 private)
//		Math m = new Math();
		int i = -12;
		double d = -12.23;
		System.out.println(Math.abs(i));
		System.out.println(Math.abs(d) );
		
		d=12.5;
		System.out.println(Math.round(d));
		d=12.45;
		System.out.println(Math.round(d));
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		
		d=Math.random();
		System.out.println("발생한 난수 : " + d);
		System.out.println("범위 난수 : " + d*5);
		System.out.println("범위 난수 소수를 제거 : " + (int)(d*5));
		
		//1~10까지 수 중 하나만 얻기
		System.out.println((int)(d*10)+1);
		//알파벳 대문자 a~z중 하나를 얻기
		System.out.println((char)((int)(d*26)+65));
		
	}//UseMath

	public static void main(String[] args) {
		new UseMath();
		
	
		
	}//main

}//class
