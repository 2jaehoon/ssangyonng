package day1228;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 키와 값의 쌍으로 구성된 Map의 사용
 * 키를 사용하여 값을 검색
 * 키는 유일하며, 값은 중복될 수 있다.
 * @author user
 *
 */
public class UseMap {

	/**
	 * 11개의 행이 자동 생성
	 */
	public void useHashTable() {
		//1. 생성)
		Map<String, String>map = new Hashtable<String, String>();
		//2. 값 할당) 순차적으로 입력되지 않는다.
		map.put("A", "친절하다 세심하다");
		map.put("B", "성질 드럽다");
		map.put("AB", "싸이코");
		map.put("O", "우유부단");
		
		//값은 키가 할당되면, 기존의 키에 덮어 쓴다.
		map.put("A", "소심");
		map.put("a", "극소심");
		
		//map의 값 얻기
		System.out.println(map.get("A"));
		
		System.out.println();
		
		
		//map의 모든 키 얻기
		Set<String>set = map.keySet();
		Iterator<String>ita = set.iterator();
		String key = "";
		while(ita.hasNext()) {
			key=ita.next();
		System.out.print(key );	//키와 모든 값을 출력
		System.out.println(map.get(key));	//키와 모든 값을 출력
		}//end while
		
		//맵 삭제
		map.remove("a"); //키를 입력하여 ,entry 삭제
		
		
		//맵에 키가 존재하는 지?
		System.out.println(map.containsKey("a"));
		
		//맵의 모든 값 삭제
		map.clear();
		
		
		
		
		System.out.println(map);
		
	}//useHashTable
	
	/**
	 * 16개의 행 자동생성
	 */
	public void useHashMap() {
		
		//1. 생성)
				Map<String, String>map = new HashMap<String, String>();
				//2. 값 할당) 순차적으로 입력되지 않는다.
				map.put("A", "친절하다 세심하다");
				map.put("B", "성질 드럽다");
				map.put("AB", "싸이코");
				map.put("O", "우유부단");
				
				//값은 키가 할당되면, 기존의 키에 덮어 쓴다.
				map.put("A", "소심");
				map.put("a", "극소심");
				
				//map의 값 얻기
				System.out.println(map.get("A"));
				
				System.out.println();
				
				
				//map의 모든 키 얻기
				Set<String>set = map.keySet();
				Iterator<String>ita = set.iterator();
				String key = "";
				while(ita.hasNext()) {
					key=ita.next();
				System.out.print(key );	//키와 모든 값을 출력
				System.out.println(map.get(key));	//키와 모든 값을 출력
				}//end while
				
				//맵 삭제
				map.remove("a"); //키를 입력하여 ,entry 삭제
				
				
				//맵에 키가 존재하는 지?
				System.out.println(map.containsKey("a"));
				
				//맵의 모든 값 삭제
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
