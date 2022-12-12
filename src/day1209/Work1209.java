package day1209;

public class Work1209 {


	public static void main(String[] args) {
		//문제1
		System.out.println("문제 1");
		int i = 0;
		for(i=0;i<65536;i++) {
			if( (i>47&&i<58) || (i>64&&i<91) || (i>96&&i<123) ) {
				System.out.print((char)i + " ");
				
			}
		}
//		0	9	A	Z	a	z
//		48	57	65	90	97	122
		
		System.out.println();
		System.out.println();
		
		//문제 2
		System.out.println("문제 2");
		int sum = 0;
		int sum2 = 0;
		for(i=1;i<101;i++) {
			if(i%3==0) {
				sum+=i;
				sum2++;
			}
			
		}
		System.out.println("3의 배수 합 : " + sum);
		System.out.println("3의 배수 개수 : " + sum2);
		
		System.out.println();
		
		//문제3
//		System.out.println("문제 3");
		int j = 0;
		int k = 0;
//		for(j=0;j<10;j++) {
//			for(k=0;k<10;k++) {
//				if(j==k) {
//					System.out.print(j);
//				} else {
//					System.out.print(" ");
//				}//end else
//				
//			}//end for
//			System.out.println();
//		}//end for
//		
		for(j=0;j<10;j++) {
		for(k=0;k<j;k++) { 
		System.out.print(" ");
			}
		System.out.println(j);
		}
		

		
		
		
	}
	}


