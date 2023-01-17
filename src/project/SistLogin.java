package project;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class SistLogin extends JFrame {
	//이벤트에서 사용할 컴포넌트 인스턴스 변수로 만듬
	private JButton jbtnLogin;
	private ImageIcon sistImage;
	private JLabel jlblId;
	private JLabel jlblPw;
	private JLabel jlblSist;
	private JTextField jtfId;
	private JTextField jtfPw;
	


	public SistLogin() {
		super("로그인");
		
		//2. 컴포넌트 생성
		jbtnLogin = new JButton("로그인");
		sistImage = new ImageIcon("e:/dev/img.png");
		jlblId = new JLabel("아이디에용");
		jlblPw = new JLabel("비밀번호에요");
		jlblSist = new JLabel(sistImage);
		jtfId = new JTextField();
		jtfPw = new JTextField();
		
		//3. 배치 수동
		setLayout(null);
		
		
		//폰트 변경
		
		
		
		
		
		//크기 설정
		jlblSist.setBounds(45, 0, 500, 500);
		jbtnLogin.setBounds(400,680,150,50);
		jlblId.setBounds(100,510,100,50);
		jtfId.setBounds(250, 510, 200, 50);
		jlblPw.setBounds(100, 580, 100, 50);
		jtfPw.setBounds(250, 580, 200, 50);
		
		//이벤트 처리
		SistLoginEvt sle = new SistLoginEvt(this);
		
		//이벤트 지정
		jbtnLogin.addActionListener(sle);
		
		
		
		
		
		
		//배치
		add(jlblSist);
		add(jbtnLogin);
		add(jlblId);
		add(jtfId);
		add(jlblPw);
		add(jtfPw);
		
		
		
		//
		
		
		//윈도우 크기 설정
		setBounds(50, 50, 600, 800);
		
		
		
		//가시화
		setVisible(true);
		
		//종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
	}//SistLogin


	public JTextField getJtfId() {
		return jtfId;
	}



	public JButton getJbtnLogin() {
		return jbtnLogin;
	}


	


	public JTextField getJtfPw() {
		return jtfPw;
	}



	
	
	
	

}//JFrame
