package day0104;

import java.awt.Frame;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseFileDialog extends JFrame {
	
	private JButton jbtnFileOpen;
	private JButton jbtnFileSave;
	
	public UseFileDialog(){
		super("파일 다이어로그 연습 ");
			
		jbtnFileOpen = new JButton("파일 열기");
		jbtnFileSave = new JButton("파일 저장");
		
		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtnFileOpen);
		jpCenter.add(jbtnFileSave);
		
		
		//이벤트 등록
		UseFileDialogEvt ufde = new UseFileDialogEvt(this);
		
		//버튼 이벤트
		jbtnFileOpen.addActionListener(ufde);
		//입력된 ufde객체가 override한  actionperformed method가 호출
		jbtnFileSave.addActionListener(ufde);
		//입력된 ufde객체가 오버라이드한 windowClosing method가 호출
	
		
		addWindowListener(ufde);
		
		add(jpCenter);
		
	
		
		setBounds(1200, 200, 600, 400);
		
		setVisible(true);
		
	}//TestWindowEvent
	
	
	

	public JButton getJbtnFileOpen() {
		return jbtnFileOpen;
	}




	public JButton getJbtnFileSave() {
		return jbtnFileSave;
	}




	public static void main(String[] args) {
		new UseFileDialog();
		JOptionPane.showInputDialog("입력");
		JOptionPane.showMessageDialog(null, "안녕하세요");
		JOptionPane.showConfirmDialog(null, "안녕하세요");
		
	}//main

}//class
