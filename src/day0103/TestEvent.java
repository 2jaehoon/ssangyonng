package day0103;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속, 이벤트 리스너 구현
public class TestEvent extends JFrame implements ActionListener{
	public TestEvent() {
		super("스윙~");
		//2. 사용할 컴퐇넌트를 생성
		JButton jbtn = new JButton("스윙버튼");
		
		////////////////////////JVM이 사용자가 버튼을 눌렀는지 알수 있도록 이벤트 등록시킴////////////////////////////////////////////////////////
		jbtn.addActionListener(this);//이벤트가 발생되었을 때 처리할 객체는 나 자신이다.
		
		//3. 컴포넌트를 윈도우 컴포넌트에 배치
		add(jbtn);
		//4. 윈도우 컴포넌트의 크기 설정
		setSize(400,400);
		//5. 사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestSwing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println(ae);
		//이벤트가 발생했을 때 사용자에게 제공할 코드
		System.out.println("아유 버튼 클릭하셨어요?");
		dispose();//버튼을 누르면 프로그램 종료
	}//actionPerformed

	public static void main(String[] args) {
		new TestEvent();

	}//main


}//class
