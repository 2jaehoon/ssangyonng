package day0104;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * �̺�Ʈó���� ���ؼ� ����ϴ� �������̽��� �߻� �޼ҵ带 ���� �� ���� ���
 * �������̽��� �����ϸ� ���� Ŭ������ ���⵵�� ���.
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
		//dispose method�� ���� ȣ��ȴ�.
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
