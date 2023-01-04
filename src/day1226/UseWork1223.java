package day1226;

/**
 * 제공하는 일을 사용하는 클래스 : 
 * 업무결과를 받아서 화면 출력 작성
 * @author user
 *
 */
public class UseWork1223 {
	/**
	 * Work1223에서 제공하는 비밀번호 생성을 사용하는 메소드
	 */
	public void useTempPassword() {
		Work1223 work = new Work1223();
//		char[] tempPass = work.tempPassword1();
		char[] tempPass = work.tempPassword2();
		System.out.println(tempPass);
	}
	
	public void buyLotto(int i) {
		Work1223 work = new Work1223();
		work.lotto(i);
		if(!(i>0&&i<6)) {// 1~5사이의 숫자가 아니면 메서드 종료
			System.out.println("1~5사이의 정수를 입력해 주세요");
		}else {	int j=0;


		//개선된 for문으로 출력
		for(int[] lottoOne : work.lotto(i)) {
			j++;
			System.out.print(j+"번\t");
			for(int lottoTwo : lottoOne) {
			System.out.print(lottoTwo+ " ");
			}//for
			System.out.println();
		}//for
			
		}//else
	}//buyLotto

	public static void main(String[] args) {
		UseWork1223 uw = new UseWork1223();
		uw.useTempPassword();
		System.out.println("------------------------------------");
		uw.buyLotto(5);

		
	}//main
}//class
