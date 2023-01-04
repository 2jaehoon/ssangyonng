package day1223;

public class UseWork1223 {
	
	

	public static void main(String[] args) {
		Work1223 w = new Work1223();
		char[] charArray;
		charArray = w.tempPassword();
		for(int i = 0; i<w.tempPassword().length; i++) {
			System.out.print(w.tempPassword()[i] + " ");
		}//여기선 랜덤값이 잘 나오는데..
		System.out.println();
		for(int i = 0; i<charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}//여기선 왜 잘 안나올까요?..?
		System.out.println("\n-------------------------------------------");
		
		//중복값이 있는 버전
		int[][] lottoArray;
		lottoArray = w.lotto(4);
		for(int i=0; i<lottoArray.length;i++) {
			for(int j =0; j<lottoArray[i].length;j++) {
				System.out.print(lottoArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		//중복값이 없는 버전
		int [][]lottoArray2;
		lottoArray2 = w.lotto2(4);
		for(int[] i : lottoArray2) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}//main

}
