package day1228;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * 입력되는 순서대로 데이터가 입력되고,
 * 중복 데이터를 저장할 수 있으며, 검색의 기능이 있다.
 * @author user
 *
 */
public class UseList {
	
	/**
	 * MultiThread에서 동시접근 가능, 속도가 빠름
	 */
	public void useArrayList() {
		//1. 생성)
		List<String> al = new ArrayList<String>();//capa가 없음, 예약된 크기가 없음
		List<String> al2 = new ArrayList<String>(10);
		//예약된 크기가 있음(10개의 데이터가 입력되기 전까지 메모리의 변화가 없다.)
		System.out.println(al.size()+ " / " + al2.size());
		
		//2. 값 할당) 값이 입력되면 List의 방의 크기가 증가된다.
		al.add("자바");
		al.add("오라클");		
		al.add("JDBC");		
		al.add("오라클");		//list계열 특징 중복값 저장 가능
		al.add("JSP");		
		al.add("HTML");		
		
		//3. 값 사용)
		System.out.println(al.get(0) + " / " + al.get(1));
		
		//배열 복사
		//1. 리스트의 크기만큼 배열을 생성
		String[] arr = new String[al.size()];
		//2. 복사
		al.toArray(arr);
		
		//3. 일괄처리
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d번째 방\t%s\n", i,al.get(i));
		}
		
		System.out.println("------------Iterator를 사용한 검색 시작");
		//1. 제어권 넘기고
		Iterator<String>ita = al.iterator();
		//2. 요소가 존재하는 지
		while(ita.hasNext()) {
		//3. 요소를 얻고 포인터를 이동
		System.out.println(ita.next());
		}
		
		System.out.println("------------Iterator를 사용한 검색 끝");

		
		//4. 삭제) 삭제하면 리스트의 크기가 줄어든다.
		//인덱스 사용
		al.remove(4);
		//삭제할 값과 일치하는 요소를 찾아서 삭제, 찾아낸 요소를 삭제한 후 작업 종료
		al.remove("오라클");
		
		//모든 방의 값 삭제
		al.clear();
		
		
		System.out.println(al.size() + " / " + al);
		
		//배열로 복사한 배열 출력
		for(String value : arr) {
			System.out.print(value + " ");
		}//end for
		System.out.println();
	}//useArrayList
	
	/**
	 * MultiThread에서 동시접근 불가능, 속도가 느림
	 */
	public void useVector() {
		//1. 생성)
				List<String> vec = new Vector<String>();//capa가 없음, 예약된 크기가 없음
				List<String> vec2 = new Vector<String>(10);
				//예약된 크기가 있음(10개의 데이터가 입력되기 전까지 메모리의 변화가 없다.)
				System.out.println(vec.size()+ " / " + vec2.size());
				
				//2. 값 할당) 값이 입력되면 List의 방의 크기가 증가된다.
				vec.add("자바");
				vec.add("오라클");		
				vec.add("JDBC");		
				vec.add("오라클");		//list계열 특징 중복값 저장 가능
				vec.add("JSP");		
				vec.add("HTML");		
				
				//3. 값 사용)
				System.out.println(vec.get(0) + " / " + vec.get(1));
				
				//배열 복사
				//1. 리스트의 크기만큼 배열을 생성
				String[] arr = new String[vec.size()];
				//2. 복사
				vec.toArray(arr);
				
				//3. 일괄처리
				for(int i=0; i<arr.length; i++) {
					System.out.printf("%d번째 방\t%s\n", i,vec.get(i));
				}

				
				//4. 삭제) 삭제하면 리스트의 크기가 줄어든다.
				//인덱스 사용
				vec.remove(4);
				//삭제할 값과 일치하는 요소를 찾아서 삭제, 찾아낸 요소를 삭제한 후 작업 종료
				vec.remove("오라클");
				
				//모든 방의 값 삭제
				vec.clear();
				
				
				System.out.println(vec.size() + " / " + vec);
				
				//배열로 복사한 배열 출력
				for(String value : arr) {
					System.out.print(value + " ");
				}//end for
				System.out.println();
		
	}//useVector
	
	
	/**
	 * 입력되는 값이 기존에 데이터 사이에 입력되는 일이 빈번할 때
	 */
	public void useLinkedList() {
		List<String> ll = new LinkedList<String>();//capa가 없음, 예약된 크기가 없음
//		List<String> ll2 = new LinkedList<String>(10);//LinkedList는 capa를 받지 않음 
		//예약된 크기가 있음(10개의 데이터가 입력되기 전까지 메모리의 변화가 없다.)
		System.out.println(ll.size()+ " / ");
		
		//2. 값 할당) 값이 입력되면 List의 방의 크기가 증가된다.
		ll.add("자바");//0
		ll.add("오라클");		//1
		ll.add("JDBC");	//2	
		ll.add("오라클");	//3	//list계열 특징 중복값 저장 가능
		ll.add("JSP");		//4
		ll.add("HTML");		//5
		
		ll.add(2,"CSS");
		
		//3. 값 사용)
		System.out.println(ll.get(0) + " / " + ll.get(1));
		
		//배열 복사
		//1. 리스트의 크기만큼 배열을 생성
		String[] arr = new String[ll.size()];
		//2. 복사
		ll.toArray(arr);
		
		//3. 일괄처리
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d번째 방\t%s\n", i,ll.get(i));
		}
		
		
//		//4. 삭제) 삭제하면 리스트의 크기가 줄어든다.
//		//인덱스 사용
//		ll.remove(4);
//		//삭제할 값과 일치하는 요소를 찾아서 삭제, 찾아낸 요소를 삭제한 후 작업 종료
//		ll.remove("오라클");
//		
//		//모든 방의 값 삭제
//		ll.clear();
		
		
		System.out.println(ll.size() + " / " + ll);
		
		//배열로 복사한 배열 출력
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
