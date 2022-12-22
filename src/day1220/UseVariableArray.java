package day1220;

public class UseVariableArray {

	public UseVariableArray() {
		// 1. 선언 데이터형[][] 배열명 = null;
		int[][] arr = null;
		// 2. 생성 배열명 = new 데이터형[행의수][];
		arr = new int[4][];
		// 3. 열생성 배열명[행의 번호]=new 데이터형[열의 수]
		arr[0] = new int[3];
		arr[1] = new int[] {1,2,3,4,5};
		arr[2] = new int[2];
		arr[3] = new int[] {1,2,3,4,5,6,7,8};
		
		for(int i=0; i<arr.length;i++) {
			System.out.printf("arr[%d]행의 열의 수%d\n",i, arr[i].length);
		}
		// 4. 값 할당 배열명[행의번호][열의 번호] = 값;
		arr[0][2]=10;
		arr[1][4]=20;
		// 5. 값 사용 배열명[행의번호][열의번호]
		System.out.println(arr[0][0] + " / " + arr[0][2]);
		
		for(int i = 0; i <arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.printf("%d\t",arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
		
		//기본형 형식의 사용 : 행 구분 괄호를 사용할 때 개수를 다르게 묶는다.
		int[][] arr2= {{1}, {2, 3, 4,5},{6,7},{8,9,10,11,12}};
				
				for(int i=0; i<arr2.length;i++) {
					System.out.printf("arr2[%d]행의 열의 수%d\n",i, arr2[i].length);
				}//end for
		
		
		
		
		
	}// UseVariableArray

	public static void main(String[] args) {
		new UseVariableArray();
	}// main

}// class
