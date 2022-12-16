package day1215;

/**
 * 모든 패키지에서 이 클래스에 접근할 수 있음.
 * @author user
 *
 */
public class TestModifier {

	public static void main(String[] args) {
		//package 접근 지정자가 부여된 TestModifier2는 
		//같은 패키지의 다른 클래스에서 사용할 수 있다.
		TestModifier2 tm2 = new TestModifier2();
	}

}
