package day1220;

/**
 * 학생의 점수를 일괄처리
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
		System.out.print("이름 : " + this.name);
		System.out.print(" 자바 : " + this.javaScore);
		System.out.print(" 오라클 : " + this.javaScore);
		System.out.print(" 제이디비씨 : " + this.javaScore);
		System.out.printf(" 학생 총점 : %d 평균 : %.2f\n", this.totalScore, this.avgScore);
	}
	
	public void printRank(Work1220[] work1220) {
		int studentLen = work1220.length;
		for (int i = 0; i < studentLen; i++) {
			if(this.totalScore < work1220[i].totalScore) {
				this.rank++;
			}
		}
		if(rank==1)
		System.out.println(" 등수 : " + rank + " 이름 : " + name);
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
		System.out.println("점수 출력");
		System.out.println("------------------------------------------------------------------");
		System.out.println("번호\t이름\t자바\t오라클\tJDBC\t총점\t평균");
		System.out.println("------------------------------------------------------------------");
		
		

		for(int i=0; i<names.length; i++) { //행
//			total = 0; //반복문 안에서 가급적이면 변수 선언하지 않는다.
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
		//자바 총점, 오라클 총점, JDBC 총점, 전체 총점, 전체 평균
		total(score);
//		System.out.printf("\n총점\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\n",0,0,0,0,0.0);
		System.out.println("---------------------------------------------------------------");
//		System.out.printf("1등 학생의 번호[%d] 이름[%s] \n",0,"테스트");
		
	}
//4행 3열 00 10 20 30 40	
public void total(int score[][]) {
	System.out.print("총점\t\t");
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
	 * 총점
	 * @return
	 */
	public void totalScore(int score) {
		total += score;
	}
	
	public void resetTotalScore()
	{
		total = 0;
		
	}

	
	//총점과 과목수를 입력받아 평균을 구해 double형으로 반환하는 일 수행하는 메소드 작성
	public double average(double total, int cnt) { //어짜피 인트형이니깐 구지 배열을 넣을 필요가 없네
		return total/(double)cnt;
	}
	

	public static void main(String[] args) {
		
		
		Work1220 [] workArr = new Work1220[4];
		workArr[0] = new Work1220("김경태", 91, 84, 88);
		workArr[1] = new Work1220("모민경", 79, 81, 93);
		workArr[2] = new Work1220("윤상준", 64, 66, 71);
		workArr[3] = new Work1220("이미현", 86, 81, 80);
		
		int totalJavaScore = 0;
		int totalOracleScore = 0;
		int totalJdbcScore = 0;
		int stuLen = workArr.length;
		
		//음 동작은 하긴 하지만 코드가 이상해요 효율적인 코드형태가 아닙니다.
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
		
		
		
		String[] names = {"김경태","모민경","윤상준","이미현"};
		int[][] score = {{91,84,88}, {79,81,93}, {64,66,71}, {86,81,80}}; //4행 3열

		//1.
		Work1220 work = new Work1220();
		//2.
		work.printScore(names, score);
	
		for(int i =0; i<stuLen; i++) {
			workArr[i].printRank(workArr);
		}
	}
}
