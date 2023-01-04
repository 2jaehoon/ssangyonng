package day0102;

import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. Window Component 상속
public class UseMultiLayout extends JFrame {
	
	public UseMultiLayout() {
		super("여러 개의 레이아웃");
		
		//2. 컴포넌트를 선언
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(15);
		JButton jbtnAdd = new JButton("입력");
		
		JTextArea jtaNameView = new JTextArea(); //j는 스크롤이 없음
		
		//프레임의 기본 레이아웃이 보더레이아웃이라 생략 가능
		
		//3. 배치 
		//깔리고 깔리고 깔려있어서 마지막에 들어온 게 위에 보인다.
//		add("North", jlblName);
//		add("North", jtfName);
//		add("North", jbtnAdd);
		
		//컨테이너 컴포넌트를 사용해야 한다. 복합 디자인을 하기 위해선
		 JPanel jpNorth =  new JPanel(); //FlowLayout
		 jpNorth.add(jlblName);
		 jpNorth.add(jtfName);
		 jpNorth.add(jbtnAdd);
		
		 //여러 개의 컴포넌트를 가진 JPanel을 윈도우 컴포넌트에 배치
		 add("South", jpNorth);
		add("Center", jtaNameView);
		
		//4. 윈도우 크기 설정
		//setSize(400, 300);
		//위치 설정(컴포넌트 클래스에서 상속받음)
		//setLocation(1200, 200);
		//크기,위치 한번에 설정
		setBounds(1200, 200, 400, 300);
		
		//5. 사용자에게 보여주기
		setVisible(true);
		
		//6. 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseMultiLayout

	public static void main(String[] args) {
		new UseMultiLayout();
	}//main

}//class
