package day1221;

import day1214.Work;

/**
 * 학생의 점수를 일괄처리
 */
public class Work1220 {

	/**
	 * 학생의 이름과 점수를 출력
	 * 
	 * @param names 이름
	 * @param score 점수
	 */

	private int total;
	private int java; // 자바 총점
	private int oracle; // 오라클 총점
	private int jdbc; // jdbc 총점
	private TopStudent ts; //일등학생 정보
	
	public static final int JAVA=0;
	public static final int ORACLE=1;
	public static final int JDBC=2;
	

	public Work1220() {
		ts = new TopStudent();
	}

	//총점 저장
	public void setTotal(int score) {
		total += score;
	}

	//총점 리셋
	public void resetTotal() {
		total = 0;
	}

	//자바 누적합 저장
	public void setJava(int score) {
		java += score;
	}

	//오라클 누적합 저장
	public void setOracle(int score) {
		oracle += score;
	}

	//jdbc 누적합 저장
	public void setJdbc(int score) {
		jdbc += score;
	}
	


	//평균 구하기 (입력값이 모두 정수일 때)
	public double avr(int totalSum, int subCnt) {
		return (double) totalSum / subCnt;
	}

	//평균 구하기 (평균의 총합이 double이라서 메서드 오버로딩함)
	public double avr(double avrSum, int peopleNum) {
		return avrSum / peopleNum;
	}

	
	//점수 출력하기
public void printScore(String[] names, int[][] score) {
		
		System.out.printf("번호\t이름\tJava\tOracle\tJDBC\t총점\t평균\n");
		
		int totalSum = 0;
		double avr = 0.0;
		double avrSum=0.0;
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.printf("%d\t%s\t",i+1,names[i]);
			
			for(int j = 0 ; j < score[0].length ; j++) {
				System.out.printf("%d\t",score[i][j]);	
				
				setTotal(score[i][j]);
				
			
//				if(j==0) { // 열이 과목인 것을 잘 찾으셔서 비교하셔 과목별 총점을 잘 설정하셨습니다. 
//					setJava(score[i][j]);
//				}else if(j==1) {
//					setOracle(score[i][j]);
//				}else if(j==2) {
//					setJdbc(score[i][j]);
//				}
				
				switch ( j ){ //이렇게 하시면 읽기가 좋아집니다. 네 알겠습니다!!
				case JAVA: setJava(score[i][j]); break;//자바인 경우가 되겠죠?
				case ORACLE: setOracle(score[i][j]); break;//오라클인 경우
				case JDBC: setJdbc(score[i][j]); break;//JDBC 인 경우가 되겠죠?
				}
				
				
			
			}//안쪽 for
			
			totalSum += total;
			
			processTopStudent(total,i+1,names[i]);
			avr= avr(total, score[0].length);
			
			System.out.printf("%d\t%.2f",total,avr);
			avrSum += avr; 			
			resetTotal();
			System.out.println();
		
		
		}//바깥 for
		
		System.out.println("=======================================================");
		System.out.printf("총점\t\t%d\t%d\t%d\t%d\t%.2f",java,oracle,jdbc,totalSum,avr(avrSum, score.length));
	
		
		//일등은 어디에 있어요? 완전히 잘못했습니다,, ㅎ,,, 모르겠습니다..
		System.out.printf("\n 일등 번호[%d] 학생명 [%s] ",ts.getNum(), ts.getName());
	
		
		
		
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
		String[] names = { "김경태", "모민경", "윤상준", "이미현" };
		int[][] score = { { 91, 84, 88 }, { 79, 81, 93 }, { 64, 66, 71 }, { 86, 81, 80 } };

		// 객체화
		Work1220 w = new Work1220();

		// 객체로 메서드 호출
		// names: 이름 배열(1차원)
		// score: 점수 배열 (2차원)
		w.printScore(names, score); 

	}

}
