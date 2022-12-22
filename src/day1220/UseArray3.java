package day1220;

import java.util.Arrays;

/**
 * 삼차원 배열 : 면, 행, 열로 구성된 배열
 * 
 * @author user
 *
 */
public class UseArray3 {
	
	public UseArray3() {
		//기본형 형식의 사용 : 데이터형 [][][] 배열명 = {{{값..},{값.,,}},{{값..},{값.,,}}};
		int [][][] arr = {{{10,20},{30,40},{50,60}},{{70,80},{90,100},{110,120}}};
		System.out.println("면의 수 : " + arr.length);
		System.out.println("행의 수 : " + arr[0].length);
		System.out.println("열의 수 :" + arr[0][0].length);
		
		System.out.println("-------------------------------------------------");
		
		
		
	}

	public void useArray3() {
		// 1.선언 : 데이터형[][][] 배열명 = null;
		int[][][] arr = null;
		// 2.생성 : 배열명 = new 데이터형 [면][행][열];
		arr = new int[3][2][3];
		System.out.println("면 : " + arr.length + " 행 : " + arr[0].length + " 열 : " + arr[0][0].length);
		// 3.값할당
		arr[0][0][0] = 2022;
		arr[1][1][2] = 12;
		arr[2][0][1] = 20;
		// 4.값사용
		System.out.println(arr[0][0][0] + "/" + arr[0][0][1]);
		for (int i = 0; i < arr.length; i++) {// 면
			System.out.println(i + "면 시작");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(j + "행 시작");
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("arr[%d][%d][%d]=%d\t ",i,j,k,arr[i][j][k]);
				} // end for
				System.out.println(j + "행 끝");
			} // end for
			System.out.println(i + "면 끝");
		} // end for
	}// useArray3

	public static void main(String[] args) {
		new UseArray3().useArray3();
	}// main

}// class
