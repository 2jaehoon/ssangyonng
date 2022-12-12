package day1209;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * 개선된 for:
 * jdk 1.5에서부터 추가된 문법.
 * 배열,list,set의 처음부터 끝방까지 모든 방의 값을 순차적으로 출력하기 위해 만들어진 for형
 * 
 * 문법)
 * for( 데이터형 변수명 : 배열명|List명|Set명 ){
 * 변수명
 * }
 * @author user
 *
 */
public class ImprovementFor {

	public static void main(String[] args) {
		
		int[] arr= {2022,12,9};
		//기존의 for문
//		for(int i = 0 ; i< arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
		
		//개선된 for문
		for (int value : arr) {
			System.out.print(value + "  ");
		}//end for

		System.out.println();	
		List<String>list = new ArrayList<String>();
		list.add("어쩔티비");
		list.add("저쩔티비");
		list.add("뇌절티비");
		
		//기존의 for
//		for(int i=0; i<list.size();i++) {
//			System.out.print(list.get(i) + " ");	
//		}
		
		//개선된 for   //처음부터 끝까지 찍는 거 밖에 못한다. 세부적으로 선택 x
		for(String value : list) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		Set<String> set = new HashSet<String>();
		set.add("자바");
		set.add("오라클");
		set.add("jsp");
		set.add("html");
		
		//기존의 for로 출력할 수 없다 set은 향상된 것만 가능
		
		for(String value : set ) {
			System.out.print(value + " ");
		}
		
		
		
		
	}//main

}//class
