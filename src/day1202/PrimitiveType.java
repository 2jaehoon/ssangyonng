package day1202;
class PrimitiveType {
	public static void main(String[] args) {
		System.out.println("----������---------------------");
		byte a = 10; //-2�� 7��~2�� 7��-1
		short b = 20; //
		int c = 30;
		long d = 40;
	

		System.out.println("byte : " + a + " short : " + b + " int : " + c + " long : " + d);

		//e������ �����ϰ� 24���� �Ҵ��� ������
		long e = 2_400_000_000L;        //long e = 2_400_000_000; ���� ���� ��Ʈ ���ͷ� ����ǹǷ� long �� ������ ������ L�߰� 4byte > 8byte
		System.out.printf("%d\n",e);
		System.out.println("����� L :" + e);

		int ab = '��';
		System.out.printf("%d\n", ab);

		System.out.println("--------������---------------");
		char f = 'A';//�����ڵ� ���� �Ҵ�
		char g = 57; //�����ڵ尪 ���� �Ҵ�
		System.out.println("char : " + f + ",  " + g); //�����ڵ尪�� �ش��ϴ� ���� ���


		System.out.println("--------�Ǽ���---------------");
		float h = 2022.12f;//�Ǽ� ���ͷ����� float���� f �ʼ� 8>4byte�� �ٲ�
		double i = 2022.12;//�Ǽ� ���ͷ� �⺻�� �������� ���� 8byte ����� ���� ����
		double j = 2022.12d;


		System.out.println("float : " +h + ", double : " + j );
		System.out.println("--------�Ҹ���---------------");
		boolean k = true;
		boolean l = false;
		//boolean���� true,false�ۿ� ���� ��
		System.out.println("boolean :" + k + ", " + l);

	

  }
}
