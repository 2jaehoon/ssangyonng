package day0104;

import java.awt.Frame;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestWindowEvent extends Frame {
	public TestWindowEvent(){
		super("������ �̺�Ʈ ����");
		
		TestWindowListenerImpl wli =  new TestWindowListenerImpl(this);
		//�̺�Ʈ ���
		addWindowListener(wli);
		
		
		setBounds(1200, 200, 600, 400);
		
		setVisible(true);
		
	}//TestWindowEvent

	public static void main(String[] args) {
		new TestWindowEvent();
	}//main

}//class
