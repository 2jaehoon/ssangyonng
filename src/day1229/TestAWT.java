package day1229;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Window;

@SuppressWarnings("serial")
//1. ������ ������Ʈ�� ���
public class TestAWT extends Window {

	public TestAWT(Frame f) {
		super(f);// ��! �θ�Ŭ������ �⺻�����ڰ� ���� error
		//2. =������Ʈ�� ����
		Button btn= new Button("��ư");
		//3. ������Ʈ ��ġ > �����ӿ� ��ġ
		f.add(btn);
		// 4������ ũ�� ����
		f.setSize(300, 300);
		//5. �������� ����ڿ��� �����ش�.
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Frame f = new Frame();
		new TestAWT(f);
	}

}
