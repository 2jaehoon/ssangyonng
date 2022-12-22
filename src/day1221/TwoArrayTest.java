package day1221;

public class TwoArrayTest {
	
	public TwoArrayTest() {
	this.test();
	}

	public void test() {
//		int[][] test = null;
//		test = new int[][] {{1,2,3},{4,5,6}};
		int[][] twoArray = {{0,1,0,0,1,0},{1,1,1,1,1,1},{0,1,0,0,1,0},{0,1,0,0,1,0},{1,1,1,1,1,1},{0,1,0,0,1,0}};
		for(int i = 0; i<twoArray.length; i++) {
			for(int j = 0; j<twoArray[i].length; j++) {
				System.out.print(twoArray[i][j]);
			}
		System.out.println();	
		}
		
		System.out.println();
		
		for(int[] i : twoArray) {
			for(int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		TwoArrayTest tat = new TwoArrayTest();
		TwoArrayTest[] tatArray = new TwoArrayTest[4];
	}

}
