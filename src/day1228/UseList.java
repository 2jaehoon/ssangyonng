package day1228;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * �ԷµǴ� ������� �����Ͱ� �Էµǰ�,
 * �ߺ� �����͸� ������ �� ������, �˻��� ����� �ִ�.
 * @author user
 *
 */
public class UseList {
	
	/**
	 * MultiThread���� �������� ����, �ӵ��� ����
	 */
	public void useArrayList() {
		//1. ����)
		List<String> al = new ArrayList<String>();//capa�� ����, ����� ũ�Ⱑ ����
		List<String> al2 = new ArrayList<String>(10);
		//����� ũ�Ⱑ ����(10���� �����Ͱ� �ԷµǱ� ������ �޸��� ��ȭ�� ����.)
		System.out.println(al.size()+ " / " + al2.size());
		
		//2. �� �Ҵ�) ���� �ԷµǸ� List�� ���� ũ�Ⱑ �����ȴ�.
		al.add("�ڹ�");
		al.add("����Ŭ");		
		al.add("JDBC");		
		al.add("����Ŭ");		//list�迭 Ư¡ �ߺ��� ���� ����
		al.add("JSP");		
		al.add("HTML");		
		
		//3. �� ���)
		System.out.println(al.get(0) + " / " + al.get(1));
		
		//�迭 ����
		//1. ����Ʈ�� ũ�⸸ŭ �迭�� ����
		String[] arr = new String[al.size()];
		//2. ����
		al.toArray(arr);
		
		//3. �ϰ�ó��
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d��° ��\t%s\n", i,al.get(i));
		}
		
		System.out.println("------------Iterator�� ����� �˻� ����");
		//1. ����� �ѱ��
		Iterator<String>ita = al.iterator();
		//2. ��Ұ� �����ϴ� ��
		while(ita.hasNext()) {
		//3. ��Ҹ� ��� �����͸� �̵�
		System.out.println(ita.next());
		}
		
		System.out.println("------------Iterator�� ����� �˻� ��");

		
		//4. ����) �����ϸ� ����Ʈ�� ũ�Ⱑ �پ���.
		//�ε��� ���
		al.remove(4);
		//������ ���� ��ġ�ϴ� ��Ҹ� ã�Ƽ� ����, ã�Ƴ� ��Ҹ� ������ �� �۾� ����
		al.remove("����Ŭ");
		
		//��� ���� �� ����
		al.clear();
		
		
		System.out.println(al.size() + " / " + al);
		
		//�迭�� ������ �迭 ���
		for(String value : arr) {
			System.out.print(value + " ");
		}//end for
		System.out.println();
	}//useArrayList
	
	/**
	 * MultiThread���� �������� �Ұ���, �ӵ��� ����
	 */
	public void useVector() {
		//1. ����)
				List<String> vec = new Vector<String>();//capa�� ����, ����� ũ�Ⱑ ����
				List<String> vec2 = new Vector<String>(10);
				//����� ũ�Ⱑ ����(10���� �����Ͱ� �ԷµǱ� ������ �޸��� ��ȭ�� ����.)
				System.out.println(vec.size()+ " / " + vec2.size());
				
				//2. �� �Ҵ�) ���� �ԷµǸ� List�� ���� ũ�Ⱑ �����ȴ�.
				vec.add("�ڹ�");
				vec.add("����Ŭ");		
				vec.add("JDBC");		
				vec.add("����Ŭ");		//list�迭 Ư¡ �ߺ��� ���� ����
				vec.add("JSP");		
				vec.add("HTML");		
				
				//3. �� ���)
				System.out.println(vec.get(0) + " / " + vec.get(1));
				
				//�迭 ����
				//1. ����Ʈ�� ũ�⸸ŭ �迭�� ����
				String[] arr = new String[vec.size()];
				//2. ����
				vec.toArray(arr);
				
				//3. �ϰ�ó��
				for(int i=0; i<arr.length; i++) {
					System.out.printf("%d��° ��\t%s\n", i,vec.get(i));
				}

				
				//4. ����) �����ϸ� ����Ʈ�� ũ�Ⱑ �پ���.
				//�ε��� ���
				vec.remove(4);
				//������ ���� ��ġ�ϴ� ��Ҹ� ã�Ƽ� ����, ã�Ƴ� ��Ҹ� ������ �� �۾� ����
				vec.remove("����Ŭ");
				
				//��� ���� �� ����
				vec.clear();
				
				
				System.out.println(vec.size() + " / " + vec);
				
				//�迭�� ������ �迭 ���
				for(String value : arr) {
					System.out.print(value + " ");
				}//end for
				System.out.println();
		
	}//useVector
	
	
	/**
	 * �ԷµǴ� ���� ������ ������ ���̿� �ԷµǴ� ���� ����� ��
	 */
	public void useLinkedList() {
		List<String> ll = new LinkedList<String>();//capa�� ����, ����� ũ�Ⱑ ����
//		List<String> ll2 = new LinkedList<String>(10);//LinkedList�� capa�� ���� ���� 
		//����� ũ�Ⱑ ����(10���� �����Ͱ� �ԷµǱ� ������ �޸��� ��ȭ�� ����.)
		System.out.println(ll.size()+ " / ");
		
		//2. �� �Ҵ�) ���� �ԷµǸ� List�� ���� ũ�Ⱑ �����ȴ�.
		ll.add("�ڹ�");//0
		ll.add("����Ŭ");		//1
		ll.add("JDBC");	//2	
		ll.add("����Ŭ");	//3	//list�迭 Ư¡ �ߺ��� ���� ����
		ll.add("JSP");		//4
		ll.add("HTML");		//5
		
		ll.add(2,"CSS");
		
		//3. �� ���)
		System.out.println(ll.get(0) + " / " + ll.get(1));
		
		//�迭 ����
		//1. ����Ʈ�� ũ�⸸ŭ �迭�� ����
		String[] arr = new String[ll.size()];
		//2. ����
		ll.toArray(arr);
		
		//3. �ϰ�ó��
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d��° ��\t%s\n", i,ll.get(i));
		}
		
		
//		//4. ����) �����ϸ� ����Ʈ�� ũ�Ⱑ �پ���.
//		//�ε��� ���
//		ll.remove(4);
//		//������ ���� ��ġ�ϴ� ��Ҹ� ã�Ƽ� ����, ã�Ƴ� ��Ҹ� ������ �� �۾� ����
//		ll.remove("����Ŭ");
//		
//		//��� ���� �� ����
//		ll.clear();
		
		
		System.out.println(ll.size() + " / " + ll);
		
		//�迭�� ������ �迭 ���
		for(String value : arr) {
			System.out.print(value + " ");
		}//end for
		System.out.println();
		
	}//useLinkedList

	public static void main(String[] args) {
		UseList ul = new UseList();
		ul.useArrayList();
		System.out.println("---------------------------------------------");
		ul.useVector();
		System.out.println("---------------------------------------------");
		ul.useLinkedList();
	}//main

}//class
