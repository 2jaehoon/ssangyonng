package day1229;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. jFrame을 상속
public class TestSwing extends JFrame {
	public TestSwing() {
		super("스윙~");
		//2. 사용할 컴퐇넌트를 생성
		JButton jbtn = new JButton("스윙버튼");
		
		//3. 컴포넌트를 윈도우 컴포넌트에 배치
		add(jbtn);
		//4. 윈도우 컴포넌트의 크기 설정
		setSize(400,400);
		//5. 사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestSwing

	public static void main(String[] args) {
		new TestSwing();

	}//main

}//class
