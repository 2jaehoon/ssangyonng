package day0103;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. Window Component 상속, 이벤트를 처리할 Listener 구현
public class TestEvent2 extends JFrame implements ActionListener{
	//2. 이벤트 처리와 관련 있는 interface를 선언
	private JTextField jtfName;
	private JTextArea jtaNameView;
	
	public TestEvent2() {
		super("여러 개의 레이아웃");
		
		//2. 컴포넌트를 선언
		JLabel jlblName = new JLabel("이름");
		jtfName = new JTextField(15);
		JButton jbtnAdd = new JButton("입력");
		jtaNameView = new JTextArea(); //j는 스크롤이 없음
		JScrollPane jspJtaNameView = new JScrollPane(jtaNameView);
		
		//프레임의 기본 레이아웃이 보더레이아웃이라 생략 가능
		
		
		//컴포넌트가 이벤트를 감지하기 위해서 이벤트 청쥐를 등록시킨다.
		//버튼은 클릭으로 액션이벤트가 발생하고
		jbtnAdd.addActionListener(this);
		//TextField는 엔터로 액션이벤트가 발생한다.
		jtfName.addActionListener(this);
		
		
		
		
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
		 add("North", jpNorth);
		add("Center", jspJtaNameView);
		
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
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//JTextField에서 값을 가져와서
		String text = jtfName.getText();
		//JTextArea에 값을 추가
		jtaNameView.append(text+"\n");
		//JTextField에 값을 초기화
		jtfName.setText("");//empty를 입력하면 값이 삭제되는 효과를 얻는다.
		
	}//actionPerformed

	public static void main(String[] args) {
		new TestEvent2();
	}//main


}//class
