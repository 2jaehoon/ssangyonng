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
		super("���̷α� ���� �θ�â");
			
		jbtn = new JButton("�ڽ� â ����");
		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtn);
		
		
		//�̺�Ʈ ���
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
