package day0104;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {

	private JButton jbtnInput, jbtnMsg, jbtnConfirm;

	public UseJOptionPane() {
		super("JOptionPane 연습");
		jbtnInput = new JButton("jbtnInputDialog");
		jbtnMsg = new JButton("jbtnMsgDialog");
		jbtnConfirm = new JButton("jbtnConfirmDialog");

		JPanel jpNorth = new JPanel();
		jpNorth.add(jbtnInput);
		jpNorth.add(jbtnMsg);
		jpNorth.add(jbtnConfirm);

		// 이벤트 등록
		jbtnInput.addActionListener(this);
		jbtnMsg.addActionListener(this);
		jbtnConfirm.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}// windowClosing

		});

		// 배치
		add("North", jpNorth);

		// 크기 설정
		setBounds(100, 100, 400, 200);

		// 가시화
		setVisible(true);

	}// UseJOptionPane

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jbtnInput) {
			String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요!", "홍길동");
			JOptionPane.showMessageDialog(this, name + "님 안녕하세요?");
		}//end if

		if (ae.getSource() == jbtnMsg) {
//			JOptionPane.showMessageDialog(this, "오늘은 수요일입니다.");
			JOptionPane.showMessageDialog(this, "오늘은 수요일입니다.", "오늘의 요일은", 
					JOptionPane.PLAIN_MESSAGE);

		}//end if

		if (ae.getSource() == jbtnConfirm) {
			int flag = JOptionPane.showConfirmDialog(this, "정말 삭제하시겠습니까?");
			String msg = "";
			switch(flag) {//0,1,2
			case JOptionPane.OK_OPTION: msg = "삭제 진행하겠습니다."; break;
			case JOptionPane.NO_OPTION: msg = "삭제 하지 않습니다."; break;
			case JOptionPane.CANCEL_OPTION: msg = "작업 취소.";
			}//end switch
			JOptionPane.showMessageDialog(this, msg);
			
			
		}//end if

	}// actionPerformed

	public static void main(String[] args) {
		new UseJOptionPane();

	}// main

}// class
