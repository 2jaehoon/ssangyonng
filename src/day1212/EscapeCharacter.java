package day1212;

/**
 * Ư�������� ���
 * \���� �� �������� ����ϴ� ����� ���� ���ڵ�.
 * 
 * @author user
 *
 */
public class EscapeCharacter {

	public static void main(String[] args) {
		
		//�ֿܼ� �ȳ��ϼ���?�� �� �� ���
		System.out.println("�ȳ��ϼ���?");
		System.out.println("'�ȳ��ϼ���?'");
		System.out.println("\"�ȳ��ϼ���?\""); //"�� ���ڿ��� ���۰� ���� ǥ���ϴ� ��ȣ \"�� ����ϸ� "�� ���ڷ� ����
		System.out.println("�ȳ�\t�ϼ���?");
		System.out.println("�ȳ�\r�ϼ���?");//Windows�� \r�̳� \n ���� ���ۼ���
		System.out.println("�ȳ�\n�ϼ���?");//Linux�� \n�� ����
		System.out.println("�ȳ�'��'����");
		System.out.println("�ȳ�\'��\'����");
		//Ư�����ڴ� ������ ���� �̿��� ���ڸ� ����ϸ� error
		//widows���� �ڹ� ��θ� e:\dev\env.bat�� �����Ͽ���.
		System.out.println("widows���� �ڹ� ��θ� e:\\dev\\env.bat�� �����Ͽ���."); //���ǥ���� ���� /�� ����
		
		
		
	}

}
