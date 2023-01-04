package day0104;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 이벤트처리를 위해서 사용하는 인터페이스를 추상 메소드를 여러 개 가진 경우
 * 그에 대한 편의성을 제공하기 위해 XxxAdapter 클래스를 제공한다
 * XxxAdapter클래스를 상속받으면 자식 클래스의 복잡도가 낮아진다.
 * @author user
 *
 */
public class UseWindowAdaper extends WindowAdapter {
	private TestWindowEvent2 twe2; //has a
	
	public UseWindowAdaper(TestWindowEvent2 twe2) {
		this.twe2 = twe2;
	
	}//TestWindowListenerImpl

	@Override
	public void windowClosing(WindowEvent e) {
		twe2.dispose();
	}//windowClosing
	
	
	
	

}
