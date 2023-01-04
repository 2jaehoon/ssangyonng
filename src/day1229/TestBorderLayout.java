package day1229;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * 동,서,남,북. 가운데의 배치를 가지는 자동배치 관리자
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속 (TestBorderLayout 클래스가 윈도우 컴포넌트가 된다.)
public class TestBorderLayout extends JFrame {
	
	public TestBorderLayout() {
		super("경계 레이아웃 연습.");
		//2. 사용할 컴포넌트를 생성.
		JButton jbtnNorth = new JButton("North-버튼");//클릭했을 때 일을 할 수 있는 컴포넌트
		JButton jbtnWest = new JButton("West-버튼");
		
		JLabel jlblEast = new JLabel("East-라벨");//단순한 메시지나 이름을 제공하는 컴포넌트 이름표
		JLabel jlblSouth = new JLabel("South-라벨");
		
		JTextArea jtaCenter = new JTextArea();//여러 줄의 텍스트를 입력할 수 있는 컴포넌트
		jtaCenter.setText("Center-JTextArea");
		
		//JButton JLabel JTextArea 를 눈에 보이는 컴포넌트를 Visual Component라고 한다.
		//3. 배치관리자를 설정 setLayout(new BorderLayout() );
		setLayout(new BorderLayout());  //BorderLayout 등 눈에 보이지 않는 컴포넌트는 Non-Visual Component라고 한다.
		
		//4. 배치 : add(컴포넌트명); BorderLayout의 Center에 배치가 된다.
		add("North", jbtnNorth);
		add(jlblSouth, "South");
		//BorderLayout의 Constant(상수)를 사용하여 설정
		add(BorderLayout.WEST,jbtnWest);
		add(jlblEast, BorderLayout.EAST);
		
		add("Center", jtaCenter);
		
		//5. 윈도우의 크기 설정
		setSize(400, 400);
		
		//6. 사용자에게 보여주기
		setVisible(true);
		
		//7. 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//TestBorderLayout

	public static void main(String[] args) {
		new TestBorderLayout();

	}//main

}
