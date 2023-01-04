package day0102;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseTextField extends JFrame {
	public UseTextField() {
		super("JTextComponent의 사용");
		
		//2. 컴포넌트 생성
		JTextField jtfld = new JTextField();
		JPasswordField jpf = new JPasswordField();
		JLabel jlblOutput = new JLabel("결과창");
		
		jpf.setEchoChar('*'); //비밀번호 가리막 바꾸기, 반향문자 설정
		 
		//TitledBorder 생성
		TitledBorder tbId = new TitledBorder("아이디");
		//컴포넌트에 설정
		jtfld.setBorder(tbId);
		
		//jpf.setBorder(new TitledBorder("비밀번호"));
		jpf.setBorder(new LineBorder(Color.red));
		jlblOutput.setBorder(new TitledBorder("출력창"));
		
		
		
		
		//1. MenuBar 생성
		JMenuBar jmb = new JMenuBar();

		//2. Menu 생성
		JMenu jm = new JMenu("메뉴에 들어갈 문자열");

		//3. MenuItem 생성
		JMenuItem jmi = new JMenuItem("메뉴 아이템에 들어갈 문자열");
		
		
		
		//3. 배치관리자 설정
		setLayout(new GridLayout(3,1));
		
		//4. 배치
		add(jtfld);
		add(jpf);
		add(jlblOutput);
		
		
		//5. 윈도우 크기 설정
		setBounds(1200, 200, 250, 200);
		
		//6. 가시화
		setVisible(true);
		
		//7. 종료이벤트처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseTextField

	private LayoutManager GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		new UseTextField();

	}//main

}//class
