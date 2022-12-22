package day1222;

import java.text.SimpleDateFormat;

import javax.security.sasl.SaslException;
import javax.swing.text.SimpleAttributeSet;

/**
 * Override 연습
 * @author user
 *
 */
public class TestOverride {
	
	@Override
	public String toString() {
		return "객체를 출력했을 때 출력될 메시지";
	}

	public static void main(String[] args) {
		
		String str = new String("내일은 더 추움");
		//참조형 데이터형은 주소를 가지고 있고 객체를 출력하면 heap의 추소를 출력된다.
		System.out.println(str);//println method는 입력받은 객체의 toString()를 호출하여 객체가 가진 메시지를 출력한다.
		//자바의 모든 클래스는 Object 인가요? 네
		//모든 클래스는 Object의 method를 사용할 수 있나요? 네
		//오브젝트 클래스의 자식인 스트링 클래스에서 toString이 오버라이드가 되어 있기 때문에
		//String에서 사용시에 객체의 주소가 아니라 그 값이 반환된다.
		
		TestOverride to = new TestOverride();
		System.out.println(to);//주소가 아닌 값이 출력되도록 만들고 싶으면
		//toString method를 Override를 하자.
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf); //toString method를 Override하지 않았다.
		
		Integer i = new Integer(2022);
		System.out.println(i); //toString method를 Override했다.
		
		
	}//main

}//class
