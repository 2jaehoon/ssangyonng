package day1229;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
//1. ������ ������Ʈ�� ���
public class TestAWT2 extends Frame {

	public TestAWT2() {
		super();
		//2. =������Ʈ�� ����
		Button btn= new Button("��ư");
		//3. ������Ʈ ��ġ > �����ӿ� ��ġ
		add(btn);
		// 4������ ũ�� ����
		setSize(300, 300);
		//5. �������� ����ڿ��� �����ش�.
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}

	public static void main(String[] args) {
		
		new TestAWT2();
	}

}
