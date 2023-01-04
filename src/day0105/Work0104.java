package day0105;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Work0104 extends JFrame  {
	//이벤트 발생 인스턴스 변수로 설정
	private JMenuItem jmiNew;
	private JMenuItem jmiClose;
	private JMenuItem jmiOpen;
	private JMenuItem jmiSave;
	private JMenuItem jmiMemoinf;
	
	private JTextArea jta;

	public Work0104() {
		super("메모장 짭퉁");

		
		//컴포넌트 생성
		//메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		
		//메뉴 생성
		JMenu jmFile = new JMenu("파일");
		JMenu jmEmpty = new JMenu("비었다");
		JMenu jmWrite = new JMenu("서식");
		JMenu jmEmpty2 = new JMenu("비었다.");
		JMenu jmHelp = new JMenu("도움말");
		
		//아이템 생성
		 jmiNew = new JMenuItem("새글");
		 jmiClose = new JMenuItem("닫기");
		 jmiOpen = new JMenuItem("열기");
		 jmiSave = new JMenuItem("저장");
		
		jmiMemoinf = new JMenuItem("메모장 정보");
		
		 jta = new JTextArea();
		
		//배치
		//메뉴아이템을 메뉴에 배치
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiClose);
		
		jmHelp.add(jmiMemoinf);
		
		//메뉴를 메뉴바에 배치
		jmb.add(jmFile);
		jmb.add(jmEmpty);
		jmb.add(jmWrite);
		jmb.add(jmEmpty2);
		jmb.add(jmHelp);
		
		//메뉴바를 프레임에 배치
		setJMenuBar(jmb);
		
		add(jta);
		
		
		
		//이벤트 등록
		Work0104Evt we = new Work0104Evt(this);
		
		
		//이벤트 지정
		jmiNew.addActionListener(we);
		jmiClose.addActionListener(we);
		jmiOpen.addActionListener(we);
		jmiSave.addActionListener(we);
		jmiMemoinf.addActionListener(we);
		
		addWindowListener(we);
		
		
		//크기 설정
		setBounds(1200, 200, 600, 600);
		
		//가시화
		setVisible(true);

		
	}//Work0104
	
	//getter로 프라이빗 값 가져오기 work0104로
	public JMenuItem getJmiNew() {
		return jmiNew;
	}
	
	public JMenuItem getJmiClose() {
		return jmiClose;
	}
	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}
	public JMenuItem getJmiSave() {
		return jmiSave;
	}
	public JMenuItem getJmiMemoinf() {
		return jmiMemoinf;
	}
	
	public JTextArea getJta() {
		return jta;
	}
	

	
	

	public static void main(String[] args) {
		new Work0104();

	}//main

}//class
