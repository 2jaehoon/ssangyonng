package day1205;
/*
���������
+, -, *, /, %
*/




class Operator2 {
	public static void main(String[] args) {
		
	int i = 11;
	int j = 3;
	double d = 3;//3.0���� ����.

	//���� / ���� = ���� > casting�Ͽ� ó��
	System.out.println(i + " / " + j + " = " + (double)i / j);

	//���� / �Ǽ� = �Ǽ�
	System.out.println(i+ " / " + d + " = " + i / d);


	// % - ���� ������ ��� (ū ���� ����� ���� ���� ���� �� ���)
	// ū�� % �߻��� �� = �߻��� �� �ȿ��� ���� ���´�.
	i=166;
	System.out.println(i+"%2"+"="+i%2); //0,1�� ����
	System.out.println(i+"%4"+"="+i%4); //0,1,2,3�� ����

	//�ڽ��� �¾ �ظ� ������ �����ϰ�, �¾ �ظ� �Ҵ�.
	//�¾ �ظ� 12������ �� �� �ϳ��� ���� �� �ְ� �ڵ带 �ۼ��غ�����.0~11
	int yearofBorn = 1997;
	System.out.println(yearofBorn+"%12"+"="+yearofBorn%12);
	//0 ���� 1 �� 2 �� 3 ���� 4 �� 5 �� 6 ȣ�� 7 �䳢 8 �� 9 ��  10 �� 11 ��





	}
}
