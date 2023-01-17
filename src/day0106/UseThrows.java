package day0106;

/**
 * 메서드에서 예외를 날림 => 호출한 곳에서 예외를 처리
 * (예외발생코드와 예외처리코드를 분리할 수 있다.
 * @author user
 *
 */
public class UseThrows {
	
	public void test(String className)throws ClassNotFoundException {
		System.out.println("로딩 전");
		
		Class.forName(className);
		
		System.out.println("로딩 후");
	}//test

	public static void main(String[] args) {
		UseThrows ut = new UseThrows();
		try {
			ut.test("day0106.UseThrows");
			System.out.println("클래스 로딩 성공 이후 코드");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로딩 실패 대피 코드");
			e.printStackTrace();
		}

	}

}
