package day0102;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

@SuppressWarnings("serial")
public class UseManualLayout extends JFrame {
		//1. 윈도우 컴포넌트 상속
	public UseManualLayout() {
		super("수동배치");
		
		//2. 컴포넌트의 생성
		JButton jbtn = new JButton("버튼");
		
		Vector<String> vec = new Vector<String>();
		vec.add("김경태");
		vec.add("김규미");
		vec.add("김보경");
		vec.add("모민경");		
		JList<String> jlist = new JList<String>(vec);
		
		JLabel jlbl = new JLabel("라벨");
		jlbl.setBackground(Color.pink);
		jlbl.setOpaque(true); //불투명도
		
		//3. 좌표 설정
		jbtn.setLocation(100, 40);
		
		//4. 크기 설정
		jbtn.setSize(80,40);
		
		jlist.setBounds(180, 80, 250, 100);
		jlbl.setBounds(430, 180, 90, 30);
		
		//5. 배치관리자 해제 (BorderLayout 기본 레이아웃)
		setLayout(null);
		
		//6. 배치
		add(jbtn);
		add(jlist);
		add(jlbl);
		
		//7. 윈도우 크기 설정
		setBounds(1200,200, 600, 400);
		
		//8. 보여주기
		setVisible(true);
		
		//9. 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseManualLayout
	

	public static void main(String[] args) {
		new UseManualLayout();

	}//main

}//class
