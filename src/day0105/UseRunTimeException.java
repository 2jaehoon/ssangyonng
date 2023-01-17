package day0105;


/**
 * RunTimeException ó��
 * @author user
 *
 */
public class UseRunTimeException {
	

	public static void main(String[] args) {
		//main  method�� arguments�� �� �� �Է¹޾� �� ���� ������ ����� ����ϴ� ��
		try {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = 0;
		
		result = num1/num2;
		
		System.out.println(num1 + " / " + num2 + " = " + result);

		}catch(ArrayIndexOutOfBoundsException aioobe) {
		System.err.println("��뿹) java UseRuntimeException ��1 ��2");
		}catch(NumberFormatException nfe) {
			System.err.println("�ԷµǴ� ��1�̳� ��2�� ���� �����̿��� �Ѵ�.");
			nfe.printStackTrace();//�ڼ��� �޽����� ���
			}catch(ArithmeticException ae) {//�ڽ��� Ư�� ���ܻ�Ȳ�� ó���� �� �ִ�.
				System.err.println("0���δ� ���� �� ����.");
				System.err.println(ae + "\n"); //toString ȣ��
				System.err.println(ae.getMessage() + "\n"); //�޽����� ��� ����Ŭ������ �� �� ����
				System.out.println();
			}catch(Exception e) {//�θ�� ��� ���� ��Ȳ�� ���� �� �ִ�.
				System.err.println("�����ڰ� �������� ���� ����");
			} finally {//�ݵ�� ����Ǿ���� �ڵ� ����
				System.err.println("����� �ּż� �����մϴ�.");
				
			}
		
	}//main

}//class
