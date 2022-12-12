package day1208;

import java.util.Calendar;

/**
 * switch ~ case���� break ��� <br>
 * break�� switch~case, for,while,do~while�� ���������� ���.
 * @author user
 *
 */
public class UseSwitchCase2 {
	//constant�� �ʵ忡�� ���� ����
//	public static final �������� ����� = ��;
	public static final int SUN = 0; 
	public static final int MON = 1; 
	public static final int TUE = 2; 
	public static final int GRADE_A_PLUS = 10; 
	public static final int GRADE_A = 9; 
	public static final int GRADE_B = 8; 
	public static final int GRADE_C = 7; 
	public static final int GRADE_D = 6; 
	public static final int MONKEY = 0;
	public static final int ROOSTER = 1;
	public static final int DOG = 2;	
	public static final int PIG = 3;
	public static final int MOUSE = 4;
	public static final int OX = 5;
	public static final int TIGER = 6;
	public static final int RABBIT = 7;
	public static final int DRAGON = 8;
	public static final int SNAKE = 9;
	public static final int HORSE = 10;
	public static final int GOAT = 11;

	

	public static void main(String[] args) {
		int i = 0;
		switch ( i ) {
		case 0: System.out.println("0���̽� ����");break; //switch~case�� ���� ������.
		case 1: System.out.println("1���̽� ����");
		case 2: System.out.println("2���̽� ����");
		case 3: System.out.println("3���̽� ����");break;
		default : System.out.println("��ġ�ϴ� ���̽� ����");
		}//end switch

		
		System.out.println("=============================");
		//switch~case�� ������ ���.
		//case 0�̸� �Ͽ����� ���, case 1 ���������
		//case 3�̸� ȭ������ ���,
		//�׿ܴ� ������ �Ĺ��� ���
	int dayOfWeek = 1;
	i = 0;
	
	switch( dayOfWeek ) {
	case UseSwitchCase2.SUN : System.out.println("�Ͽ���"); break;
	case UseSwitchCase2.MON : System.out.println("������"); break;
	case UseSwitchCase2.TUE : System.out.println("ȭ����"); break;
	default : System.out.println("���� �Ĺݺ�");
	}
	
	int score = 70;
	char grade='\u0000'; // ' '������ �����ڵ尪�� �Ҵ��� �� �ִ�.
	System.out.println(grade);
	if(score<-1||score<101){	
			switch (score/10) {
		case GRADE_A_PLUS: 
		case GRADE_A: grade = 'A'; break;
		case GRADE_B: grade = 'B'; break;
		case GRADE_C: grade = 'C'; break;
		case GRADE_D: grade = 'D'; break;
		default : grade='F'	;
}//end switch
	System.out.println(score + "����" + grade + "�����̴�.");
	}
	System.out.println();
	int score2 = 90;
	char grade2=64; // ' '������ �����ڵ尪�� �Ҵ��� �� �ִ�.
	if(score2>-1&&score2<101){	
			switch (score2/10) {
		case GRADE_D: grade2++;
		case GRADE_C: grade2++;
		case GRADE_B: grade2++;
		case GRADE_A: 
		case GRADE_A_PLUS: grade2++; break;
		default : grade2='F'	;
}//end switch
	System.out.println(score2 + "����" + grade2 + "�����̴�.");
	}
	
	int year = 2022;
	System.out.print(year+"���� ");
	switch(year%12) {
	case MONKEY : System.out.println("������"); break;
	case ROOSTER :System.out.println("��"); break;
	case DOG :System.out.println("��"); break;
	case PIG :System.out.println("����"); break;
	case MOUSE :System.out.println("��"); break;
	case OX :System.out.println("��"); break;
	case TIGER :System.out.println("ȣ����"); break;
	case RABBIT  :System.out.println("�䳢"); break;
	case DRAGON :System.out.println("��"); break;
	case SNAKE  :System.out.println("��"); break;
	case HORSE  :System.out.println("��"); break;
	case GOAT  :System.out.println("��"); break;

	}
	
	
	
	}
	}


