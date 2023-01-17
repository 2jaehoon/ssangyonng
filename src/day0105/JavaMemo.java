package day0105;

import java.awt.Font;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemo extends JFrame {
	// 이벤트 발생 인스턴스 변수로 설정
	private JMenuItem jmiNew;
	private JMenuItem jmiOpen;
	private JMenuItem jmiSave;
	private JMenuItem jmiNewSave;
	private JMenuItem jmiClose;
	private JMenuItem jmiFont;
	private JMenuItem jmiHelp;

	static JTextArea jtaNote;

	public JavaMemo() {
		super("메모장 짭퉁");

		// 컴포넌트 생성
		// 메뉴바 생성
		JMenuBar jmb = new JMenuBar();

		// 메뉴 생성
		JMenu jmFile = new JMenu("파일");
		JMenu jmEmpty = new JMenu("편집");
		JMenu jmWrite = new JMenu("서식");
		JMenu jmEmpty2 = new JMenu("보기");
		JMenu jmHelp = new JMenu("도움말");

		// 아이템 생성
		jmiNew = new JMenuItem("새글");
		jmiClose = new JMenuItem("닫기");
		jmiOpen = new JMenuItem("열기");
		jmiSave = new JMenuItem("저장");
		jmiNewSave = new JMenuItem("다른 이름으로 저장");

		jmiFont = new JMenuItem("글꼴");

		jmiHelp = new JMenuItem("메모장 정보");

		jtaNote = new JTextArea("");

		// 배치
		// 메뉴아이템을 메뉴에 배치
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiNewSave);
		jmFile.add(jmiClose);

		jmWrite.add(jmiFont);

		jmHelp.add(jmiHelp);

		// 메뉴를 메뉴바에 배치
		jmb.add(jmFile);
		jmb.add(jmEmpty);
		jmb.add(jmWrite);
		jmb.add(jmEmpty2);
		jmb.add(jmHelp);

		// 메뉴바를 프레임에 배치
		setJMenuBar(jmb);

		add(jtaNote);

		// 이벤트 등록

		JavaMemoEvt jme = new JavaMemoEvt(this);
		JavaMemoFontEvt fmfe = new JavaMemoFontEvt(this);
		
		// 이벤트 지정
		jmiNew.addActionListener(jme);
		jmiClose.addActionListener(jme);
		jmiOpen.addActionListener(jme);
		jmiSave.addActionListener(jme);
		jmiNewSave.addActionListener(jme);

		jmiFont.addActionListener(jme);
		jmiHelp.addActionListener(jme);

		addWindowListener(jme);

		// 크기 설정
		setBounds(800, 100, 1000, 800);

		// 가시화
		setVisible(true);
		
		
		
		

	}// JavaMemo

	// getter로 프라이빗 값 가져오기
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
	
	public JMenuItem getJmiNewSave() {
		return jmiNewSave;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getjmiHelp() {
		return jmiHelp;
	}

	public JTextArea getjtaNote() {
		return jtaNote;
	}

}// class
