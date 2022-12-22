package day1221;

public class Jaehoon extends Person {
	int effortScore;
	
	
	/**
	 * 노력점수가 100점 만점이라면
	 * 나는 80점
	 *
	 */
	public Jaehoon() {
		effortScore = 80;
	}
	
	//장점 노력하려고 한다 노력점수?
	public String effort(int effortScore) {
		String result = "";
		if(effortScore<40) {
		 result = "의욕이 없어보여요 ㅜㅜ";
		}else if(effortScore<60){
			result = "무난한데요?";
		}else {
			result = "의욕이 뿜뿜";
		}
		
		
		return result;
	}
	
	

}//Jaehoon
