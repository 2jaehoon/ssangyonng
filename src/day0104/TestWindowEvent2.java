package day0104;

import java.awt.Frame;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestWindowEvent2 extends Frame {
	TestWindowEvent2(){
		super("��� �̺�Ʈ ����");
		
		UseWindowAdaper uwa =  new UseWindowAdaper(this);
		//�̺�Ʈ ���
		addWindowListener(uwa);
		
		
		setBounds(1200, 200, 600, 400);
		
		setVisible(true);
		
	}//TestWindowEvent

	public static void main(String[] args) {
		new TestWindowEvent2();
	}//main

}//class
