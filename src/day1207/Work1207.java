package day1207;

public class Work1207 {

	public static void main(String[] args) {
		//1.
		int i = 12;
		i = ~(i)+1;
		System.out.println("i�� 2�� ���� : " + i);
		System.out.println();
		//2
		int temp1 = 10, temp2 = 20;
		System.out.println("++temp1 + temp2-- : "+(++temp1 + temp2--));
		//���������ڷ� ����1���� ���� ������ 11 ���� �����ڷ� ����2���� ����� �����ϴ� 31�� ���
		System.out.println("temp1 =" + temp1 + "/temp2 = " + temp2);
		//���� ������ ����1�� 11 ����� ���߿� ������ ����2 �� 19
		System.out.println();
		//3
		int temp3 = 0;
		temp3 = Integer.MAX_VALUE;
		System.out.println("temp3<<4 : " + (temp3<<4));
		System.out.println();
		//4
		int temp4 = 0;
		temp4= Integer.MAX_VALUE;
		System.out.println("temp4&65535 : " + (temp4&65535));
		System.out.println();
		
		

		
		

	}

}
