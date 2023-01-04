package day1227;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic�� ���� ���
 * @author user
 *
 */
public class UseGeneric {
	
	@SuppressWarnings({ "rawtypes", "unchecked", "removal" })
	public UseGeneric() {
		//1. ����)
//		List list = new ArrayList(); ���� x
		List<Integer>list = new ArrayList<Integer>();
		//2. �� �Ҵ�) Generic�� ������ ������ ��� ������ ���� �� �Է��� �� �ִ�.
		//JDK1,5�������ʹ� �⺻���� �Էµ� �� �⺻���� ��ü�� ��������� �� �ִ� 
		//Wrapper Class�� �ڵ������Ǿ� �⺻ �� ���� ��ü ������ �� �߰��ȴ�.
		list.add(12); //0��° �濡 �Է� => list.add(new Integer(12)); => list.add(Integer.valueOf(12));
		//                                                 javaSE8 JDK1.8                         JavaSE9 JDK1.9
		list.add(27); //1��° �濡 �Է�
		
//		list.add("�ȳ�"); //2��° �濡 �Է� - ���� ���� ���� �ٸ� ���������� �Է��� �� �ִ�.
		//Generic���� �ٸ��� ������ String ���� error ��
		
		list.add(new Integer(27)); //JDK 1.8����
		list.add(Integer.valueOf(27)); //JDK 1.8����
		
		
		//3. �� ���)
		for(int i=0; i<list.size();i++) {
			//���� ���� �� error �߻�
//		System.out.println(list.get(i));//unboxing
		System.out.println((Integer)list.get(i).intValue());//unboxing
		}//end for
	}//UseGeneric

	public static void main(String[] args) {
		new UseGeneric();

	}//main

}//class
