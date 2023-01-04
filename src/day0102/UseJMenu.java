package day0102;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
		//1. 윈도우 컴포넌트 상속
public class UseJMenu extends JFrame {
	public UseJMenu() {
		super("메뉴연습");
		//2. 컴포넌트 생성
		//메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		
		//메뉴 생성
		JMenu jmFile = new JMenu("파일");
		JMenu jmhelp = new JMenu("도움말");
		
		//메뉴 아이템 생성
		JMenuItem jmiNew = new JMenuItem("새글");
		JMenuItem jmiOpen = new JMenuItem("열기");
		JMenuItem jmiSave = new JMenuItem("저장");
		JMenuItem jmiInfo = new JMenuItem("정보");
		
		
		//3. 배치
		//메뉴아이템 -> 메뉴 배치
		
		
		jmFile.add(jmiNew);
		jmFile.addSeparator();
		
		jmFile.add(jmiOpen);
		jmFile.addSeparator();
		
		jmFile.add(jmiSave);
		
		
		jmhelp.add(jmiInfo);
	
		
		//메뉴 -> 메뉴바 배치
		jmb.add(jmFile);
		jmb.add(jmhelp);
		
		
		//메뉴바를 Frame에 배치
		setJMenuBar(jmb);
		
		//4. 크기 설정
		setBounds(1200, 200, 600, 600);
		
		
		
		//5. 가시화
		setVisible(true);
		
		//6. 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseJMenu

	public static void main(String[] args) {
		new UseJMenu();
		
	}//main

}//class
