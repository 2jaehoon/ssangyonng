package day1219;

/**
 * ������ �迭 ���.
 * @author user
 *
 */
public class UseArray1 {
	
	public UseArray1() {
		//1. ���� ��������[] �迭�� = null;
		int[] arr = null;
		//2. ���� �迭�� = new ��������[���� ����];  //��� ���� ���� �ʱ�ȭ ���� �ö󰡱� ������
		arr=new int[5];
		System.out.println(arr + "/ ���� ���� " + arr.length);
		//3. �� �Ҵ� �迭��[���� �ε���] = ��;
		arr[0]=2022;
		arr[1]=12;
		//4. �� ��� �迭��[���� �ε���]
		System.out.printf("arr[%d] : %d, arr[4] : %d\n", 0, arr[0], arr[4]);
		System.out.println("��� �� �� ���");
		for(int i =0; i<arr.length;i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}//end for
	System.out.println("-------------------------------------------------------");
	//�⺻�� ���� ���
	//��������[] �迭�� = new ��������[](��,,,,,,,,}; new ���������� ����� ������ ���� �� ���� ���� ����
	int[] arr2 = /* new int[] */{2022, 12, 19, 15, 12};
	arr2[4] = 13;
	for(int i =0; i<arr2.length;i++) {
		System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
	}//end for
	
	//�׽�Ʈ ��� �̸��� ���� �л��� ������ �ô�.
	//���� : �ڹ� 80��, ����Ŭ 97��, JSP : 94��, HTML 100���� �޾Ҵ�.
	//�� ����� ����, ������ ����غ���
	//����  ����
	//
	//        ����
	
	System.out.println("����\t����");
	arr = new int[] {80, 97, 94, 100};
	
	int sum = 0;
	String[] str = new String[] {"�ڹ�", "����Ŭ", "JSP", "HTML"};
	for(int i =0; i<arr.length;i++) {
		System.out.printf("%s : %d\n", str[i], arr[i]);
		sum += arr[i];
	}//end for
	System.out.println("���� : " + sum);
	
	float average = sum/(float)arr.length;
	System.out.println("��� : " + average);
	
	System.out.println("---------------------------------------------------------------------------------");
	//arr2 �迭�� ���� ������ ����� ����� �غ��ô�.
	for(int i= arr2.length-1; i>-1; i--) {
		System.out.println(arr2[i]);
	}//end for
	
	
	
	
	
	}//UseArray1
	
	public static void main(String[] args) {
		//Ŭ������ ��ü�� = new ������();
		new UseArray1(); //��üȭ �� ������ �޼ҵ带 ȣ���� �ʿ䰡 ���� �� ����ϴ� ����
	}//main

}//class
