package day1223;

public class UseWork1223 {
	
	

	public static void main(String[] args) {
		Work1223 w = new Work1223();
		char[] charArray;
		charArray = w.tempPassword();
		for(int i = 0; i<w.tempPassword().length; i++) {
			System.out.print(w.tempPassword()[i] + " ");
		}//���⼱ �������� �� �����µ�..
		System.out.println();
		for(int i = 0; i<charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}//���⼱ �� �� �ȳ��ñ��?..?
		System.out.println("\n-------------------------------------------");
		
		//�ߺ����� �ִ� ����
		int[][] lottoArray;
		lottoArray = w.lotto(4);
		for(int i=0; i<lottoArray.length;i++) {
			for(int j =0; j<lottoArray[i].length;j++) {
				System.out.print(lottoArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		//�ߺ����� ���� ����
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
