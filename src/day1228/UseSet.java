package day1228;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 데이터가 순차적으로 입력되지 않음
 * 중복데이터가 입력되지 않는다.
 * 데이터를 유일하게 관리할 수 있다.
 * 검색의 기능이 없다.
 * @author user
 *
 */
public class UseSet {
	public UseSet() {
		//1. 생성
		Set<String> set= new HashSet<String>();		
		
		//2. 값 할당
		set.add("김경태");
		set.add("김규미");
		set.add("김보경");
		set.add("모민경");
		set.add("자바");
		set.add("오라클");
		set.add("자바");//중복값은 입력되지 않는다.
		
		//배열로 복사
		String[] temp = new String[set.size()];
		//복사
		set.toArray(temp);
		
		//3. 삭제) 인덱스로는 삭제할 수 없다.
		set.remove("오라클");
		
		//4. 검색 - 기능 없음 => Iterator 사용
		//1.제어권 넘김
		Iterator<String> ita = set.iterator();
		//2. 요소가 있는지 판단
//		System.out.println(ita.hasNext());//포인터 다음에 요소 있어?
//		System.out.println(ita.next());//꺼내고 포인터 다음으로 넘어가
		while(ita.hasNext()) {
			//3. 요소가 있다면 값을 얻고 포인터를 다음으로 이동한다.
			System.out.println(ita.next());
			
		}//end while
		System.out.println("----------------------------");
		//포인터는 한 번 얻어서 지나가면 끝 다시하면 출력x
//		while(ita.hasNext()) {
//			//3. 요소가 있다면 값을 얻고 포인터를 다음으로 이동한다.
//			System.out.println(ita.next());
//			
//		}//end while
		
		System.out.println("--------개선된 for 사용 검색 시작------------------------");
		for(String value : set) {
		System.out.println(value);
		}//end for
		System.out.println("--------개선된 for 사용 검색 끝------------------------");
		
		System.out.println(set.size() + " / " + set);
	}//UseSet

	public static void main(String[] args) {
		new UseSet();
	}//main

}//class
