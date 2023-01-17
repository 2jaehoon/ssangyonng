package day0105;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MemoInfo extends JDialog {
	private JButton jbtnClose;
	private JTextArea jtaInfo;
	
	
	public MemoInfo (JavaMemo jm) {
	super(jm, "메모장 정보",true);
	
	jbtnClose = new JButton("닫기");
	jtaInfo = new JTextArea("이 메모장은 자바언어로 만들어진\n"
			+ "메모장으로 License는 \n"
			+ "PL(Public License)로 자유롭게 \n"
			+ "배포하고 사용하실 수 있습니다.\n"
			+ "작성자 이재훈\n"
			+ "");
	
	JPanel jpSouth = new JPanel();
	jpSouth.add(jbtnClose);
	
	add("South", jpSouth);
	add("Center", jtaInfo);
	
	jbtnClose.addActionListener(new MemoInfoEvt(this));
	
	setBounds(jm.getX()+100, jm.getY()+50, 300, 200);
	setVisible(true);
		
		
	}//MemoInfo
	

}//class
