package day1213;

import java.util.Arrays;

/**
 * variable arguments<br>
 * �Ű����� (parameter)�� �ϳ��̳�, �Է� ��(arguments)�� ������ �������� �Է��� �� �ִ�
 * method
 * @author user
 *
 */
public class VariableArguments {
	
	/**
	 * int ������ �Է� ���� �� ���� ���� �� �ִ� method
	 * @param param
	 */
	public void vaMethod(int ... param) {
		for(int i = 0; i < param.length; i++) {
		System.out.println(param[i] + "\t");
		}
		System.out.println();
	}//vaMethod
	
	//variable arguments�� �������� �Ű������� �Բ� ������ ������ ���� ���������� ������ �� �ִ�.
//	public void vaMethod2(int i, int ... va,double d) {
//		
//	}
	public void vaMethod2(int i, double d, int ... va) {
		System.out.println("parameter i " + i);
		System.out.println("parameter d " + d);
		System.out.println(Arrays.toString(va));
	
	}

	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		//ȣ�� : �Ű������� �ϳ����� �Է°��� ������ ���� �� �ֵ�.
		System.out.println("�Է°� ����");
		va.vaMethod();
		System.out.println("�Է°� �ϳ�");
		va.vaMethod(0);
		System.out.println("�Է°� ������");
		va.vaMethod(0,1,2,3,4,100,300);
		//���������� �ٸ��� error
		//va.vaMethod(0.1);
		
		//�������� �Ű������� �Բ� ���� v.a ȣ��
		//1. v.a����
		va.vaMethod2(2022,12.13);
		//2. v.a �� �ϳ� �Է�
		va.vaMethod2(12, 12.56, 1);
		//3. v.a �� ���� �� �Է�
		va.vaMethod2(12, 12.56, 1,12,13,14,15);
		

	

	}//main

}//class
