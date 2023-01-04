package day1229;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class TestGridLayout extends JFrame {
	
	public TestGridLayout() {
		super("격자레이아웃"); //title bar에 설정
		//2.컴포넌트 생성
		JButton jbtn1 = new JButton("버튼1");
		JButton jbtn2 = new JButton("버튼2");
		JButton jbtn3 = new JButton("버튼3");
		
		JComboBox<String> jcb1 = new JComboBox<String>("김경태, 김규미, 김보경".split(","));
		JComboBox<String> jcb2 = new JComboBox<String>("모민경, 박진호, 임태영".split(","));
		JComboBox<String> jcb3 = new JComboBox<String>("윤상준, 윤지원, 이길헌, 이단군".split(","));
		
		//3.배치관리자 설정
		setLayout(new GridLayout(3,2));
		
		//4. 배치
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jcb1);
		add(jcb2);
		add(jcb3);

		
		//5. 윈도우 크기 설정
		setSize(300, 300);
		
		//6. 가시화
		setVisible(true);
		
		//7. 윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//TestGridLayout

	public static void main(String[] args) {
		new TestGridLayout();

	}//main

}//class
