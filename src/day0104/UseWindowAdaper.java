package day0104;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * �̺�Ʈó���� ���ؼ� ����ϴ� �������̽��� �߻� �޼ҵ带 ���� �� ���� ���
 * �׿� ���� ���Ǽ��� �����ϱ� ���� XxxAdapter Ŭ������ �����Ѵ�
 * XxxAdapterŬ������ ��ӹ����� �ڽ� Ŭ������ ���⵵�� ��������.
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
