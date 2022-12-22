package day1221;

import day1214.Work;

/**
 * �л��� ������ �ϰ�ó��
 */
public class Work1220 {

	/**
	 * �л��� �̸��� ������ ���
	 * 
	 * @param names �̸�
	 * @param score ����
	 */

	private int total;
	private int java; // �ڹ� ����
	private int oracle; // ����Ŭ ����
	private int jdbc; // jdbc ����
	private TopStudent ts; //�ϵ��л� ����
	
	public static final int JAVA=0;
	public static final int ORACLE=1;
	public static final int JDBC=2;
	

	public Work1220() {
		ts = new TopStudent();
	}

	//���� ����
	public void setTotal(int score) {
		total += score;
	}

	//���� ����
	public void resetTotal() {
		total = 0;
	}

	//�ڹ� ������ ����
	public void setJava(int score) {
		java += score;
	}

	//����Ŭ ������ ����
	public void setOracle(int score) {
		oracle += score;
	}

	//jdbc ������ ����
	public void setJdbc(int score) {
		jdbc += score;
	}
	


	//��� ���ϱ� (�Է°��� ��� ������ ��)
	public double avr(int totalSum, int subCnt) {
		return (double) totalSum / subCnt;
	}

	//��� ���ϱ� (����� ������ double�̶� �޼��� �����ε���)
	public double avr(double avrSum, int peopleNum) {
		return avrSum / peopleNum;
	}

	
	//���� ����ϱ�
public void printScore(String[] names, int[][] score) {
		
		System.out.printf("��ȣ\t�̸�\tJava\tOracle\tJDBC\t����\t���\n");
		
		int totalSum = 0;
		double avr = 0.0;
		double avrSum=0.0;
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.printf("%d\t%s\t",i+1,names[i]);
			
			for(int j = 0 ; j < score[0].length ; j++) {
				System.out.printf("%d\t",score[i][j]);	
				
				setTotal(score[i][j]);
				
			
//				if(j==0) { // ���� ������ ���� �� ã���ż� ���ϼ� ���� ������ �� �����ϼ̽��ϴ�. 
//					setJava(score[i][j]);
//				}else if(j==1) {
//					setOracle(score[i][j]);
//				}else if(j==2) {
//					setJdbc(score[i][j]);
//				}
				
				switch ( j ){ //�̷��� �Ͻø� �бⰡ �������ϴ�. �� �˰ڽ��ϴ�!!
				case JAVA: setJava(score[i][j]); break;//�ڹ��� ��찡 �ǰ���?
				case ORACLE: setOracle(score[i][j]); break;//����Ŭ�� ���
				case JDBC: setJdbc(score[i][j]); break;//JDBC �� ��찡 �ǰ���?
				}
				
				
			
			}//���� for
			
			totalSum += total;
			
			processTopStudent(total,i+1,names[i]);
			avr= avr(total, score[0].length);
			
			System.out.printf("%d\t%.2f",total,avr);
			avrSum += avr; 			
			resetTotal();
			System.out.println();
		
		
		}//�ٱ� for
		
		System.out.println("=======================================================");
		System.out.printf("����\t\t%d\t%d\t%d\t%d\t%.2f",java,oracle,jdbc,totalSum,avr(avrSum, score.length));
	
		
		//�ϵ��� ��� �־��? ������ �߸��߽��ϴ�,, ��,,, �𸣰ڽ��ϴ�..
		System.out.printf("\n �ϵ� ��ȣ[%d] �л��� [%s] ",ts.getNum(), ts.getName());
	
		
		
		
	}//printScore

	public void processTopStudent(int totalScore, int num,  String name)
	{
		if(ts.getTotalScore() < totalScore) {
			ts.setNum(num);
			ts.setTotalScore(totalScore);
			ts.setName(name);
		}
	}//prcessTopStudent

/////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		String[] names = { "�����", "��ΰ�", "������", "�̹���" };
		int[][] score = { { 91, 84, 88 }, { 79, 81, 93 }, { 64, 66, 71 }, { 86, 81, 80 } };

		// ��üȭ
		Work1220 w = new Work1220();

		// ��ü�� �޼��� ȣ��
		// names: �̸� �迭(1����)
		// score: ���� �迭 (2����)
		w.printScore(names, score); 

	}

}
