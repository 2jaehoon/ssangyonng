package day1220;

public class UseVariableArray {

	public UseVariableArray() {
		// 1. ���� ��������[][] �迭�� = null;
		int[][] arr = null;
		// 2. ���� �迭�� = new ��������[���Ǽ�][];
		arr = new int[4][];
		// 3. ������ �迭��[���� ��ȣ]=new ��������[���� ��]
		arr[0] = new int[3];
		arr[1] = new int[] {1,2,3,4,5};
		arr[2] = new int[2];
		arr[3] = new int[] {1,2,3,4,5,6,7,8};
		
		for(int i=0; i<arr.length;i++) {
			System.out.printf("arr[%d]���� ���� ��%d\n",i, arr[i].length);
		}
		// 4. �� �Ҵ� �迭��[���ǹ�ȣ][���� ��ȣ] = ��;
		arr[0][2]=10;
		arr[1][4]=20;
		// 5. �� ��� �迭��[���ǹ�ȣ][���ǹ�ȣ]
		System.out.println(arr[0][0] + " / " + arr[0][2]);
		
		for(int i = 0; i <arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.printf("%d\t",arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
		
		//�⺻�� ������ ��� : �� ���� ��ȣ�� ����� �� ������ �ٸ��� ���´�.
		int[][] arr2= {{1}, {2, 3, 4,5},{6,7},{8,9,10,11,12}};
				
				for(int i=0; i<arr2.length;i++) {
					System.out.printf("arr2[%d]���� ���� ��%d\n",i, arr2[i].length);
				}//end for
		
		
		
		
		
	}// UseVariableArray

	public static void main(String[] args) {
		new UseVariableArray();
	}// main

}// class
