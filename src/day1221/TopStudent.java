package day1221;

public class TopStudent {
	private int num, totalScore;
	private String name;

//기본 생성자
	public TopStudent() {
		
	}

//인자있는 생성자
	public TopStudent(int num,int totalScore, String name) {
		this.num = num;
		this.name = name;
		this.totalScore=totalScore;
	}

//getter
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}

	public int getTotalScore() {
		return totalScore;
	}
//setter
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
}// class