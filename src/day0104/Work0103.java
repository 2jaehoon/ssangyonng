package day0104;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
		//1. 윈도우 컴포넌트 상속
public class Work0103 extends JFrame implements ActionListener{
	//이벤트에서 사용할 컴포넌트 인스턴스 변수로 만듬
	private JMenuItem jmiNew;
	private JMenuItem jmiOpen;
	private JMenuItem jmiExit;
	private JTextArea jta;
	
	public Work0103() {
		super("메뉴연습");
		//2. 컴포넌트 생성
		//메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		
		//메뉴 생성
		JMenu jmFile = new JMenu("파일");
		JMenu jmhelp = new JMenu("도움말");
		
		//메뉴 아이템 생성
		 jmiNew = new JMenuItem("새글");
		 jmiOpen = new JMenuItem("열기");
		 jmiExit = new JMenuItem("닫기");
		JMenuItem jmiInfo = new JMenuItem("정보");
		
		jta = new JTextArea();
		
		
		//3. 배치
		//메뉴아이템 -> 메뉴 배치
		
		
		jmFile.add(jmiNew);
		jmFile.addSeparator();
		
		jmFile.add(jmiOpen);
		jmFile.addSeparator();
		
		jmFile.add(jmiExit);
		
		
		jmhelp.add(jmiInfo);
	
		
		//메뉴 -> 메뉴바 배치
		jmb.add(jmFile);
		jmb.add(jmhelp);
		
		
		//메뉴바를 Frame에 배치
		setJMenuBar(jmb);
		
		add(jta);
		
		
		//이벤트 지정
		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiExit.addActionListener(this);
		
		
		
		//4. 크기 설정
		setBounds(1200, 200, 600, 600);
		
		
		
		//5. 가시화
		setVisible(true);
		
		//6. 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJMenu
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jmiNew) {
			// miNew이 눌렸을 때 제공할 코드
			//jta의 텍스트 값을 초기화
			jta.setText("");
			}

		if (ae.getSource() == jmiOpen) {
			// jmiOpen가 눌렸을 때 제공할 코드
			//jta에 열기 값 추가
			jta.append("열기");
		}
		if (ae.getSource() == jmiExit) {
			// jmiExit가 눌렸을 때 제공할 코드
			//닫기
			dispose();
		}
		
		
	}

	public static void main(String[] args) {
		new Work0103();
		
	}//main


}//class
