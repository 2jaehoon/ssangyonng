package project;

import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ViewPrint extends JDialog {
	private JButton jbtnClose;
	private JTextArea jtaView;
	private SelectDialogEvt sde;
	
	
	

	
	
	public ViewPrint(SelectDialog sd, SelectDialogEvt sde) {
		super(sd, sd.getTitle(),true); //get타이틀로 제목 받아오는 거 가능
		
		
		
		
		
		jbtnClose = new JButton("닫기");
		jtaView = new JTextArea( "이 메모장은 자바언어로 만들어진\n"
				+ "메모장으로 License는 \n"
				+ "PL(Public License)로 자유롭게 \n"
				+ "배포하고 사용하실 수 있습니다.\n"
				+ "작성자 이재훈\n"+sde.abc()
				+ "");/////////////////여기에 리턴 메소드로 넣어 줄것 보이드 메소드 다 없애기 아니면 다른 방법을 생각해보기
		
		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtnClose);
		
		add("South",jpSouth);
		add("Center",jtaView);
		
		setBounds(sd.getX()+100, sd.getY()+50, 300, 200);
		setVisible( true );
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		
		
	}//ViewPrint
	
	
	
	
	

}//class
