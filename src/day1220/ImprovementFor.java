package day1220;

public class ImprovementFor {

	public void array1() {
		// 일차원 배열의 열은 단일형으로 이루어져 있다.
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i : arr) {
			System.out.print(i + " ");
		} // end for
		System.out.println();
		String[] arr2 = { "안녕", "하세요", "즐거운 화요일", "내일은 수요일", "몇 일 후엔 캐빈과 함께 포항항" };

		for (String i : arr2) {
			System.out.print(i + " ");
		} // end for
		System.out.println();
		DataVO[] dvArr = { new DataVO("박진호", "포0항", 10), new DataVO("지지호", "포1항", 150), new DataVO("조조호", "포2항", 110) };
		for (DataVO dv : dvArr) {
			System.out.println(dv.getName() + "/" + dv.getAddr() + "/" + dv.getAge());
		} // end for
	}// array1

	public void array2() {
		// 이차원 배열의 한 행은 일차원 배열로 이루어져 있다.
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 } };
		
		for(int [] arrOne : arr) {
			for(int i : arrOne) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}// array2

	public void array3() {
		//삼차원 배열의 한 열은 이차원 배열로 이루어져 있다.
		int[][][] arr = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		for ( int[][] arrTwo : arr) {//면
			for(int[] arrOne : arrTwo) {//행
				for(int i : arrOne) {//열
					System.out.print(i + " ");
				}
				System.out.println();
			}
			System.out.println("면 끝");
		}

	}// array3

	public static void main(String[] args) {
		ImprovementFor imfor = new ImprovementFor();
		imfor.array1();
		System.out.println("------------------------------------");
		imfor.array2();
		System.out.println("------------------------------------");
		imfor.array3();

	}// main

}// class
