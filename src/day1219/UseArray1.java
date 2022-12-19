package day1219;

/**
 * 일차원 배열 사용.
 * @author user
 *
 */
public class UseArray1 {
	
	public UseArray1() {
		//1. 선언 데이터형[] 배열명 = null;
		int[] arr = null;
		//2. 생성 배열명 = new 데이터형[방의 개수];  //모든 방의 값을 초기화 힙에 올라가기 때문에
		arr=new int[5];
		System.out.println(arr + "/ 방의 개수 " + arr.length);
		//3. 값 할당 배열명[방의 인덱스] = 값;
		arr[0]=2022;
		arr[1]=12;
		//4. 값 사용 배열명[방의 인덱스]
		System.out.printf("arr[%d] : %d, arr[4] : %d\n", 0, arr[0], arr[4]);
		System.out.println("모든 방 값 출력");
		for(int i =0; i<arr.length;i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}//end for
	System.out.println("-------------------------------------------------------");
	//기본형 형식 사용
	//데이터형[] 배열명 = new 데이터형[](값,,,,,,,,}; new 데이터형은 선언과 생성을 같이 할 때만 생략 가능
	int[] arr2 = /* new int[] */{2022, 12, 19, 15, 12};
	arr2[4] = 13;
	for(int i =0; i<arr2.length;i++) {
		System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
	}//end for
	
	//테스트 라는 이름을 가진 학생이 시험을 봤다.
	//점수 : 자바 80점, 오라클 97점, JSP : 94점, HTML 100점을 받았다.
	//각 과목과 점수, 총점을 출력해보셍
	//과목  점수
	//
	//        총점
	
	System.out.println("과목\t점수");
	arr = new int[] {80, 97, 94, 100};
	
	int sum = 0;
	String[] str = new String[] {"자바", "오라클", "JSP", "HTML"};
	for(int i =0; i<arr.length;i++) {
		System.out.printf("%s : %d\n", str[i], arr[i]);
		sum += arr[i];
	}//end for
	System.out.println("총점 : " + sum);
	
	float average = sum/(float)arr.length;
	System.out.println("평균 : " + average);
	
	System.out.println("---------------------------------------------------------------------------------");
	//arr2 배열에 값을 마지막 방부터 출력을 해봅시다.
	for(int i= arr2.length-1; i>-1; i--) {
		System.out.println(arr2[i]);
	}//end for
	
	
	
	
	
	}//UseArray1
	
	public static void main(String[] args) {
		//클래스명 객체명 = new 생성자();
		new UseArray1(); //객체화 후 변수나 메소드를 호출할 필요가 없을 때 사용하는 문법
	}//main

}//class
