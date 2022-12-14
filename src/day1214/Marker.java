package day1214;

/**
 * 마카펜을 대상으로 추상화하여 만든 클래스<br>
 * 명사적 특징 : 뚜껑, 몸체, 색<br>
 * 동사적 특징 : 쓴다<br>
 * 사용법)<br>
 * 객체 생성 후 사용<br>
 * Marker 객체명 = new Marker();
 * @author user
 *
 */
public class Marker {
	private int cap; //뚜껑의 개수를 저장할 변수  //0으로 자동초기화
	private int body; // 몸체의 개수를 저장할 변수 //0으로 자동초기화
	private String color; //색을 저장할 변수 //null으로 자동 초기화

	/**
	 * 생성된 마카펜 객체에 뚜껑 갯수를 설정하는 일.
	 * 뚜껑은 하나 이상 설정할 수 없다.
	 * @param cap 설정할 뚜껑의 개수
	 */
	public void setCap(int cap) {
		if(cap>1) {
			cap =1;
		}
		this.cap = cap;
	}//setCap
	
	/**
	 * 생성된 마카펜 객체의 뚜껑 개수를 반환하는 일
	 * @return 마카펜 객체에 설정된 뚜껑의 수
	 */
	public int getCap()
	{
		return cap;
	}//getCap
	
	/**
	 * 생성된 마카펜 객체에 몸체 갯수를 설정하는 일.
	 * @param body 설정할 몸체의 개수
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	
	/**
	 * 생성된 마카펜 객체의 몸체 개수를 반환하는 일
	 * @return 마카펜 몸체의 개수
	 */
	public int getBody() {
		return body;
	}//getBody
	
	
	/**
	 * 생성된 마카펜 객체의 색을 설정하는 일
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		this.color = color;
	}//setColor
	
	
	/**
	 * 생성된 마카펜 객체의 색을 반환하는 일
	 * @return color 설정할 색
	 */
	public String getColor() {
		return color;
	}//getColor
	
	
	
	
	
	
	
	/**
	 * 생성된 마카펜 객체를 사용하여 칠판에 메시지를 쓰는 일 구현.
	 * @param msg 칠판에 기록할 메시지
	 * @return 기록하는 행동.
	 */
	public String write(String msg) {
		return "칠판에 " + color +  "인 마카펜으로 \""+msg+"\"를 쓴다.";
	}//write

}//class
