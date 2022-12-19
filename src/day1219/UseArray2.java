package day1219;

/**
 * 이차원 배열
 * @author user
 *
 */
public class UseArray2 {
	
	public UseArray2() {
		//1. 선언) 데이터형[][] 배열명 = null;
		int[][] arr = null;
		//2. 생성) 배열명 = new 데이터형[행의 수][열의 수];
		arr=new int[3][4];
		System.out.println("행의 수 : "+ arr.length);
		System.out.println("열의 수 : "+ arr[0].length);
		//3. 값할당) 행에는 값이 들어가지 않는다. 배열명[행의 번호][열의 번호]=값;
//		arr[0] = 1; //error
		arr[0][0] = 4;
		arr[2][3] = 21;
		
		//4. 값 얻기) 배열명[행][열] 
		System.out.println("arr[0][0]="+arr[0][0] + " arr[2][3]="+arr[2][3]);

		//일괄처리
		for(int i =0; i < arr.length; i++){//행
			for(int j=0; j<arr[i].length; j++) {//열
				System.out.printf("arr[%d][%d] : %d\t\t",i,j,arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
		
		
	}//UseArray2()
	
	public void array2() {
		System.out.println("-----------------------------------------------------");
		//기본형 형식 사용 ( 행구분 괄호 )
		//데이터형[][] 배열명 = new 데이터형[행의 수][열의 수]{    { 값,,   }, {  값,,   } ,,    };
		int[][] arr = new int[][] {{10, 20}, {30, 40}, {50, 60}, {70, 80}, {90, 100}, {110, 120}};
		System.out.println("행의 수 : " + arr.length);
		System.out.println("열의 수 : " + arr[0].length);
	
		for ( int i = 0; i<arr.length; i++) {//행
			for ( int j = 0; j<arr[i].length; j++) {//열
				System.out.printf("arr[%d][%d] = %-5d",i,j,arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//객체화 후
		//array2 메소드 호출
//		UseArray2 ua2 = new UseArray2();
//		ua2.array2();
		//객체화 후 하나의 메소드를 호출 : new 생성자().메소드명();
		new UseArray2().array2();

	}//main

}//class
