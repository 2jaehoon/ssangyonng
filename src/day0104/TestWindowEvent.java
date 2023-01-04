package day0104;

import java.awt.Frame;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestWindowEvent extends Frame {
	public TestWindowEvent(){
		super("윈도우 이벤트 연습");
		
		TestWindowListenerImpl wli =  new TestWindowListenerImpl(this);
		//이벤트 등록
		addWindowListener(wli);
		
		
		setBounds(1200, 200, 600, 400);
		
		setVisible(true);
		
	}//TestWindowEvent

	public static void main(String[] args) {
		new TestWindowEvent();
	}//main

}//class
