package day1207;

 /**
 * @author user
 * ����)
 *java TestArguments �� .......
 */
public class TestArguments {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println((Integer.parseInt(args[0])+Integer.parseInt(args[1]))); //���ڿ��� +������ ������ �ǹ�
		//api�������� ��Ű������ ã�� Ŭ����.�޼ҵ�(�μ�)
		int i = Integer.parseInt(args[0]); //�������̱� ������ ĳ���� �Ұ� ����>�⺻�� �ȵ�, ���ڿ��� ���ڷ� �����Ͽ� ���� �Ҵ�
		int j = Integer.parseInt(args[1]);//�������̱� ������ ĳ���� �Ұ� ����>�⺻�� �ȵ�
		long a = Long.parseLong(args[0]);
		Boolean b = Boolean.parseBoolean(args[0]);
		double d = Double.parseDouble(args[2]);
		System.out.println(d);
		System.out.println(i + j);
		System.out.println(a);
		System.out.println(b);
		
		
		

	}

}
