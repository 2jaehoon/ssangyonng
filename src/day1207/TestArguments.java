package day1207;

 /**
 * @author user
 * 실행)
 *java TestArguments 값 .......
 */
public class TestArguments {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println((Integer.parseInt(args[0])+Integer.parseInt(args[1]))); //문자열의 +연산은 붙임을 의미
		//api문서에서 패키지명에서 찾은 클래스.메소드(인수)
		int i = Integer.parseInt(args[0]); //참조형이기 떄문에 캐스팅 불가 참조>기본이 안됨, 문자열을 숫자로 변경하여 변수 할당
		int j = Integer.parseInt(args[1]);//참조형이기 떄문에 캐스팅 불가 참조>기본이 안됨
		long a = Long.parseLong(args[0]);
		Boolean b = Boolean.parseBoolean(args[0]);
		double d = Double.parseDouble(args[2]);
		System.out.println(d);
		System.out.println(i + j);
		System.out.println(a);
		System.out.println(b);
		
		
		

	}

}
