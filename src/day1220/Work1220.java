package day1220;

/**
 * �л��� ������ �ϰ�ó��
 * @author user
 *
 */


/**
 * @author user
 *
 */
public class Work1220 {
	private int total = 0; 
	private int number = 0; 
	private String name;
	private int javaScore;
	private int oracleScore;
	private int jdbcScore;
	private int totalScore;
	private double avgScore;
	private int rank = 1;
	
	

	
	public Work1220(){

		
	}
	
	public Work1220(String name, int javaScore, int oracleScore, int jdbcScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
		this.jdbcScore = jdbcScore;
		this.calc();
		
	}
	public void calc() {
		this.totalScore = javaScore+ oracleScore + jdbcScore;
		this.avgScore = (double)this.totalScore/3;
	}
	
	public void printInfo() {
		System.out.print("�̸� : " + this.name);
		System.out.print(" �ڹ� : " + this.javaScore);
		System.out.print(" ����Ŭ : " + this.javaScore);
		System.out.print(" ���̵�� : " + this.javaScore);
		System.out.printf(" �л� ���� : %d ��� : %.2f\n", this.totalScore, this.avgScore);
	}
	
	public void printRank(Work1220[] work1220) {
		int studentLen = work1220.length;
		for (int i = 0; i < studentLen; i++) {
			if(this.totalScore < work1220[i].totalScore) {
				this.rank++;
			}
		}
		if(rank==1)
		System.out.println(" ��� : " + rank + " �̸� : " + name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	
	public int getJavaScore() {
		return javaScore;
	}
	
	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}
	
	public int getOracleScore() {
		return oracleScore;
	}
	
	public void setJdbcScore(int jdbcScore) {
		this.jdbcScore = jdbcScore;
	}
	
	public int getJdbcScore() {
		return jdbcScore;
	}
	
	
	public void printScore(String[] names, int[][] score) {
		System.out.println("���� ���");
		System.out.println("------------------------------------------------------------------");
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tJDBC\t����\t���");
		System.out.println("------------------------------------------------------------------");
		
		

		for(int i=0; i<names.length; i++) { //��
//			total = 0; //�ݺ��� �ȿ��� �������̸� ���� �������� �ʴ´�.
			System.out.printf("%d\t%s\t",i+1, names[i]);
			for(int j=0;j<score[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
				totalScore(score[i][j]);
			}//end for
			double average = average(total, score[0].length);
			System.out.printf("%d\t%.2f\n",total, average);
			resetTotalScore();
		}//end for
		System.out.println("---------------------------------------------------------------");
		//�ڹ� ����, ����Ŭ ����, JDBC ����, ��ü ����, ��ü ���
		total(score);
//		System.out.printf("\n����\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\n",0,0,0,0,0.0);
		System.out.println("---------------------------------------------------------------");
//		System.out.printf("1�� �л��� ��ȣ[%d] �̸�[%s] \n",0,"�׽�Ʈ");
		
	}
//4�� 3�� 00 10 20 30 40	
public void total(int score[][]) {
	System.out.print("����\t\t");
	for(int i=0; i <score[i].length; i++) {
		for(int j = 0; j<score.length; j++) {
//			System.out.print(score[j][i] + " ");
			totalScore(score[j][i]);
		}
		System.out.printf("\t%d",total);
		resetTotalScore();
		}
	for(int i=0; i <score.length; i++) {
		for(int j = 0; j<score[i].length; j++) {
//			System.out.print(score[j][i] + " ");
			totalScore(score[i][j]);
		}
	}
	System.out.printf("\t%d\t%.2f\t\n ",total,average(average(total, score.length), score[0].length));
	resetTotalScore();
	}

	/**
	 * ����
	 * @return
	 */
	public void totalScore(int score) {
		total += score;
	}
	
	public void resetTotalScore()
	{
		total = 0;
		
	}

	
	//������ ������� �Է¹޾� ����� ���� double������ ��ȯ�ϴ� �� �����ϴ� �޼ҵ� �ۼ�
	public double average(double total, int cnt) { //��¥�� ��Ʈ���̴ϱ� ���� �迭�� ���� �ʿ䰡 ����
		return total/(double)cnt;
	}
	

	public static void main(String[] args) {
		
		
		Work1220 [] workArr = new Work1220[4];
		workArr[0] = new Work1220("�����", 91, 84, 88);
		workArr[1] = new Work1220("��ΰ�", 79, 81, 93);
		workArr[2] = new Work1220("������", 64, 66, 71);
		workArr[3] = new Work1220("�̹���", 86, 81, 80);
		
		int totalJavaScore = 0;
		int totalOracleScore = 0;
		int totalJdbcScore = 0;
		int stuLen = workArr.length;
		
		//�� ������ �ϱ� ������ �ڵ尡 �̻��ؿ� ȿ������ �ڵ����°� �ƴմϴ�.
		for(int i = 0; i < stuLen; i++) {
			totalJavaScore = totalJavaScore + workArr[i].javaScore;
			totalOracleScore = totalOracleScore + workArr[i].oracleScore;
			totalJdbcScore = totalJdbcScore + workArr[i].jdbcScore;
		}
		for(int i =0; i<stuLen; i++) {
			workArr[i].printInfo();
		}
		for(int i =0; i<stuLen; i++) {
			workArr[i].printRank(workArr);
		}
		System.out.println();
		
		
		
		String[] names = {"�����","��ΰ�","������","�̹���"};
		int[][] score = {{91,84,88}, {79,81,93}, {64,66,71}, {86,81,80}}; //4�� 3��

		//1.
		Work1220 work = new Work1220();
		//2.
		work.printScore(names, score);
	
		for(int i =0; i<stuLen; i++) {
			workArr[i].printRank(workArr);
		}
	}
}
