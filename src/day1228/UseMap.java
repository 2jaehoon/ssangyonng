package day1228;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Ű�� ���� ������ ������ Map�� ���
 * Ű�� ����Ͽ� ���� �˻�
 * Ű�� �����ϸ�, ���� �ߺ��� �� �ִ�.
 * @author user
 *
 */
public class UseMap {

	/**
	 * 11���� ���� �ڵ� ����
	 */
	public void useHashTable() {
		//1. ����)
		Map<String, String>map = new Hashtable<String, String>();
		//2. �� �Ҵ�) ���������� �Էµ��� �ʴ´�.
		map.put("A", "ģ���ϴ� �����ϴ�");
		map.put("B", "���� �巴��");
		map.put("AB", "������");
		map.put("O", "�����δ�");
		
		//���� Ű�� �Ҵ�Ǹ�, ������ Ű�� ���� ����.
		map.put("A", "�ҽ�");
		map.put("a", "�ؼҽ�");
		
		//map�� �� ���
		System.out.println(map.get("A"));
		
		System.out.println();
		
		
		//map�� ��� Ű ���
		Set<String>set = map.keySet();
		Iterator<String>ita = set.iterator();
		String key = "";
		while(ita.hasNext()) {
			key=ita.next();
		System.out.print(key );	//Ű�� ��� ���� ���
		System.out.println(map.get(key));	//Ű�� ��� ���� ���
		}//end while
		
		//�� ����
		map.remove("a"); //Ű�� �Է��Ͽ� ,entry ����
		
		
		//�ʿ� Ű�� �����ϴ� ��?
		System.out.println(map.containsKey("a"));
		
		//���� ��� �� ����
		map.clear();
		
		
		
		
		System.out.println(map);
		
	}//useHashTable
	
	/**
	 * 16���� �� �ڵ�����
	 */
	public void useHashMap() {
		
		//1. ����)
				Map<String, String>map = new HashMap<String, String>();
				//2. �� �Ҵ�) ���������� �Էµ��� �ʴ´�.
				map.put("A", "ģ���ϴ� �����ϴ�");
				map.put("B", "���� �巴��");
				map.put("AB", "������");
				map.put("O", "�����δ�");
				
				//���� Ű�� �Ҵ�Ǹ�, ������ Ű�� ���� ����.
				map.put("A", "�ҽ�");
				map.put("a", "�ؼҽ�");
				
				//map�� �� ���
				System.out.println(map.get("A"));
				
				System.out.println();
				
				
				//map�� ��� Ű ���
				Set<String>set = map.keySet();
				Iterator<String>ita = set.iterator();
				String key = "";
				while(ita.hasNext()) {
					key=ita.next();
				System.out.print(key );	//Ű�� ��� ���� ���
				System.out.println(map.get(key));	//Ű�� ��� ���� ���
				}//end while
				
				//�� ����
				map.remove("a"); //Ű�� �Է��Ͽ� ,entry ����
				
				
				//�ʿ� Ű�� �����ϴ� ��?
				System.out.println(map.containsKey("a"));
				
				//���� ��� �� ����
				map.clear();
				
				
				
				
				System.out.println(map);
				
		
	}//useHashMap
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.useHashTable();
		System.out.println("--------------------------------------------------");
		um.useHashMap();

	}//main

}//class
