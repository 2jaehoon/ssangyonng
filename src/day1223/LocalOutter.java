package day1223;

/**
 * 클래스를 지역변수처럼 사용
 * @author user
 *
 */
public class LocalOutter {
	int i;
	
	public LocalOutter() {
		System.out.println("바깥클래스의 생성자");
	}//LocalOutter
	
	public void outMethod(int paramI, final int paramJ) {
		int locI = 0;
		final int locJ = 0;
		
		//////////////////////////////////지역클래스 시작/////////////////////////
		class LocalInner{
			int k;
			public LocalInner() {
				System.out.println("LocalInner 생성자");
			}//LocalInner
			
			public void locMethod() {
				System.out.println("지역클래스 메소드");
				System.out.println("외부 클래스의 인스턴스 변수 : " + i);
//				paramI=12;//지역클래스에서는 매개변수, 지역변수에 값 할당 할 수 없다.
//				locI=12;
				//JDK1.7까지의 final이 붙은 변수만 사용할 수 있다.
				System.out.println("매개변수 변수 : " + paramI +"/"+ paramJ);
				System.out.println("지역변수 변수 : " + locI + "/" + locJ);
			}
			
		}//class
		//////////////////////////////////지역클래스 끝/////////////////////////
		//지역클래스의 객체화
		LocalInner li = new LocalInner();
		li.locMethod();
	}//outMethod

	public static void main(String[] args) {
		LocalOutter lo = new LocalOutter();
		lo.outMethod(12, 23);
	}//main

}//class
