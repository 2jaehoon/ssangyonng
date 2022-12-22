package day1220;

import java.util.Arrays;

/**
 * ������ �迭 : ��, ��, ���� ������ �迭
 * 
 * @author user
 *
 */
public class UseArray3 {
	
	public UseArray3() {
		//�⺻�� ������ ��� : �������� [][][] �迭�� = {{{��..},{��.,,}},{{��..},{��.,,}}};
		int [][][] arr = {{{10,20},{30,40},{50,60}},{{70,80},{90,100},{110,120}}};
		System.out.println("���� �� : " + arr.length);
		System.out.println("���� �� : " + arr[0].length);
		System.out.println("���� �� :" + arr[0][0].length);
		
		System.out.println("-------------------------------------------------");
		
		
		
	}

	public void useArray3() {
		// 1.���� : ��������[][][] �迭�� = null;
		int[][][] arr = null;
		// 2.���� : �迭�� = new �������� [��][��][��];
		arr = new int[3][2][3];
		System.out.println("�� : " + arr.length + " �� : " + arr[0].length + " �� : " + arr[0][0].length);
		// 3.���Ҵ�
		arr[0][0][0] = 2022;
		arr[1][1][2] = 12;
		arr[2][0][1] = 20;
		// 4.�����
		System.out.println(arr[0][0][0] + "/" + arr[0][0][1]);
		for (int i = 0; i < arr.length; i++) {// ��
			System.out.println(i + "�� ����");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(j + "�� ����");
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("arr[%d][%d][%d]=%d\t ",i,j,k,arr[i][j][k]);
				} // end for
				System.out.println(j + "�� ��");
			} // end for
			System.out.println(i + "�� ��");
		} // end for
	}// useArray3

	public static void main(String[] args) {
		new UseArray3().useArray3();
	}// main

}// class
