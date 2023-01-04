package day0103;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import day0104.TestWindowEvent;

/**
 * 
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속, 이벤트 리스너 구현
public class TestEventCompare extends JFrame implements ActionListener{
	private JButton jbtn1;
	private JButton jbtn2;
	
	public TestEventCompare() {
		super("이벤트 비교~");
		//2. 사용할 컴퐇넌트를 생성
		 jbtn1 = new JButton("스윙버튼1");
		jbtn2 = new JButton("스윙버튼2");
		
		////////////////////////JVM이 사용자가 버튼을 눌렀는지 알수 있도록 이벤트 등록시킴////////////////////////////////////////////////////////
		setLayout(new GridLayout(2,1));
		
		
		
		//3. 컴포넌트를 윈도우 컴포넌트에 배치
		add(jbtn1);
		add(jbtn2);
		
		
		//이벤트 등록
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		
		
		//4. 윈도우 컴포넌트의 크기 설정
		setSize(400,400);
		//5. 사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestSwing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
//		System.out.println(ae.getSource()); 사용할 컴포넌트 주소 가져오긴
		//이벤트가 발생했을 때 사용자에게 제공할 코드
		if (ae.getSource() == jbtn1) {
			// btn이 눌렸을 때 제공할 코드
			System.out.println("버튼1");	
			new TestWindowEvent();
			}

		if (ae.getSource() == jbtn2) {
			// btn2가 눌렸을 때 제공할 코드
			System.out.println("버튼2");
		}
		
		
//		dispose();//버튼을 누르면 프로그램 종료
	}//actionPerformed

	public static void main(String[] args) {
		new TestEventCompare();

	}//main


}//class



