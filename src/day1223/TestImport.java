package day1223;

import java.util.Calendar; //Ư�� Ŭ���� �ϳ��� import ���� ��
import java.util.Date;
//import java.util.*;//��Ű���� ��� Ŭ������ import ���� ��
//��Ű���� �ٸ��� �̸��� ���ٸ� �ϳ��� import ó���� �� �ִ�.

import day1222.HongGilDong;

/**
 * @author user
 *
 */
public class TestImport {

	public static void main(String[] args) {
		//import�� ������� ������, Ŭ������ ����� ������ full path�� ����Ͽ� ���
		//��Ű����.Ŭ������
//		java.util.Date d = new java.util.Date();
//		java.awt.Frame f = new java.awt.Frame();
		Date d = new Date();//java.util.Date�� ����ϰ� �Ͱ�
		java.sql.Date d2 = null;//java.sql.Date�� ����ϰ� �ʹ�. 
		//�� �� ���� ���� �����ϰ� ����ϴ� Ŭ������ full path�� ����Ѵ�.
		//��Ű���� �ٸ��� �̸��� ���ٸ� �ϳ��� import ó���� �� �ִ�.
		
		HongGilDong hgd = new HongGilDong();
		
		Calendar cal = Calendar.getInstance();
	}//main

}//class
