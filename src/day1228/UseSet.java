package day1228;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * �����Ͱ� ���������� �Էµ��� ����
 * �ߺ������Ͱ� �Էµ��� �ʴ´�.
 * �����͸� �����ϰ� ������ �� �ִ�.
 * �˻��� ����� ����.
 * @author user
 *
 */
public class UseSet {
	public UseSet() {
		//1. ����
		Set<String> set= new HashSet<String>();		
		
		//2. �� �Ҵ�
		set.add("�����");
		set.add("��Թ�");
		set.add("�躸��");
		set.add("��ΰ�");
		set.add("�ڹ�");
		set.add("����Ŭ");
		set.add("�ڹ�");//�ߺ����� �Էµ��� �ʴ´�.
		
		//�迭�� ����
		String[] temp = new String[set.size()];
		//����
		set.toArray(temp);
		
		//3. ����) �ε����δ� ������ �� ����.
		set.remove("����Ŭ");
		
		//4. �˻� - ��� ���� => Iterator ���
		//1.����� �ѱ�
		Iterator<String> ita = set.iterator();
		//2. ��Ұ� �ִ��� �Ǵ�
//		System.out.println(ita.hasNext());//������ ������ ��� �־�?
//		System.out.println(ita.next());//������ ������ �������� �Ѿ
		while(ita.hasNext()) {
			//3. ��Ұ� �ִٸ� ���� ��� �����͸� �������� �̵��Ѵ�.
			System.out.println(ita.next());
			
		}//end while
		System.out.println("----------------------------");
		//�����ʹ� �� �� �� �������� �� �ٽ��ϸ� ���x
//		while(ita.hasNext()) {
//			//3. ��Ұ� �ִٸ� ���� ��� �����͸� �������� �̵��Ѵ�.
//			System.out.println(ita.next());
//			
//		}//end while
		
		System.out.println("--------������ for ��� �˻� ����------------------------");
		for(String value : set) {
		System.out.println(value);
		}//end for
		System.out.println("--------������ for ��� �˻� ��------------------------");
		
		System.out.println(set.size() + " / " + set);
	}//UseSet

	public static void main(String[] args) {
		new UseSet();
	}//main

}//class
