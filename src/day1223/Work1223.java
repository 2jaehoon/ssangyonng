package day1223;



public class Work1223 {
	
	public char[] tempPassword() {
		char[] arr = new char[8];
		double ran =  Math.random();
//		int ran = (int) Math.random(); 인트 고정값이 나온다. 랜덤값 x
		//위와 같이 설정하면 왜 랜덤값이 안나오고 첫번째 시작 값만 나올까요?
		char[] ranArr = {(char)((ran*26)+65),(char)((ran*26)+97),(char)((ran*10)+48)};
		//아스키 코드
		// 0>48   9>57   A>65   Z>90    a>97   z>122
		for(int i=0; i<8; i++) {
		arr[i] = ranArr[(int) (Math.random()*3)];
		}
		return arr;
	}

	
	//중복값이 있는 버전
	public int[][] lotto(int x){
		
		int[][] aarr = new int[x][6];
		for(int i = 0; i<aarr.length;i++) {
			for(int j=0; j<aarr[i].length; j++) {
				
				aarr[i][j] = (int)(Math.random()*45)+1;
			}
		}
		return aarr;
		}//lotto
	
	
	//중복값이 없는 버전
	public int[][] lotto2(int x){
		int[][] aaarr = new int[x][6];
		int[] nNum = new int[x*6];
		int nIndex = 0;
		
		for(int i = 0; i <nNum.length; i++) {
			nNum[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j <i; j++) {
				if(nNum[i]==nNum[j]) {
					i--;
					break;
				}//if
			}//안쪽 for
		}//바깥 for

		for(int i = 0; i < aaarr.length; i++) {
			for(int j = 0; j<aaarr[i].length; j++) {
				aaarr[i][j]=nNum[nIndex++];
			}
		}
		
		return aaarr;
	}
	
	
}//class
