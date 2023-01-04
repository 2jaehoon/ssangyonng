package day1227;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic에 대한 사용
 * @author user
 *
 */
public class UseGeneric {
	
	@SuppressWarnings({ "rawtypes", "unchecked", "removal" })
	public UseGeneric() {
		//1. 생성)
//		List list = new ArrayList(); 권장 x
		List<Integer>list = new ArrayList<Integer>();
		//2. 값 할당) Generic이 사용되지 않으면 모든 형태의 값을 다 입력할 수 있다.
		//JDK1,5에서부터는 기본형이 입력될 때 기본형을 객체로 만들어사용할 수 있는 
		//Wrapper Class가 자동생성되어 기본 형 값이 객체 생성된 후 추가된다.
		list.add(12); //0번째 방에 입력 => list.add(new Integer(12)); => list.add(Integer.valueOf(12));
		//                                                 javaSE8 JDK1.8                         JavaSE9 JDK1.9
		list.add(27); //1번째 방에 입력
		
//		list.add("안녕"); //2번째 방에 입력 - 이전 방의 값과 다른 데이터형을 입력할 수 있다.
		//Generic형이 다르기 때문에 String 들어가면 error 남
		
		list.add(new Integer(27)); //JDK 1.8까지
		list.add(Integer.valueOf(27)); //JDK 1.8이후
		
		
		//3. 값 얻기)
		for(int i=0; i<list.size();i++) {
			//값을 얻을 때 error 발생
//		System.out.println(list.get(i));//unboxing
		System.out.println((Integer)list.get(i).intValue());//unboxing
		}//end for
	}//UseGeneric

	public static void main(String[] args) {
		new UseGeneric();

	}//main

}//class
