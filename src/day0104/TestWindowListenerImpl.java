package day0104;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 이벤트처리를 위해서 사용하는 인터페이스를 추상 메소드를 여러 개 가진 경우
 * 인터페이스를 구현하면 구현 클래스의 복잡도가 상승.
 * @author user
 *
 */
public class TestWindowListenerImpl implements WindowListener {
	private TestWindowEvent twe; //has a
	
	public TestWindowListenerImpl(TestWindowEvent twe) {
		this.twe = twe;
	}//TestWindowListenerImpl
	
	
	
	

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("windowClosing");
		twe.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//dispose method에 의해 호출된다.
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {

		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {

		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {

		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {

		System.out.println("windowDeactivated");
	}

}
