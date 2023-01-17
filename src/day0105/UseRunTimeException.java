package day0105;


/**
 * RunTimeException 처리
 * @author user
 *
 */
public class UseRunTimeException {
	

	public static void main(String[] args) {
		//main  method에 arguments를 두 개 입력받아 두 수를 나누어 결과를 출력하는 일
		try {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = 0;
		
		result = num1/num2;
		
		System.out.println(num1 + " / " + num2 + " = " + result);

		}catch(ArrayIndexOutOfBoundsException aioobe) {
		System.err.println("사용예) java UseRuntimeException 값1 값2");
		}catch(NumberFormatException nfe) {
			System.err.println("입력되는 값1이나 값2는 숫자 형태이여야 한다.");
			nfe.printStackTrace();//자세한 메시지의 출력
			}catch(ArithmeticException ae) {//자식은 특정 예외상황만 처리할 수 있다.
				System.err.println("0으로는 나눌 수 없다.");
				System.err.println(ae + "\n"); //toString 호출
				System.err.println(ae.getMessage() + "\n"); //메시지만 출력 예외클래스를 알 수 없음
				System.out.println();
			}catch(Exception e) {//부모는 모든 예외 상황을 잡을 수 있다.
				System.err.println("개발자가 예상하지 못한 예외");
			} finally {//반드시 실행되어야할 코드 정의
				System.err.println("사용해 주셔서 감사합니다.");
				
			}
		
	}//main

}//class
