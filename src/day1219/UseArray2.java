package day1219;

/**
 * ������ �迭
 * @author user
 *
 */
public class UseArray2 {
	
	public UseArray2() {
		//1. ����) ��������[][] �迭�� = null;
		int[][] arr = null;
		//2. ����) �迭�� = new ��������[���� ��][���� ��];
		arr=new int[3][4];
		System.out.println("���� �� : "+ arr.length);
		System.out.println("���� �� : "+ arr[0].length);
		//3. ���Ҵ�) �࿡�� ���� ���� �ʴ´�. �迭��[���� ��ȣ][���� ��ȣ]=��;
//		arr[0] = 1; //error
		arr[0][0] = 4;
		arr[2][3] = 21;
		
		//4. �� ���) �迭��[��][��] 
		System.out.println("arr[0][0]="+arr[0][0] + " arr[2][3]="+arr[2][3]);

		//�ϰ�ó��
		for(int i =0; i < arr.length; i++){//��
			for(int j=0; j<arr[i].length; j++) {//��
				System.out.printf("arr[%d][%d] : %d\t\t",i,j,arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
		
		
	}//UseArray2()
	
	public void array2() {
		System.out.println("-----------------------------------------------------");
		//�⺻�� ���� ��� ( �౸�� ��ȣ )
		//��������[][] �迭�� = new ��������[���� ��][���� ��]{    { ��,,   }, {  ��,,   } ,,    };
		int[][] arr = new int[][] {{10, 20}, {30, 40}, {50, 60}, {70, 80}, {90, 100}, {110, 120}};
		System.out.println("���� �� : " + arr.length);
		System.out.println("���� �� : " + arr[0].length);
	
		for ( int i = 0; i<arr.length; i++) {//��
			for ( int j = 0; j<arr[i].length; j++) {//��
				System.out.printf("arr[%d][%d] = %-5d",i,j,arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//��üȭ ��
		//array2 �޼ҵ� ȣ��
//		UseArray2 ua2 = new UseArray2();
//		ua2.array2();
		//��üȭ �� �ϳ��� �޼ҵ带 ȣ�� : new ������().�޼ҵ��();
		new UseArray2().array2();

	}//main

}//class
