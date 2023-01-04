package day1223;

/**
 * 날기 위한 업무의 목록을 정의한 인터페이스
 * 날기 위해서는 추진력, 양력이 있어야 한다.
 * @author user
 *
 */
public interface Fly {
	/**
	 * 추진력
	 * @return
	 */
	public  String drivingForce();
	
	/**
	 * 양력
	 * @return
	 */
	public String upwardForce();
	
	

}//Fly
