package day0106;

/**
 * 사용자 정의 예외 처리 클래스
 * 구현하는 업무용어를 사용하여 예외처리 클래스를 작성
 * @author user
 *
 */
@SuppressWarnings("serial")
public class TobaccoException extends Exception {
	
	public TobaccoException() {
		super("흡연은 건강에 해롭습니다");
	}//TobaccoException
	
	public TobaccoException(String msg) {
		super(msg);
	}//TobaccoException
	

}//class
