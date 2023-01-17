package day0106;

/**
 * 개발자가 반드시 try~catch로 처리해야 하는 예외
 * @author user
 *
 */
public class UseCompileException {
	
	public UseCompileException() {
		
		//클래스를 로딩
	try {
		Class cls = Class.forName("java.lang.String");
		System.out.println("클래스 로딩 성공" + cls);
	} catch (ClassNotFoundException cnfe) {
		// TODO Auto-generated catch block
		System.err.println("클래스 로딩 실패 " + cnfe);
		cnfe.printStackTrace();
	}
		
	}//UseCompileException

	public static void main(String[] args) {
		new UseCompileException();
		
	}//main

}//class                           
