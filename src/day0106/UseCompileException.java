package day0106;

/**
 * �����ڰ� �ݵ�� try~catch�� ó���ؾ� �ϴ� ����
 * @author user
 *
 */
public class UseCompileException {
	
	public UseCompileException() {
		
		//Ŭ������ �ε�
	try {
		Class cls = Class.forName("java.lang.String");
		System.out.println("Ŭ���� �ε� ����" + cls);
	} catch (ClassNotFoundException cnfe) {
		// TODO Auto-generated catch block
		System.err.println("Ŭ���� �ε� ���� " + cnfe);
		cnfe.printStackTrace();
	}
		
	}//UseCompileException

	public static void main(String[] args) {
		new UseCompileException();
		
	}//main

}//class                           
