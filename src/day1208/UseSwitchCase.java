package day1208;

/**
 * ��� ���� ���ϴ� if
 * 
 * ��ġ�ϴ� ������ ���� �� ����ϴ� switch case ����) switch (������) { case ��� : �������� ����� ���� ��
 * ���๮���; case ��� : �������� ����� ���� �� ���๮���; case ��� : �������� ����� ���� �� ���๮���;
 * 
 * 
 * 
 * default : ���� ���� ����� case�� �غ�� ����� ���� ���� ���� �� ���� ����..; }
 * 
 * @author user
 *
 */
public class UseSwitchCase {

	public static void main(String[] args) {
		int i = -32768; //byte, short, int�� �Է°���, .long �� �Է� �Ұ�

		switch (i) {// switch �ԷµǴ� ������ byte, short, int, char JDK1.7���ʹ� String�� ��� ����)
		
		//case ����� �ԷµǴ� ���������� ���������� ��� �����ϴ�.
		case 0:
			System.out.println("0 case ����");
		case 1:
			System.out.println("1 case ����");
		case 2:
			System.out.println("2 case ����");
		case 3:
			System.out.println("3 case ����");
		default:
			System.out.println("��ġ�ϴ� case�� ����� ���� �� ����.");

		}// end switch
		
		
		
		System.out.println("-------------------");
		char c = 65;
		switch ( c ) {
		//char���� �ԷµǸ� case�� ���� �Ǵ� �����ڵ带 ����� �� �ִ�.
		case 'A': System.out.println("�Է¹��� A");
		case 'B': System.out.println("�Է¹��� B");
		case 67: System.out.println("�Է¹��� C");
		default : System.out.println("�غ�� ��� ����");
		}//end switch
		System.out.println("-------------------");
		
		String str = "VB";
		switch( str ){ //JDK1.7 �̻��϶��� ����
		case  "Java" : System.out.println("�Ϻ��� oop���"); break;
		case  "C" : System.out.println("�������� ���α׷���"); 
		case  "C++" : System.out.println("C�� ������ ���"); break; 
		case  "VB" : System.out.println("������Ʈ ���α׷���"); break;
		default : System.out.println("�غ�� �� ����.");
		}
		
		

	}

}
