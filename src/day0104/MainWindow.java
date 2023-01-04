package day0104;

import java.awt.Frame;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	private JButton jbtn;
	public MainWindow(){
		super("다이로그 연습 부모창");
			
		jbtn = new JButton("자식 창 열기");
		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtn);
		
		
		//이벤트 등록
		MainWindowEvt mwe = new MainWindowEvt(this);
		jbtn.addActionListener(mwe);
		
		addWindowListener(mwe);
		
		add(jpCenter);
		
	
		
		setBounds(1200, 200, 600, 400);
		
		setVisible(true);
		
	}//TestWindowEvent

	public static void main(String[] args) {
		new MainWindow();
	}//main

}//class
