package day0106;

import java.util.Random;

/**
 * ���� ���� �߻�
 * 
 * @author user
 *
 */
public class UseThrow {

	public void test() throws Exception {
		System.out.println("���� �߻���");

		if (new Random().nextBoolean()) {
			throw new Exception("���� �߻��� ������ �޽���");
		} // end if

		System.out.println("���� �߻����� ���� ����� �ڵ�");

	}// test

	public static void main(String[] args) {
		UseThrow ut = new UseThrow();

		try {
			ut.test();
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}

	}// main

}// class
