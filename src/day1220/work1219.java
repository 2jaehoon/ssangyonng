package day1220;

/**
 * 숙제 1. 아래와 같은 값을 가지는 배열을 생성하세요. 김경태, 김규미, 김보경, 모민경, 윤상준, 윤지원, 김준호, 박진호
 * 
 * 출력 이름 모두 출력 김씨의 인원 수 출력 이름에 "경"이 들어있는 사람들을 출력
 * 
 * 
 * 2. 아래와 같은 값을 가지는 배열을 생성하세요 10, 67, 93, 49, 99, 86, 88
 * 위의 값을 출력하고
 * 최고값을 출력, 최저값을 출력
 * 
 * @author user
 *
 */
public class work1219 {

	public work1219() {
		String[] name = { "김경태", "김규미", "김보경", "모민경", "윤상준", "윤지원", "김준호", "박진호" };

		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();

		System.out.print("\"경\"을 가지고 있는 이름 : ");
		for (int i = 0; i < name.length; i++) {
			if (name[i].contains("경")) {
				System.out.print(name[i] + " ");
			}
		}
		System.out.println("\n-----------------------------------------------------------");
		
		int[] number = {10, 67, 93, 49, 99, 86, 88};
		int max = number[0];
		int min = number[0];
		for(int i = 0; i<number.length; i++) {
			System.out.print(number[i] + " ");
			if(max<number[i]) {
				max=number[i];
			}else if(min>number[i]) {				
				min=number[i];
			}
		}
		System.out.println();
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
		
	}

	public static void main(String[] args) {
		new work1219();
	}// main

}// class
