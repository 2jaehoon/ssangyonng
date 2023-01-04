package day1226;

import java.util.StringTokenizer;

/**
 * ���ڿ��� ª�� �ϳ��� ����� ����(��ū)�� �� ����ϴ� Ŭ����
 * 
 * @author user
 *
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
//		String msg = "�ڹ� ����Ŭ JDBC HTML CSS JavaScript JSP";
		String csvData = "�ڹ�~����Ŭ/JDBC.HTML,CSS.JavaScript,JSP";
		// CSV (Comma Separated Value) Data : ,�� ���е� ��
		// , �Ǵ� Ư�� ���ڷ� ���е� ���ڿ� �����͸� CSV �����Ͷ�� �Ѵ�.
		// 1. ����)
		// �������� ��ū�� �����ϴ� ������
//		StringTokenizer stk = new StringTokenizer(msg);
		// Ư�� ���ڿ��� ��ū�� �����ϴ� ������ (�����ڴ� OR ����� �ִ�.)
//		StringTokenizer stk = new StringTokenizer(csvData,",.~/");
		// Ư�� ���ڿ��� ��ū�� �����ϴ� ������ (�����ڴ� OR ����� �ִ�.) (�����ڸ� ��ū���� ���� ��)
		StringTokenizer stk = new StringTokenizer(csvData, ",.~/", true);

		// �Էµ� ���� ������� ������ �Էµ� ���� �����͸� �����Ѵ�.
		System.out.println(stk);// StringTokenizer�� toString�� Override�� �Ǿ� ���� �ʱ� ������ �ּҰ� ����
		// 2. ���)
		System.out.println("��ū�� �� : " + stk.countTokens());

		String token = "";
		while (stk.hasMoreTokens()) {// ��ū�� �ִ� �� ���� �� ������ �ִٸ� ������ �ڸ���
			token = stk.nextToken();
			System.out.println(token);
		} // end while
		System.out.println("��ū�� �� : " + stk.countTokens());

	}// UseStringTokenizer

	public static void main(String[] args) {
		new UseStringTokenizer();
	}// main

}// class
