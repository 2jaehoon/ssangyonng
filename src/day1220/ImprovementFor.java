package day1220;

public class ImprovementFor {

	public void array1() {
		// ������ �迭�� ���� ���������� �̷���� �ִ�.
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i : arr) {
			System.out.print(i + " ");
		} // end for
		System.out.println();
		String[] arr2 = { "�ȳ�", "�ϼ���", "��ſ� ȭ����", "������ ������", "�� �� �Ŀ� ĳ��� �Բ� ������" };

		for (String i : arr2) {
			System.out.print(i + " ");
		} // end for
		System.out.println();
		DataVO[] dvArr = { new DataVO("����ȣ", "��0��", 10), new DataVO("����ȣ", "��1��", 150), new DataVO("����ȣ", "��2��", 110) };
		for (DataVO dv : dvArr) {
			System.out.println(dv.getName() + "/" + dv.getAddr() + "/" + dv.getAge());
		} // end for
	}// array1

	public void array2() {
		// ������ �迭�� �� ���� ������ �迭�� �̷���� �ִ�.
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 } };
		
		for(int [] arrOne : arr) {
			for(int i : arrOne) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}// array2

	public void array3() {
		//������ �迭�� �� ���� ������ �迭�� �̷���� �ִ�.
		int[][][] arr = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		for ( int[][] arrTwo : arr) {//��
			for(int[] arrOne : arrTwo) {//��
				for(int i : arrOne) {//��
					System.out.print(i + " ");
				}
				System.out.println();
			}
			System.out.println("�� ��");
		}

	}// array3

	public static void main(String[] args) {
		ImprovementFor imfor = new ImprovementFor();
		imfor.array1();
		System.out.println("------------------------------------");
		imfor.array2();
		System.out.println("------------------------------------");
		imfor.array3();

	}// main

}// class
