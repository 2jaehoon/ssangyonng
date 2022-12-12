package day1209;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * ������ for:
 * jdk 1.5�������� �߰��� ����.
 * �迭,list,set�� ó������ ������� ��� ���� ���� ���������� ����ϱ� ���� ������� for��
 * 
 * ����)
 * for( �������� ������ : �迭��|List��|Set�� ){
 * ������
 * }
 * @author user
 *
 */
public class ImprovementFor {

	public static void main(String[] args) {
		
		int[] arr= {2022,12,9};
		//������ for��
//		for(int i = 0 ; i< arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
		
		//������ for��
		for (int value : arr) {
			System.out.print(value + "  ");
		}//end for

		System.out.println();	
		List<String>list = new ArrayList<String>();
		list.add("��¿Ƽ��");
		list.add("��¿Ƽ��");
		list.add("����Ƽ��");
		
		//������ for
//		for(int i=0; i<list.size();i++) {
//			System.out.print(list.get(i) + " ");	
//		}
		
		//������ for   //ó������ ������ ��� �� �ۿ� ���Ѵ�. ���������� ���� x
		for(String value : list) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		Set<String> set = new HashSet<String>();
		set.add("�ڹ�");
		set.add("����Ŭ");
		set.add("jsp");
		set.add("html");
		
		//������ for�� ����� �� ���� set�� ���� �͸� ����
		
		for(String value : set ) {
			System.out.print(value + " ");
		}
		
		
		
		
	}//main

}//class
