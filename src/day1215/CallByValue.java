package day1215;


/**
 * method�� parameter�� �⺻�� ������ ���� ��� �ԷµǴ� ���� ����Ǿ� ���� �ȴ�.<br>
 * (method �ȿ��� ���� �����ϴ��� ����� ���� �����ϱ� ������
 * ���� ������ ������ ���� �ʴ´�.)
 * @author user
 *
 */
public class CallByValue {
	
	public void swap(int i, int j) { //�̸��� ���� �ƿ� �ٸ� ����
	int temp = i;
	i = j;
	j = temp;
	System.out.println("swap method i : " + i +",j = "+ j); //i = 15, j = 12;
	}//swap 

	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		int i = 12;
		int j = 15;
		System.out.println("swap �� i : " + i + ", j = "+ j); // i = 12, j =15
		cbv.swap(i, j); //i������ j������ �����
		System.out.println("swap �� i : " + i + ", j = "+ j); // i = 12, j =15
	}//main

}//class
