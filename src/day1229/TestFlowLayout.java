package day1229;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class TestFlowLayout extends JFrame {
	
	public TestFlowLayout() {
		super("FlowLayout 연습");
		//2. 컴포넌트 생성
		JButton jbtn = new JButton("버튼");
		JCheckBox jcb = new JCheckBox("로그인 유지");
		//Visual Component 
		JRadioButton jrbM = new JRadioButton("남자");
		JRadioButton jrbF = new JRadioButton("여자");
		
		//RadioButton은 Group으로 묶이지 않으면 모두 선택된다.
		ButtonGroup bg = new ButtonGroup();//Non-Visual Component
		bg.add(jrbM);
		bg.add(jrbF);
		
		JTextField jtf = new JTextField(10);
		
		//3. 배치관리자를 변경 BorderLayout => FlowLayout
		setLayout(new FlowLayout());
		
		//4. 배치
		add(jbtn); //컴포넌트는 add배치되는 순서대로 고유크기를 가지고 배치된다.
		add(jcb); //컴포넌트는 add배치되는 순서대로 고유크기를 가지고 배치된다.
		add(jrbM); //컴포넌트는 add배치되는 순서대로 고유크기를 가지고 배치된다.
		add(jrbF); //컴포넌트는 add배치되는 순서대로 고유크기를 가지고 배치된다.
		add(jtf); //컴포넌트는 add배치되는 순서대로 고유크기를 가지고 배치된다.
		
		//5. 윈도우 크기 설정
		setSize(600, 300);
		
		//6. 가시화
		setVisible(true);
		
		//7. 윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//TestFlowLayout

	public static void main(String[] args) {
		new TestFlowLayout();
	}//main

}//class
